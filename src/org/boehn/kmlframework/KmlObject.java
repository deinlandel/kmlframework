package org.boehn.kmlframework;

public abstract class KmlObject {

	private String id;
	private String targetId;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTargetId() {
		return targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public abstract void write(KmlDocument kmlDocument) throws KmlException;
	
	protected String getIdAndTargetIdFormatted() {
		String result = "";
		if (id!= null) {
			result += " id=\"" + id + "\"";
		}
		if (targetId!= null) {
			result += " targetId=\"" + targetId + "\"";
		}
		return result;
	}
	
	public static int booleanToInt(boolean booleanValue) {
		return (booleanValue? 1 : 0);
	}
	
}
