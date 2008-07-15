package org.boehn.kmlframework.todo.overlays;

//import org.boehn.kmlframework.KmlDocumentElement;

public abstract class Overlay /*implements KmlDocumentElement*/ {

	protected String name;
	protected String description;
	protected Icon icon;
	protected Integer drawOrder;
	protected Boolean visibility;
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getDrawOrder() {
		return drawOrder;
	}
	
	public void setDrawOrder(Integer drawOrder) {
		this.drawOrder = drawOrder;
	}
	
	public Icon getIcon() {
		return icon;
	}
	
	public void setIcon(Icon icon) {
		this.icon = icon;
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
	
}
