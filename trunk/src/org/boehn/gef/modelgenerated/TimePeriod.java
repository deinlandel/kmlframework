package org.boehn.gef.modelgenerated;

public class TimePeriod {

	private String id;
	private Begin begin;
	private End end;

	public TimePeriod() {
	}

	public TimePeriod(String id, Begin begin, End end) {
		this.id = id;
		this.begin = begin;
		this.end = end;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Begin getBegin() {
		return this.begin;
	}

	public void setBegin(Begin begin) {
		this.begin = begin;
	}

	public End getEnd() {
		return this.end;
	}

	public void setEnd(End end) {
		this.end = end;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("TimePeriod");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.begin != null) {
			element.appendChild(this.begin.getElement(xmlDocument));
		}
		if (this.end != null) {
			element.appendChild(this.end.getElement(xmlDocument));
		}

		return element;
	}
}
