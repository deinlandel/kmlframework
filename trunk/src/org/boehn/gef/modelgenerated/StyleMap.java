package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class StyleMap {

	private String id;
	private Collection<Pair> pairs;

	public StyleMap() {
	}

	public StyleMap(String id, Collection<Pair> pairs) {
		this.id = id;
		this.pairs = pairs;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Collection<Pair> getPairs() {
		return this.pairs;
	}

	public void setPairs(Collection<Pair> pairs) {
		this.pairs = pairs;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("StyleMap");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.pairs != null) {
			for (Pair pair: this.pairs) {
				element.appendChild(pair.getElement(xmlDocument));
			}
		}

		return element;
	}
}
