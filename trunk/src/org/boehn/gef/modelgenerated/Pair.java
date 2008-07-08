package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class Pair {

	private String id;
	private Collection<Key> keys;
	private Collection<StyleUrl> styleUrls;

	public Pair() {
	}

	public Pair(String id, Collection<Key> keys, Collection<StyleUrl> styleUrls) {
		this.id = id;
		this.keys = keys;
		this.styleUrls = styleUrls;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Collection<Key> getKeys() {
		return this.keys;
	}

	public void setKeys(Collection<Key> keys) {
		this.keys = keys;
	}

	public Collection<StyleUrl> getStyleUrls() {
		return this.styleUrls;
	}

	public void setStyleUrls(Collection<StyleUrl> styleUrls) {
		this.styleUrls = styleUrls;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("Pair");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.keys != null) {
			for (Key key: this.keys) {
				element.appendChild(key.getElement(xmlDocument));
			}
		}
		if (this.styleUrls != null) {
			for (StyleUrl styleUrl: this.styleUrls) {
				element.appendChild(styleUrl.getElement(xmlDocument));
			}
		}

		return element;
	}
}
