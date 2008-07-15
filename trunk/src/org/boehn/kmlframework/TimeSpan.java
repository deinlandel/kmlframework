package org.boehn.kmlframework;

public class TimeSpan extends TimePrimitive {

	private String begin;
	private String end;
	
	public String getBegin() {
		return begin;
	}

	public void setBegin(String begin) {
		this.begin = begin;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<TimeSpan" + getIdAndTargetIdFormatted() + ">", 1);
		if (begin != null) {
			kmlDocument.println("<begin>" + begin + "</begin>");
		}
		if (end != null) {
			kmlDocument.println("<end>" + end + "</end>");
		}
		kmlDocument.println(-1, "</TimeSpan>");
	}
}