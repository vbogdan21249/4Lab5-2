package org.vb2;

/**
 * This is the Main class that demonstrates the behavior of the TCPConnection in different states.
 */
public class Main {
    /**
     * Main method to demonstrate the behavior of the TCPConnection in different states.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        TCPConnection connection = new TCPConnection();

        connection.listen();
        connection.open();
        connection.close();
        connection.open();
        connection.open();
    }
}