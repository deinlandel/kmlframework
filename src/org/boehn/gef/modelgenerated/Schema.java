package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class Schema {

	private String id;
	private Collection<ObjArrayField> objArrayFields;
	private Collection<ObjField> objFields;
	private Collection<SimpleArrayField> simpleArrayFields;
	private Collection<SimpleField> simpleFields;
	private Name name;
	private Parent parent;

	public Schema() {
	}

	public Schema(String id, Collection<ObjArrayField> objArrayFields, Collection<ObjField> objFields, Collection<SimpleArrayField> simpleArrayFields, Collection<SimpleField> simpleFields, Name name, Parent parent) {
		this.id = id;
		this.objArrayFields = objArrayFields;
		this.objFields = objFields;
		this.simpleArrayFields = simpleArrayFields;
		this.simpleFields = simpleFields;
		this.name = name;
		this.parent = parent;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Collection<ObjArrayField> getObjArrayFields() {
		return this.objArrayFields;
	}

	public void setObjArrayFields(Collection<ObjArrayField> objArrayFields) {
		this.objArrayFields = objArrayFields;
	}

	public Collection<ObjField> getObjFields() {
		return this.objFields;
	}

	public void setObjFields(Collection<ObjField> objFields) {
		this.objFields = objFields;
	}

	public Collection<SimpleArrayField> getSimpleArrayFields() {
		return this.simpleArrayFields;
	}

	public void setSimpleArrayFields(Collection<SimpleArrayField> simpleArrayFields) {
		this.simpleArrayFields = simpleArrayFields;
	}

	public Collection<SimpleField> getSimpleFields() {
		return this.simpleFields;
	}

	public void setSimpleFields(Collection<SimpleField> simpleFields) {
		this.simpleFields = simpleFields;
	}

	public Name getName() {
		return this.name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Parent getParent() {
		return this.parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("Schema");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.objArrayFields != null) {
			for (ObjArrayField objArrayField: this.objArrayFields) {
				element.appendChild(objArrayField.getElement(xmlDocument));
			}
		}
		if (this.objFields != null) {
			for (ObjField objField: this.objFields) {
				element.appendChild(objField.getElement(xmlDocument));
			}
		}
		if (this.simpleArrayFields != null) {
			for (SimpleArrayField simpleArrayField: this.simpleArrayFields) {
				element.appendChild(simpleArrayField.getElement(xmlDocument));
			}
		}
		if (this.simpleFields != null) {
			for (SimpleField simpleField: this.simpleFields) {
				element.appendChild(simpleField.getElement(xmlDocument));
			}
		}
		if (this.name != null) {
			element.appendChild(this.name.getElement(xmlDocument));
		}
		if (this.parent != null) {
			element.appendChild(this.parent.getElement(xmlDocument));
		}

		return element;
	}
}
