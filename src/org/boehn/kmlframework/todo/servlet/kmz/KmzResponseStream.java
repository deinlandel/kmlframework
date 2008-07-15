package org.boehn.kmlframework.todo.servlet.kmz;

import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

public class KmzResponseStream extends ServletOutputStream {

    protected ZipOutputStream zipstream = null;
    protected boolean closed = false;
    protected HttpServletResponse response = null;
    protected ServletOutputStream output = null;
    private String kmlFileName="index.kml";

    protected int bufferCount = 0;
    protected byte[] buffer = null;
    protected int length = -1;


    public KmzResponseStream(HttpServletResponse response) throws IOException {
        super();
        closed = false;
        this.response = response;
        this.output = response.getOutputStream();
        buffer = new byte[128];
    }

    public void setKMLFileName(String kml){
        kmlFileName = kml;
    }

    public void close() throws IOException {
        if (closed) {
            throw new IOException("This output stream has already been closed");
        }

        if (zipstream!=null) {
            flushToZip();
            zipstream.close();
            zipstream = null;
        } else {
            if (bufferCount>0) {
                output.write(buffer, 0, bufferCount);
                bufferCount=0;
            }
        }

        output.close();
        closed = true;
    }

    public void flush() throws IOException {
        if (closed) {
            throw new IOException("Cannot flush a closed output stream");
        }

        if (zipstream != null) {
            zipstream.flush();
        }
    }

    public void flushToZip() throws IOException {
        if (bufferCount > 0) {
            writeToZip(buffer, 0, bufferCount);
            bufferCount = 0;
        }
    }


    public void write(int b) throws IOException {
        if (closed) {
            throw new IOException("Cannot write to a closed output stream");
        }
        if (bufferCount >= buffer.length) {
            flushToZip();
        }
        buffer[bufferCount++] = (byte) b;
    }

    public void write(byte b[]) throws IOException {
        write(b, 0, b.length);
    }

    public void write(byte b[], int off, int len) throws IOException {
        if (closed) {
            throw new IOException("Cannot write to a closed output stream");
        }

        if (len == 0)
            return;

        // Can we write into buffer ?
        if (len <= (buffer.length - bufferCount)) {
            System.arraycopy(b, off, buffer, bufferCount, len);
            bufferCount += len;
            return;
        }

        // There is not enough space in buffer. Flush it ...
        flushToZip();

        // ... and try again. Note, that bufferCount = 0 here !
        if (len <= (buffer.length - bufferCount)) {
            System.arraycopy(b, off, buffer, bufferCount, len);
            bufferCount += len;
            return;
        }

        // write direct to zip
        writeToZip(b, off, len);
    }

    public void writeToZip(byte b[], int off, int len) throws IOException {

        if (zipstream == null) {
            //System.out.println("Content-Length: " + Integer.toString(b.length));
            //response.setContentLength(b.length);
            response.setContentType("application/vnd.google-earth.kmzl; charset=UTF-8");
            zipstream = new ZipOutputStream(output);
            zipstream.putNextEntry(new ZipEntry(kmlFileName));
        }
        zipstream.write(b, off, len);
    }


    public boolean closed() {
        return (this.closed);
    }

    public void reset() {
        // Nothing to do here
    }
}