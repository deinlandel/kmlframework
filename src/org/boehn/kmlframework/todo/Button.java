package org.boehn.kmlframework.todo;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.boehn.kmlframework.kml.Kml;
import org.boehn.kmlframework.todo.servlet.HttpServletModel;


public class Button {
	
	private String url;
	private String text;
	private Map<String, String> parameters;
	
	public Button() {
	}
	
	public Button(String text, String url) {
		this.text = text;
		this.url = url;
	}
	
	public Button(String text, String url, String parameterName, String parameterValue) {
		this(text, url);
		addParameter(parameterName, parameterValue);
	}
	
	public Button(String text, String url, Map<String, String> parameters) {
		this(text, url);
		this.parameters = parameters;
	}
	
	public void addParameter(String parameterName, String parameterValue) {
		if (parameters == null) {
			parameters = new HashMap<String, String>();
		}
		parameters.put(parameterName, parameterValue);
	}

	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public Map<String, String> getParameters() {
		return parameters;
	}
	
	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}

	public String toHtml(Kml model) {
		//try {		
			StringBuffer html = new StringBuffer();
			StringBuffer urlToUse;
			if (url.startsWith("http://")) {
				urlToUse = new StringBuffer(url);
			} else {
				// The url is not absolute. We need info from the HttpServletModel
				if (model instanceof HttpServletModel) {
					HttpServletModel httpServleModel = (HttpServletModel) model;
					//urlToUse = new StringBuffer(encodeURL(httpServleModel.getBaseUrl() + url, httpServleModel.getRequest()));
				} else {
					throw new IllegalArgumentException("Button has an url that is not absolute (does not starts with 'http://'). Then the model must be an instance of the HttpServletModel class.");
				}
			}
			if (parameters != null) {
				//urlToUse.append("?");
				for (Object key: parameters.keySet()) {
					//urlToUse.append("&" + URLEncoder.encode(key.toString(), "UTF-8") + "=" + URLEncoder.encode(parameters.get(key).toString(), "UTF-8"));
				}
			}
			//html.append("<a href=\"" + urlToUse.toString() + "\">" + text + "</a>");
			return html.toString();
		//} catch (UnsupportedEncodingException e) {
		//	throw new RuntimeException(e);
		//}
	}
	
	public String encodeURL(String url, HttpServletRequest request) {
		// TODO This method should not be necessarily. There is a method for doing this in the HttpServletResponse.
		// At the moment that method is not doing the encoding. No idea why. It used to work...
		int indexQuestionMark = url.indexOf("?");
		if (indexQuestionMark < 0) {
			return url + ";jsessionid=" + request.getSession().getId();
		} else {
			return url.substring(0, indexQuestionMark) + ";jsessionid=" + request.getSession().getId() + url.substring(indexQuestionMark);
		}
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
