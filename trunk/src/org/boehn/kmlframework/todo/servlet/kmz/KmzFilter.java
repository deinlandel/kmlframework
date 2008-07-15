package org.boehn.kmlframework.todo.servlet.kmz;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class KmzFilter implements Filter {
    
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        if (req instanceof HttpServletRequest) {
            HttpServletRequest request = (HttpServletRequest) req;
            HttpServletResponse response = (HttpServletResponse) res;
            
            String servletPath = request.getServletPath();
            String kmlFileName="";
            int extension = servletPath.indexOf(".");
            if (extension >= 0) {
                // strip extension so that kmz contains a file ending in kml
                kmlFileName = servletPath.substring(1, extension) + ".kml";
            }
            KmzResponseWrapper wrappedResponse =
                    new KmzResponseWrapper(response);
            wrappedResponse.setKMLFileName(kmlFileName);
            chain.doFilter(req, wrappedResponse);
            wrappedResponse.finishResponse();
            return;
        }
    }
    
    public void init(FilterConfig filterConfig) {
        // Nothing to do here
    }
    
    public void destroy() {
        // Nothing to do here
    }
}