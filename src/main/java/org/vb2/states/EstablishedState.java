package org.vb2.states;

import org.vb2.TCPConnection;
/**
 * Represents the state of a TCP connection when it is in ESTABLISHED mode.
 */
public class EstablishedState implements TCPState {
    /**
     * Attempts to open a connection while in ESTABLISHED state.
     * Prints a message indicating that the connection is already established.
     *
     * @param connection the current TCP connection
     */
    @Override
    public void open(TCPConnection connection) {
        System.out.println("Already in ESTABLISHED state.");
    }
    /**
     * Closes the connection from the ESTABLISHED state.
     * Changes the state to CLOSED.
     *
     * @param connection the current TCP connection
     */
    @Override
    public void close(TCPConnection connection) {
        System.out.println("Closing connection from ESTABLISHED state.");
        connection.setState(new ClosedState());
    }
    /**
     * Attempts to put the connection into listening mode while in ESTABLISHED state.
     * Prints a message indicating that this action is not allowed.
     *
     * @param connection the current TCP connection
     */
    @Override
    public void listen(TCPConnection connection) {
        System.out.println("Cannot listen while in ESTABLISHED state.");
    }
}

