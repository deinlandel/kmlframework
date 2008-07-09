package org.boehn.kmlframework;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.boehn.kmlframework.coordinates.CartesianCoordinate;
import org.boehn.kmlframework.coordinates.EarthCoordinate;
import org.boehn.kmlframework.coordinates.TimeAndPlace;
import org.boehn.kmlframework.style.Style;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class MapObjectClass {

	private String className;
	private List<GraphicalModel> models;
	private boolean showTail = true;
	private boolean showModels = true;
	private Integer visibleFrom;
	private Integer visibleTo;
	private Integer tailHistoryLimit;
	private Integer tailVisibleFrom;
	private Integer tailVisibleTo;
	private String styleUrl;
	private Style style;
	
	public MapObjectClass(String className) {
		this.className = className;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<GraphicalModel> getModels() {
		return models;
	}

	public void setModels(List<GraphicalModel> models) {
		this.models = models;
	}
	
	public void addModel(GraphicalModel model) {
		if (models == null) {
			models = new ArrayList<GraphicalModel>();
		}
		models.add(model);
	}
	
	public void addModels(List<GraphicalModel> models) {
		if (this.models == null) {
			this.models = models;
		} else {
			this.models.addAll(models);
		}
	}

	public Integer getVisibleFrom() {
		return visibleFrom;
	}

	public void setVisibleFrom(Integer visibleFrom) {
		this.visibleFrom = visibleFrom;
	}

	public Integer getVisibleTo() {
		return visibleTo;
	}

	public void setVisibleTo(Integer visibleTo) {
		this.visibleTo = visibleTo;
	}

	public String getStyleUrl() {
		return styleUrl;
	}

	public void setStyleUrl(String styleUrl) {
		this.styleUrl = styleUrl;
		// styleUrl and style cannot be set at the same time
		this.style = null;
	}

	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
		// styleUrl and style cannot be set at the same time
		this.styleUrl = null;
	}

	public boolean getShowModels() {
		return showModels;
	}

	public void setShowModels(boolean showModel) {
		this.showModels = showModel;
	}

	public boolean getShowTail() {
		return showTail;
	}

	public void setShowTail(boolean showTail) {
		this.showTail = showTail;
	}

	public Integer getTailVisibleFrom() {
		return tailVisibleFrom;
	}

	public void setTailVisibleFrom(Integer tailVisibleFrom) {
		this.tailVisibleFrom = tailVisibleFrom;
	}

	public Integer getTailVisibleTo() {
		return tailVisibleTo;
	}

	public void setTailVisibleTo(Integer tailVisibleTo) {
		this.tailVisibleTo = tailVisibleTo;
	}

	public Integer getTailHistoryLimit() {
		return tailHistoryLimit;
	}

	public void setTailHistoryLimit(Integer tailHistoryLimit) {
		this.tailHistoryLimit = tailHistoryLimit;
	}
	
	public void addKml(MapObject mapObject, Element parentElement, Model model, Document xmlDocument, EarthCoordinate location, Double rotation, CartesianCoordinate localReferenceCoordinate, CartesianCoordinate scale, String name) throws ModelException {
		if (models != null || (mapObject.getMovements() != null && showTail)) {
			
			boolean objectHasGraphicalElementToDraw = false;
			
			Element multiGeometryElement = xmlDocument.createElement("MultiGeometry");
			// If we are going to draw a tail after this MapObject, we have to add another model containing the tail. We cannot add this
			// model to models, because then it will be added to all MapObject using this MapObject class. Thus we have to make a new list
			List<GraphicalModel> graphicalModelsTemp;
			if (mapObject.getMovements() == null || !showTail) {
				graphicalModelsTemp = models;
			} else {
				graphicalModelsTemp = new ArrayList<GraphicalModel>(models);
				GraphicalModel graphicalModel = new GraphicalModel();
				Path path = new Path();
				path.addCoordinate(location);
				
				// We stop drawing the tail if passing the timeHistoryLimit
				Date timeHistoryLimitAbsolute;
				if (tailHistoryLimit != null) {
					GregorianCalendar calendar = new GregorianCalendar();
					calendar.add(Calendar.SECOND, -tailHistoryLimit);
					timeHistoryLimitAbsolute = calendar.getTime();
				} else {
					timeHistoryLimitAbsolute = null;
				}
				
				for (TimeAndPlace timeAndPlace : mapObject.getMovements()) {
					if (timeHistoryLimitAbsolute != null && timeHistoryLimitAbsolute.after(timeAndPlace.getTime())) {
						// We stop drawing the tail because the tail history has passed the timeHistoryLimit
						break;
					}
					path.addCoordinate(timeAndPlace.getPlace());
				}
				graphicalModel.addGraphicalModelElement(path);
				graphicalModel.setVisibleFrom(tailVisibleFrom);
				graphicalModel.setVisibleTo(tailVisibleTo);
				graphicalModelsTemp.add(graphicalModel);
			}
			Double distanceToObserver = (model.getObserver() != null && mapObject.getLocation() != null) ? model.getObserver().distanceTo(mapObject.getLocation()) : null;
			for (GraphicalModel graphicalModel : graphicalModelsTemp) {
				if (!model.ENABLE_DETAILS_DEPENDS_ON_DISTANCE_TO_OBSERVER || (distanceToObserver == null || (graphicalModel.getVisibleTo() == null || graphicalModel.getVisibleTo() > distanceToObserver) && (graphicalModel.getVisibleFrom() == null || graphicalModel.getVisibleFrom() < distanceToObserver))) {
					graphicalModel.addKml(multiGeometryElement, model, xmlDocument, location, rotation, localReferenceCoordinate, scale);
					objectHasGraphicalElementToDraw = true;
				}
			}

			if (objectHasGraphicalElementToDraw) {
				Element placemarkElement = xmlDocument.createElement("Placemark");
				Element nameElement = xmlDocument.createElement("name");
				nameElement.appendChild(xmlDocument.createTextNode((name != null) ? name + " model" : "model"));
				placemarkElement.appendChild(nameElement);
				if (styleUrl != null || style != null) {
					Element styleUrlElement = xmlDocument.createElement("styleUrl");
					styleUrlElement.appendChild(xmlDocument.createTextNode((styleUrl != null ? styleUrl : "#" + style.getId())));
					placemarkElement.appendChild(styleUrlElement);
				}
				placemarkElement.appendChild(multiGeometryElement);
				parentElement.appendChild(placemarkElement);
			}
		}
	}
	
	public String toString() {
		StringBuffer text = new StringBuffer("MapObjectClass:\n");
		text.append("   className: '" + className + "'\n");
		text.append("   styleUrl: '" + styleUrl + "'\n");
		text.append("   models: " + models + "\n");
		text.append("   showModels: " + showModels + "\n");
		text.append("   showTail: " + showTail + "\n");
		text.append("   tailVisibleFrom: " + tailVisibleFrom + "\n");
		text.append("   tailVisibleTo: " + tailVisibleTo + "\n");
		text.append("   timeHistoryLimit: " + tailHistoryLimit + "\n");
		return text.toString();
	}
}
