package org.boehn.kmlframework.atom;

import org.boehn.kmlframework.KmlDocument;
import org.boehn.kmlframework.KmlException;

public class AtomLink {

	private String href;

	public AtomLink() {}
	
	public AtomLink(String href) {
		this.href = href;
	}
	
	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}
	
	public void write(KmlDocument kmlDocument) throws KmlException {
		if (href == null) {
			throw new KmlException("href not set for atom:Link");
		}
		kmlDocument.println("<atom:link href=\"" + href + "\" />");
	}
	
}
