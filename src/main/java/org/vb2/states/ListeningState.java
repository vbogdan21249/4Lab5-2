package org.vb2.states;
import org.vb2.TCPConnection;
/**
 * Represents the state of a TCP connection when it is in LISTENING mode.
 */
public class ListeningState implements TCPState {
    /**
     * Attempts to open a connection while in LISTENING state.
     * Prints a message indicating that this action is not allowed.
     *
     * @param connection the current TCP connection
     */
    @Override
    public void open(TCPConnection connection) {
        System.out.println("Cannot open a connection while in LISTENING state.");
    }
    /**
     * Closes the connection from the LISTENING state.
     * Changes the state to CLOSED.
     *
     * @param connection the current TCP connection
     */
    @Override
    public void close(TCPConnection connection) {
        System.out.println("Closing connection from LISTENING state.");
        connection.setState(new ClosedState());
    }
    /**
     * Indicates that the connection is already in LISTENING state.
     *
     * @param connection the current TCP connection
     */
    @Override
    public void listen(TCPConnection connection) {
        System.out.println("Already in LISTENING state.");
    }
}