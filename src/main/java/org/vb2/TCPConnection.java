package org.vb2;

import org.vb2.states.ClosedState;
import org.vb2.states.TCPState;
/**
 * The TCPConnection class represents a TCP connection that can change its behavior
 * based on its current state (LISTENING, ESTABLISHED, CLOSED).
 */
public class TCPConnection {
    private TCPState state;

    /**
     * Constructs a TCPConnection with the initial state set to CLOSED.
     */
    public TCPConnection() {
        state = new ClosedState(); // Starting state
    }
    /**
     * Sets the current state of the connection.
     *
     * @param state the new state of the connection
     */
    public void setState(TCPState state) {
        this.state = state;
    }
    /**
     * Opens the connection by delegating the action to the current state.
     */
    public void open() {
        state.open(this);
    }
    /**
     * Closes the connection by delegating the action to the current state.
     */
    public void close() {
        state.close(this);
    }

    /**
     * Puts the connection into listening mode by delegating the action to the current state.
     */
    public void listen() {
        state.listen(this);
    }
}
