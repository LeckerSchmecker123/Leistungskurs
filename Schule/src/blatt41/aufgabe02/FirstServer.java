package blatt41.aufgabe02;


import blatt41.aufgabe01.Nachricht;

import java.net.*;
import java.io.*;

public class FirstServer {

    public Nachricht nachricht;
    private int port;
    private ServerSocket server;
    private Socket client;

    // Konstruktor
    public FirstServer(int port) {
        this.port = port;
    }

    // Setter
    public void setPort(int port) {
        this.port = port;
    }

    // Server starten und auf Verbindung warten
    public void start() throws IOException {

        server = new ServerSocket(port);

        System.out.println("Server wartet auf Client...");

        client = server.accept();

        System.out.println("Client verbunden!");
    }

    // Kommunikation mit dem Client
    public void communicate() throws IOException {

        PrintWriter out = new PrintWriter(
                client.getOutputStream(), true);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(client.getInputStream()));

        Nachricht n;

        // SERVER: Begrüßung senden
        n = new Nachricht("GRE", "Hallo");
        out.println(n.prepareMessage());

        // CLIENT: Begrüßung empfangen
        String antwort = in.readLine();
        n = new Nachricht();
        n.setMessage(antwort);
        System.out.println(n.prepareMessage());

        // SERVER: Frage senden
        n = new Nachricht("OST", "Wie geht es dir?");
        out.println(n.prepareMessage());

        // CLIENT: Antwort empfangen
        antwort = in.readLine();
        n.setMessage(antwort);
        System.out.println(n.prepareMessage());

        // SERVER: Verabschiedung senden
        n = new Nachricht("FIN", "Danke.");
        out.println(n.prepareMessage());

        // CLIENT: Verabschiedung empfangen
        antwort = in.readLine();
        n.setMessage(antwort);
        System.out.println(n.prepareMessage());

        // Verbindung schließen
        client.close();
        server.close();
    }
}
