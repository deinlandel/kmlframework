package org.boehn.kmlframework.atom;

import org.boehn.kmlframework.KmlDocument;
import org.boehn.kmlframework.KmlException;

public class AtomAuthor {

	private String name;
	private String uri;
	private String email;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public AtomAuthor(String name) {
		this.name = name;
	}
	
	public AtomAuthor(String name, String uri, String email) {
		this.name = name;
		this.uri = uri;
		this.email = email;
	}
	
	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<atom:author>", 1);
		if (name != null) {
			kmlDocument.println("<atom:name>" + name + "</atom:name>");
		}
		if (uri != null) {
			kmlDocument.println("<atom:uri>" + uri + "</atom:uri>");
		}
		if (email != null) {
			kmlDocument.println("<atom:email>" + email + "</atom:email>");
		}
		kmlDocument.println(-1, "</atom:author>");
	}
}
