package org.boehn.gef.servlet;

import java.io.IOException;
import java.util.StringTokenizer;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.boehn.gef.BoundingBox;
import org.boehn.gef.ModelElement;
import org.boehn.gef.ModelException;
import org.boehn.gef.Model;
import org.boehn.gef.ViewPosition;
import org.boehn.gef.style.Style;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class HttpServletModel extends Model {

	private NetworkLinkControl networkLinkControl;
	private String baseUrl;
	private HttpServletRequest request;
	private HttpServletResponse response;
	private String sessionId;
	
	public boolean DISABLEHTTPCACHE = true;

	public HttpServletModel(HttpServletRequest request, HttpServletResponse response) {
		this(request, response, true);
	}
	
	public HttpServletModel(HttpServletRequest request, HttpServletResponse response, boolean handleTransactions) {
		this.request = request;
		this.response = response;
		if (handleTransactions) {
			networkLinkControl = new NetworkLinkControl();
			networkLinkControl.setCookie("jsessionid=" + request.getSession().getId());
		}
	}
	

	public NetworkLinkControl getNetworkLinkControl() {
		return networkLinkControl;
	}

	public void setNetworkLinkControl(NetworkLinkControl networkLinkControl) {
		this.networkLinkControl = networkLinkControl;
	}
	
	public String getBaseUrl() {
		if (baseUrl != null) {
			return baseUrl;
		} else {
			return "http://" + request.getLocalName() + ":" + request.getLocalPort() + request.getContextPath();
		}
	}
	
	@Override
	public Observer getObserver() {
		if (super.getObserver() == null && request != null) {
			try {
				// We try to read the parameters from the http get
				StringTokenizer parameters = new StringTokenizer(request.getParameter("gefObserver"), ",");	
				
				BoundingBox boundingBox = new BoundingBox(Double.parseDouble(parameters.nextToken().replace(' ', '+')), Double.parseDouble(parameters.nextToken().replace(' ', '+')), Double.parseDouble(parameters.nextToken().replace(' ', '+')), Double.parseDouble(parameters.nextToken().replace(' ', '+'))); 
				ViewPosition viewPosition = new ViewPosition(Double.parseDouble(parameters.nextToken().replace(' ', '+')), Double.parseDouble(parameters.nextToken().replace(' ', '+')), Double.parseDouble(parameters.nextToken().replace(' ', '+')), Double.parseDouble(parameters.nextToken().replace(' ', '+')), Double.parseDouble(parameters.nextToken().replace(' ', '+')));
				setObserver(new Observer(boundingBox, viewPosition));
			} catch (Exception e) {
				//log.warn("Could not create observer because of missing information in the http get.");
			}
		}
		return super.getObserver();
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
		setObserver(null);
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@Override
	public Document generateXmlDocument() throws ModelException {
		Document xmlDocument;
		try {
			xmlDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
		} catch (ParserConfigurationException e) {
			throw new  ModelException(e);
		}
		
		Element kmlElement = xmlDocument.createElement("kml");
		kmlElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns", "http://earth.google.com/kml/2.0");
		xmlDocument.appendChild(kmlElement);

		if (networkLinkControl != null) {
			networkLinkControl.addKml(kmlElement, this, xmlDocument);
		}
	
		Element documentElement = xmlDocument.createElement("Document");
		kmlElement.appendChild(documentElement);
		
		if (getStyles() != null) {
			for (Style style: getStyles().values()) {
				style.addKml(documentElement, this, xmlDocument);
			}
		}
		if (getModelElements() != null) {
			for (ModelElement modelElement: getModelElements())
			modelElement.addKml(documentElement, this, xmlDocument);
		}
		
		return xmlDocument;
	}

	public void write() throws ModelException, IOException {
		response.setContentType("text/html");
		
		if (DISABLEHTTPCACHE) {
			response.setHeader("Cache-Control","no-cache"); //HTTP 1.1
			response.setHeader("Pragma","no-cache");        //HTTP 1.0
			response.setDateHeader ("Expires", 0);
		}
		
		ServletOutputStream out = response.getOutputStream();
		this.write(out);
		out.close();
	}
	
}
