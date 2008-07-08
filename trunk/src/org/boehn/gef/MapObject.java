package org.boehn.gef;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.boehn.gef.coordinates.CartesianCoordinate;
import org.boehn.gef.coordinates.EarthCoordinate;
import org.boehn.gef.coordinates.TimeAndPlace;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xmlpull.v1.XmlSerializer;

public class MapObject implements ModelElement {

	private String name;
	private String description;
	private EarthCoordinate location;
	private MapObjectClass mapObjectClass;
	private List<Button> buttons;
	private List<TimeAndPlace> movements;
	private String snippet;
	private Boolean visibility;
	
	private Double rotation;
	private CartesianCoordinate localReferenceCoordinate;
	private CartesianCoordinate scale;
	
	public MapObject() {}
	
	public MapObject(String name) {
		this.name = name;
	}
	
	public MapObject(MapObjectClass mapObjectClass) {
		this.mapObjectClass = mapObjectClass;
	}
	
	public MapObject(String name, MapObjectClass mapObjectClass) {
		this.name = name;
		this.mapObjectClass = mapObjectClass;
	}

	public MapObjectClass getMapObjectClass() {
		return mapObjectClass;
	}

	public void setMapObjectClass(MapObjectClass mapObjectClass) {
		this.mapObjectClass = mapObjectClass;
	}

	public CartesianCoordinate getLocalReferenceCoordinate() {
		return localReferenceCoordinate;
	}

	public void setLocalReferenceCoordinate(
			CartesianCoordinate localReferenceCoordinate) {
		this.localReferenceCoordinate = localReferenceCoordinate;
	}

	public Double getRotation() {
		return rotation;
	}

	public void setRotation(Double rotation) {
		this.rotation = rotation;
	}

	public CartesianCoordinate getScale() {
		return scale;
	}

	public void setScale(CartesianCoordinate scale) {
		this.scale = scale;
	}

	public Boolean getVisibility() {
		return visibility;
	}

	public void setVisibility(Boolean visibility) {
		this.visibility = visibility;
	}

	public void setButtons(List<Button> buttons) {
		this.buttons = buttons;
	}
	
	public void addButton(Button button) {
		if (buttons == null) {
			buttons = new ArrayList<Button>();
		}
		buttons.add(button);
	}
	
	public void addButtons(List<Button> buttons) {
		if (this.buttons == null) {
			this.buttons = buttons;
		} else {
			this.buttons.addAll(buttons);
		}
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescriptionTextWithButtons(Model model) {
		StringBuffer result = new StringBuffer();
		if (buttons != null) {
			for (Button button : buttons) {
				result.append(button.toHtml(model) + "<br />");
			}
		}
		if (description != null) {
			result.append(description);
		}
		
		return (result.length() == 0) ? null : result.toString();
	}

	public EarthCoordinate getLocation() {
		return location;
	}

	public void setLocation(EarthCoordinate earthCoordinate) {
		this.location = earthCoordinate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSnippet() {
		return snippet;
	}

	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}

	public void addKml(Element parentElement, Model model, Document xmlDocument) throws ModelException {
		
		Element placemarkElement = xmlDocument.createElement("Placemark");
		
		if (name != null) {
			Element nameElement = xmlDocument.createElement("name");
			nameElement.appendChild(xmlDocument.createTextNode(name));
			placemarkElement.appendChild(nameElement);
		}
		
		if (snippet != null) {
			Element snippetElement = xmlDocument.createElement("Snippet");
			snippetElement.appendChild(xmlDocument.createTextNode(snippet));
			placemarkElement.appendChild(snippetElement);
		}
		
		String descriptionText = getDescriptionTextWithButtons(model);
		if (descriptionText != null) {
			Element descriptionElement = xmlDocument.createElement("description");
			descriptionElement.appendChild(xmlDocument.createCDATASection(descriptionText));
			placemarkElement.appendChild(descriptionElement);
		}
				
		if (mapObjectClass != null) {
			
			mapObjectClass.addKml(this, parentElement, model, xmlDocument, location, rotation, localReferenceCoordinate, scale, name);
			
			if (mapObjectClass.getStyleUrl() != null || mapObjectClass.getStyle() != null) {
				Element styleUrlElement = xmlDocument.createElement("styleUrl");
				styleUrlElement.appendChild(xmlDocument.createTextNode((mapObjectClass.getStyleUrl() != null ? mapObjectClass.getStyleUrl() : "#" + mapObjectClass.getStyle().getId())));
				placemarkElement.appendChild(styleUrlElement);
			}
		}
		
		if (location != null) {
			location.addKml(placemarkElement, model, xmlDocument);
		}
		
		if (visibility != null) {
			Element visibilityElement = xmlDocument.createElement("visibility");
			visibilityElement.appendChild(xmlDocument.createTextNode((visibility) ? "1" : "0"));
			placemarkElement.appendChild(visibilityElement);
		}
		
		parentElement.appendChild(placemarkElement);
	}

	public void addKmlXPP(Model model, XmlSerializer serializer) throws IllegalArgumentException, IllegalStateException, IOException {
		// TODO this is a temp method for speed testing
		serializer.startTag(null, "Placemark");
		
		if (name != null) {
			serializer.startTag(null, "name");
			serializer.text(name);
			serializer.endTag(null, "name");
		}
		
		String descriptionText = getDescriptionTextWithButtons(model);
		if (descriptionText != null) {
			serializer.startTag(null, "description");
			serializer.cdsect(descriptionText);
			serializer.endTag(null, "description");
		}
		
		if (location != null) {
			location.addKmlXPP(model, serializer);
		}
		serializer.endTag(null, "Placemark");
	}

	public void addKmlDirect(Model model, Writer writer) throws IOException {
		// TODO this is a temp method for speed testing
		writer.write("<Placemark>");
		
		if (name != null) {
			writer.write("<name>" + name + "</name>");
		}
		
		String descriptionText = getDescriptionTextWithButtons(model);
		if (descriptionText != null) {
			writer.write("<description>" + descriptionText + "</description>");
		}
		
		if (location != null) {
			location.addKmlDirect(model, writer);
		}
		writer.write("</Placemark>");
	}

	public List<TimeAndPlace> getMovements() {
		return movements;
	}

	public void setMovements(List<TimeAndPlace> movements) {
		this.movements = movements;
	}
	
	public void addMovement(TimeAndPlace movement) {
		if (this.movements == null) {
			this.movements = new ArrayList<TimeAndPlace>();
		}
		this.movements.add(movement);
	}
	
	public String toString() {
		StringBuffer text = new StringBuffer("MapObject:\n");
		text.append("   name: '" + name + "'\n");
		text.append("   description: '" + description + "'\n");
		text.append("   rotation: " + rotation + "\n");
		text.append("   scale: " + scale + "\n");
		text.append("   localReferenceCoordinate: " + localReferenceCoordinate + "\n");
		text.append("   location: " + location + "\n");
		text.append("   buttons: " + buttons + "\n");
		text.append("   movements: " + movements + "\n");
		text.append("   mapObjectClass: " + mapObjectClass + "\n");
		return text.toString();
	}
	
}
