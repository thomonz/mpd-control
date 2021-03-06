
package org.thunder.mpdcontrol.mpd;

import org.thunder.mpdcontrol.mpd.exception.MPDServerException;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Class representing a connection to MPD Server.
 * 
 * @version $Id: MPDConnection.java 2941 2005-02-09 02:34:21Z galmeida $
 */
public class MPDConnectionMonoSocket extends MPDConnection {

    private Socket socket;
    private InputStreamReader inputStream;
    private OutputStreamWriter outputStream;

    MPDConnectionMonoSocket(InetAddress server, int port, String password, int readWriteTimeout)
            throws MPDServerException {
        super(server, port, password, readWriteTimeout);
        // connect right away and setup streams
        this.connect();
    }

    public InputStreamReader getInputStream() {
        return inputStream;
    }

    public OutputStreamWriter getOutputStream() {
        return outputStream;
    }

    @Override
    protected Socket getSocket() {
        return socket;
    }

    public void setInputStream(InputStreamReader inputStream) {
        this.inputStream = inputStream;
    }

    public void setOutputStream(OutputStreamWriter outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    protected void setSocket(Socket socket) {
        this.socket = socket;
    }
}
