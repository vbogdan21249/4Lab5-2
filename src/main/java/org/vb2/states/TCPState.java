package org.vb2.states;

import org.vb2.TCPConnection;
/**
 * The TCPState interface defines the methods for various actions
 * that can be performed on a TCP connection in different states.
 */
public interface TCPState {
    /**
     * Opens the connection.
     *
     * @param connection the current TCP connection
     */
    void open(TCPConnection connection);
    /**
     * Closes the connection.
     *
     * @param connection the current TCP connection
     */
    void close(TCPConnection connection);
    /**
     * Puts the connection into listening mode.
     *
     * @param connection the current TCP connection
     */
    void listen(TCPConnection connection);
}
