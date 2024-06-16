package CIP;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {

    private static final int PORT = 9090;
    private static Set<PrintWriter> writers = new HashSet<>();

    public static void main(String[] args) throws IOException {
        System.out.println("Chat Server started on port " + PORT);
        ServerSocket listener = new ServerSocket(PORT);
        try {
            while (true) {
                new Handler(listener.accept()).start();
            }
        } finally {
            listener.close();
        }
    }

    private static class Handler extends Thread {
        private Socket socket;
        private BufferedReader in;
        private PrintWriter out;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

                synchronized (writers) {
                    writers.add(out);
                }

                while (true) {
                    String message = in.readLine();
                    if (message == null) {
                        return;
                    }
                    for (PrintWriter writer : writers) {
                        writer.println(message);
                    }
                }
            } catch (IOException e) {
                System.err.println(e);
            } finally {
                if (out != null) {
                    synchronized (writers) {
                        writers.remove(out);
                    }
                }
                try {
                    socket.close();
                } catch (IOException e) {
                    System.err.println(e);
                }
            }
        }
    }
}
