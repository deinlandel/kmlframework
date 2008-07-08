package org.boehn.gef.examples;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.boehn.gef.MapObject;
import org.boehn.gef.coordinates.EarthCoordinate;
import org.boehn.gef.servlet.HttpServletModel;

public class SimpleExampleServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// We create a model
			HttpServletModel model = new HttpServletModel(request, response);
			
			// We create an object for the Department of Informatics at the university of Oslo
			MapObject ifi = new MapObject("Department of Informatics");
			ifi.setDescription("Web: http://www.ifi.uio.no<br/>Phone: +47 22852410");
			ifi.setLocation(new EarthCoordinate(59.943355, 10.717344));
			
			// We add the object to the model
			model.add(ifi);
			
			// We generate the kml file
			model.write();
			
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
}
