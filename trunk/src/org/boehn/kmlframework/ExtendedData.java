package org.boehn.kmlframework;

import java.util.List;

public class ExtendedData extends KmlObject {

	private List<Data> dataElements;
	private String schemaUrl;
	private List<SimpleData> simpleDataElements;
	private String nameSpace;
	private String customContent;
	
	public List<Data> getDataElements() {
		return dataElements;
	}

	public void setDataElements(List<Data> dataElements) {
		this.dataElements = dataElements;
	}

	public String getSchemaUrl() {
		return schemaUrl;
	}

	public void setSchemaUrl(String schemaUrl) {
		this.schemaUrl = schemaUrl;
	}

	public List<SimpleData> getSimpleDataElements() {
		return simpleDataElements;
	}

	public void setSimpleDataElements(List<SimpleData> simpleDataElements) {
		this.simpleDataElements = simpleDataElements;
	}

	public String getNameSpace() {
		return nameSpace;
	}

	public void setNameSpace(String nameSpace) {
		this.nameSpace = nameSpace;
	}

	public String getCustomContent() {
		return customContent;
	}

	public void setCustomContent(String customContent) {
		this.customContent = customContent;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<ExtendedData" + getIdAndTargetIdFormatted() + (nameSpace != null ? " mlns:prefix=\"" + nameSpace + "\"" : "") + ">", 1);
		if (dataElements != null) {
			for (Data data : dataElements) {
				data.write(kmlDocument);
			}
		}
		if (schemaUrl != null || simpleDataElements != null) {
			kmlDocument.println("<SchemaData" + (schemaUrl != null ? " schemaUrl=\"" + schemaUrl + "\"" : "") + ">", 1);
			if (simpleDataElements != null) {
				for (SimpleData simpleData : simpleDataElements) {
					simpleData.write(kmlDocument);
				}
			}
			kmlDocument.println("</SchemaData>");
		}
		if (customContent != null) {
			kmlDocument.println(customContent);
		}
		kmlDocument.println(-1, "</ExtendedData>");
	}
}
