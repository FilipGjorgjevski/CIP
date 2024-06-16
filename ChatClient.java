package CIP;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 9090;

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
        System.out.println("Connected to chat server");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        Thread readThread = new Thread(new ReadThread(in));
        readThread.start();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String message = scanner.nextLine();
            out.println(message);
        }
    }

    private static class ReadThread implements Runnable {
        private BufferedReader in;

        public ReadThread(BufferedReader in) {
            this.in = in;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    String message = in.readLine();
                    if (message == null) {
                        return;
                    }
                    System.out.println(">> " + message);
                }
            } catch (IOException e) {
                System.err.println(e);
            }
        }
    }
}
