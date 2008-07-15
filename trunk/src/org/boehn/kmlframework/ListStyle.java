package org.boehn.kmlframework;

public class ListStyle extends KmlObject {

	private ListItemTypeEnum listItemType;
	private String bgColor;
	private String itemIconState; // TODO understand the valid states (unclear in KLM Reference)
	private String href;
	
	public ListItemTypeEnum getListItemType() {
		return listItemType;
	}

	public void setListItemType(ListItemTypeEnum listItemType) {
		this.listItemType = listItemType;
	}

	public String getBgColor() {
		return bgColor;
	}

	public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
	}

	public String getItemIconState() {
		return itemIconState;
	}

	public void setItemIconState(String itemIconState) {
		this.itemIconState = itemIconState;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<ListStyle" + getIdAndTargetIdFormatted() + ">", 1);
		if (listItemType != null) {
			kmlDocument.println("<listItemType>" + listItemType + "</listItemType>");
		}
		if (bgColor != null) {
			kmlDocument.println("<bgColor>" + bgColor + "</bgColor>");
		}
		if (itemIconState != null || href != null) {
			kmlDocument.println("<ItemIcon>", 1);
			if (itemIconState != null) {
				kmlDocument.println("<state>" + itemIconState + "</state>");
			}
			if (href != null) {
				kmlDocument.println("<href>" + href + "</href>");
			}			
			kmlDocument.println(-1, "</ItemIcon>");
		}
		kmlDocument.println(-1, "</ListStyle>");
	}
}