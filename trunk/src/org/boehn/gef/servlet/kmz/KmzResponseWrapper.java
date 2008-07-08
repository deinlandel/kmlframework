package org.boehn.gef.servlet.kmz;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class KmzResponseWrapper extends HttpServletResponseWrapper {
    protected HttpServletResponse origResponse = null;
    protected ServletOutputStream stream = null;
    protected PrintWriter writer = null;
    private String kmlFileName="index.kml";
    
    public KmzResponseWrapper(HttpServletResponse response) {
        super(response);
        origResponse = response;
    }
    
    public ServletOutputStream createOutputStream() throws IOException {
        KmzResponseStream krs = new KmzResponseStream(origResponse);
        krs.setKMLFileName(kmlFileName);
        return (krs);
    }
    
    public void setKMLFileName(String kml) {
        kmlFileName = kml;
    }
    
    public void finishResponse() {
        try {
            if (writer != null) {
                writer.close();
            } else {
                if (stream != null) {
                    stream.close();
                }
            }
        } catch (IOException e) {}
    }
    
    public void flushBuffer() throws IOException {
        stream.flush();
    }
    
    public ServletOutputStream getOutputStream() throws IOException {
        if (writer != null) {
            throw new IllegalStateException("getWriter() has already been called!");
        }
        
        if (stream == null)
            stream = createOutputStream();
        return (stream);
    }
    
    public PrintWriter getWriter() throws IOException {
        if (writer != null) {
            return (writer);
        }
        
        if (stream != null) {
            throw new IllegalStateException("getOutputStream() has already been called!");
        }
        
        stream = createOutputStream();
        writer = new PrintWriter(new OutputStreamWriter(stream, "UTF-8"));
        return (writer);
    }
    
    public void setContentLength(int length) {}
}