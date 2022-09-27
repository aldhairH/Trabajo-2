/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] stringArray) throws IOException {
        int n = 8888;
        ServerSocket serverSocket = new ServerSocket(n);
        while (true) {
            System.out.print("Esperando " + n + " \n");
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            String string = new String(dataInputStream.readAllBytes());
            System.out.println(" Mensaje recibido : " + string);
        }
    }
}
