package org.boehn.kmlframework;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xmlpull.v1.XmlSerializer;

public class Folder implements ModelElement {
	
	private Collection<ModelElement> modelElements;
	private ViewPosition viewPosition;
	private String name;
	private String description;
	private Boolean visibility;
	
	public Folder() {}
	
	public Folder(String name) {
		this.name = name;
	}
	
	public ViewPosition getViewPosition() {
		return viewPosition;
	}
	
	public void setViewPosition(ViewPosition viewPosition) {
		this.viewPosition = viewPosition;
	}
	
	public Collection<ModelElement> getModelElements() {
		return modelElements;
	}
	
	public void setModelElements(Collection<ModelElement> modelElements) {
		this.modelElements = modelElements;
	}
	
	public void add(ModelElement element) {
		if (modelElements == null) {
			modelElements = new ArrayList<ModelElement>();
		}
		modelElements.add(element);
	}
	
	public void add(Collection<ModelElement> modelElements) {
		if (this.modelElements == null) {
			this.modelElements = modelElements;
		} else {
			this.modelElements.addAll(modelElements);
		}
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Boolean getVisibility() {
		return visibility;
	}
	
	public void setVisibility(Boolean visibility) {
		this.visibility = visibility;
	}
	
	public void addKml(Element parentElement, Model model, Document xmlDocument) throws ModelException {
		Element folderElement = xmlDocument.createElement("Folder");
		
		if (name != null) {
			Element nameElement = xmlDocument.createElement("name");
			nameElement.appendChild(xmlDocument.createTextNode(name));
			folderElement.appendChild(nameElement);
		}
		
		if (description != null) {
			Element descriptionElement = xmlDocument.createElement("description");
			descriptionElement.appendChild(xmlDocument.createCDATASection(description));
			folderElement.appendChild(descriptionElement);
		}
		
		if (viewPosition != null) {
			viewPosition.addKml(folderElement, model, xmlDocument);
		}
		
		if (modelElements != null) {
			for (ModelElement modelElement : modelElements) {
				// If the object is a MapObject it is only being added if:
				// - ENABLE_ONLY_SHOW_OBJECTS_VISIBLE_TO_OBSERVER is false or the object is inside the view to the observer
				// - observer == null or distance to observer is withoin the visibleFrom/To values to the object
				boolean showCurrentModelElement;
				if (!(modelElement instanceof MapObject) || model.getObserver() == null) {
					showCurrentModelElement = true;
				} else {
					MapObject mapObject = (MapObject) modelElement;
					if (mapObject.getLocation() != null) {
						if (!model.ENABLE_ONLY_SHOW_OBJECTS_VISIBLE_TO_OBSERVER || model.getObserver().isVisibleToObserver(mapObject.getLocation())) {
							double distanceToObserver = model.getObserver().distanceTo(mapObject.getLocation());
							MapObjectClass mapObjectClass = mapObject.getMapObjectClass();
							if (mapObjectClass == null) {							 
								showCurrentModelElement = true;
							} else {
								if (!model.ENABLE_DETAILS_DEPENDS_ON_DISTANCE_TO_OBSERVER || ((mapObjectClass.getVisibleFrom() == null || mapObjectClass.getVisibleFrom() < distanceToObserver) && (mapObjectClass.getVisibleTo() == null || mapObjectClass.getVisibleTo() > distanceToObserver))) {
									showCurrentModelElement = true;
								} else {
									showCurrentModelElement = false;
								}
							}
						} else {
							showCurrentModelElement = false;
						}
					} else {
						showCurrentModelElement = true;
					}
				}
				if (showCurrentModelElement) {
					modelElement.addKml(folderElement, model, xmlDocument);
				}
			}
		}
		
		if (visibility != null) {
			Element visibilityElement = xmlDocument.createElement("visibility");
			visibilityElement.appendChild(xmlDocument.createTextNode((visibility) ? "1" : "0"));
			folderElement.appendChild(visibilityElement);
		}
		
		parentElement.appendChild(folderElement);
	}

	public void addKmlXPP(Model model, XmlSerializer serializer) throws IllegalArgumentException, IllegalStateException, IOException {
		// TODO This is a temp version of this method for testing the speed only
		serializer.startTag(null, "Folder");
		if (modelElements != null) {
			for (ModelElement modelElement : modelElements) {
				if (modelElement instanceof MapObject) {
					((MapObject) modelElement).addKmlXPP(model, serializer);
				}
			}
		}
		serializer.endTag(null, "Folder");
	}

	public void addKmlDirect(Model model, Writer writer) throws IOException {
		// TODO This is a temp version of this method for testing the speed only
		writer.write("<Folder>");
		
		if (modelElements != null) {
			for (ModelElement modelElement : modelElements) {
				if (modelElement instanceof MapObject) {
					((MapObject) modelElement).addKmlDirect(model, writer);
				}
			}
		}
		writer.write("</Folder>");
	}
}
