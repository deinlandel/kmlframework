package org.boehn.gef;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.boehn.gef.coordinates.CartesianCoordinate;
import org.boehn.gef.coordinates.Coordinate;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ModelObjectFactory {
	
	private String fileName;
	private Hashtable<String, MapObjectClass> mapObjectClasses;
	
	public ModelObjectFactory(String fileName) throws IOException, ParserConfigurationException, SAXException {
		this.fileName = fileName;
		loadFile();
	}
	
	public MapObject createMapObject(String className) {
		return new MapObject(getMapObjectClass(className));
	}
	
	public MapObjectClass getMapObjectClass(String className) {
		MapObjectClass mapObjectClass = mapObjectClasses.get(className);
		if (mapObjectClass == null) {
			mapObjectClass = new MapObjectClass(className);
			mapObjectClasses.put(className, mapObjectClass);
		}
		return mapObjectClass;
	}
	
	public void loadFile() throws IOException, ParserConfigurationException, SAXException {
		mapObjectClasses = new Hashtable<String, MapObjectClass>();
		DocumentBuilder documentBuilder;
		
		documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document document = documentBuilder.parse(new File(fileName));
		NodeList documentNodes = document.getChildNodes();
		for (int i = 0; i < documentNodes.getLength(); i++) {
			Node objectClassesNode = documentNodes.item(i);
			if ("mapObjectClasses".equals(objectClassesNode.getNodeName()) && objectClassesNode.getChildNodes().getLength() > 0) {
				NodeList objectClassesChildren = objectClassesNode.getChildNodes();
				for (int j = 0; j < objectClassesChildren.getLength(); j ++) {
					Node mapObjectClassNode = objectClassesChildren.item(j);
					if ("mapObjectClass".equals(mapObjectClassNode.getNodeName())) {
						NamedNodeMap mapObjectClassAttributes = mapObjectClassNode.getAttributes();
						
						// We make the mapObject class
						MapObjectClass mapObjectClass = new MapObjectClass(mapObjectClassAttributes.getNamedItem("className").getNodeValue());
						
						// We read all optional parameters for the mapObject class
						if (mapObjectClassAttributes.getNamedItem("showTail") != null) {
							mapObjectClass.setShowTail(new Boolean(mapObjectClassAttributes.getNamedItem("showTail").getNodeValue()));
						}
						if (mapObjectClassAttributes.getNamedItem("showModel") != null) {
							mapObjectClass.setShowModels(new Boolean(mapObjectClassAttributes.getNamedItem("showModel").getNodeValue()));
						}
						if (mapObjectClassAttributes.getNamedItem("visibleFrom") != null) {
							mapObjectClass.setVisibleFrom(new Integer(mapObjectClassAttributes.getNamedItem("visibleFrom").getNodeValue()));
						}
						if (mapObjectClassAttributes.getNamedItem("visibleTo") != null) {
							mapObjectClass.setVisibleTo(new Integer(mapObjectClassAttributes.getNamedItem("visibleTo").getNodeValue()));
						}
						if (mapObjectClassAttributes.getNamedItem("tailHistoryLimit") != null) {
							mapObjectClass.setTailHistoryLimit(new Integer(mapObjectClassAttributes.getNamedItem("tailHistoryLimit").getNodeValue()));
						}
						if (mapObjectClassAttributes.getNamedItem("tailVisibleFrom") != null) {
							mapObjectClass.setTailVisibleFrom(new Integer(mapObjectClassAttributes.getNamedItem("tailVisibleFrom").getNodeValue()));
						}
						if (mapObjectClassAttributes.getNamedItem("tailVisibleTo") != null) {
							mapObjectClass.setTailVisibleTo(new Integer(mapObjectClassAttributes.getNamedItem("tailVisibleTo").getNodeValue()));
						}
						if (mapObjectClassAttributes.getNamedItem("styleUrl") != null) {
							mapObjectClass.setStyleUrl(mapObjectClassAttributes.getNamedItem("styleUrl").getNodeValue());
						}
						
						// We load the children to the mapObjectClass
						NodeList mapObjectClassChildren = mapObjectClassNode.getChildNodes();
						for (int k = 0; k < mapObjectClassChildren.getLength(); k++) {
							Node mapObjectClassChild = mapObjectClassChildren.item(k);
							if ("model".equals(mapObjectClassChild.getNodeName())) {
								GraphicalModel model = new GraphicalModel();
								
								// We read the attributes to the model element
								NamedNodeMap modelAttributes = mapObjectClassChild.getAttributes();
								if (modelAttributes.getNamedItem("visibleFrom") != null) {
									model.setVisibleFrom(new Integer(modelAttributes.getNamedItem("visibleFrom").getNodeValue()));
								}
								if (modelAttributes.getNamedItem("visibleTo") != null) {
									model.setVisibleTo(new Integer(modelAttributes.getNamedItem("visibleTo").getNodeValue()));
								}
								
								NodeList modelChildren = mapObjectClassChild.getChildNodes();
								for (int l = 0; l < modelChildren.getLength(); l++) {
									Node modelChild =modelChildren.item(l);
									if ("polygon".equals(modelChild.getNodeName()) || "path".equals(modelChild.getNodeName())) {
										Path path;
										if ("polygon".equals(modelChild.getNodeName())) {
											path = new Polygon();
										} else {
											path = new Path();
										}
										
										// We read the attributes to the path/polygon element
										NamedNodeMap modelChildAttributes = modelChild.getAttributes();
										if (modelChildAttributes.getNamedItem("altitudeMode") != null) {
											path.setAltitudeMode(AltitudeModes.valueOf(modelChildAttributes.getNamedItem("altitudeMode").getNodeValue()));
										}
										if (modelChildAttributes.getNamedItem("extrude") != null) {
											path.setExtrude(new Boolean(modelChildAttributes.getNamedItem("extrude").getNodeValue()));
										}
										
										// We read the children to the path/polygon
										NodeList pathChildren = modelChild.getChildNodes();
										for (int m = 0; m < pathChildren.getLength(); m++) {
											Node pathChild = pathChildren.item(m);
											if ("coordinate".equals(pathChild.getNodeName())) {
												NamedNodeMap coordinateAttributes = pathChild.getAttributes();
												Coordinate coordinate = new CartesianCoordinate(Double.parseDouble(coordinateAttributes.getNamedItem("x").getNodeValue()), Double.parseDouble(coordinateAttributes.getNamedItem("y").getNodeValue()), Double.parseDouble(coordinateAttributes.getNamedItem("z").getNodeValue()));
												path.addCoordinate(coordinate);
											}
										}
										model.addGraphicalModelElement(path);
									}
								}
								mapObjectClass.addModel(model);
							}
						}
						// We add the object class to the hashtable
						mapObjectClasses.put(mapObjectClass.getClassName(), mapObjectClass);
					}
				}
				break;
			}
		}
	}
}
