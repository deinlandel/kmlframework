package org.boehn.kmlframework;

import java.io.IOException;
import java.io.Writer;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xmlpull.v1.XmlSerializer;

public interface ModelElement {

	public void addKml(Element parentElement, Model model, Document xmlDocument) throws ModelException;
	public void addKmlXPP(Model model, XmlSerializer serializer) throws IllegalArgumentException, IllegalStateException, IOException;
	public void addKmlDirect(Model model, Writer writer) throws IOException;
	
}
