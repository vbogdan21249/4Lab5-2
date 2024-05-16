package org.vb2.states;

import org.vb2.TCPConnection;
/**
 * Represents the state of a TCP connection when it is in CLOSED mode.
 */
public class ClosedState implements TCPState {
    /**
     * Opens the connection from the CLOSED state.
     * Changes the state to ESTABLISHED.
     *
     * @param connection the current TCP connection
     */
    @Override
    public void open(TCPConnection connection) {
        System.out.println("Opening connection from CLOSED state.");
        connection.setState(new EstablishedState());
    }
    /**
     * Attempts to close the connection while in CLOSED state.
     * Prints a message indicating that the connection is already closed.
     *
     * @param connection the current TCP connection
     */
    @Override
    public void close(TCPConnection connection) {
        System.out.println("Already in CLOSED state.");
    }
    /**
     * Puts the connection into listening mode from the CLOSED state.
     * Changes the state to LISTENING.
     *
     * @param connection the current TCP connection
     */
    @Override
    public void listen(TCPConnection connection) {
        System.out.println("Listening from CLOSED state.");
        connection.setState(new ListeningState());
    }
}
