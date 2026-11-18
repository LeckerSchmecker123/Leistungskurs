package blatt41.aufgabe02;

import java.io.IOException;

public class MainServer {

    public static void main(String[] args) {

        FirstServer server = new FirstServer(6776);

        try {
            server.start();
            server.communicate();

        } catch (IOException e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }
}
