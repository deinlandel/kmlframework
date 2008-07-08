package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class StyleBlinker {

	private String id;
	private Collection<State> states;
	private NumCycles numCycles;

	public StyleBlinker() {
	}

	public StyleBlinker(String id, Collection<State> states, NumCycles numCycles) {
		this.id = id;
		this.states = states;
		this.numCycles = numCycles;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Collection<State> getStates() {
		return this.states;
	}

	public void setStates(Collection<State> states) {
		this.states = states;
	}

	public NumCycles getNumCycles() {
		return this.numCycles;
	}

	public void setNumCycles(NumCycles numCycles) {
		this.numCycles = numCycles;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("StyleBlinker");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.states != null) {
			for (State state: this.states) {
				element.appendChild(state.getElement(xmlDocument));
			}
		}
		if (this.numCycles != null) {
			element.appendChild(this.numCycles.getElement(xmlDocument));
		}

		return element;
	}
}
