/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientudp;

import java.io.IOException;
import java.net.SocketException;

/**
 *
 * @author Gabriele Farinella
 */
public class ClientUDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SocketException, IOException {
        String IP_address;
        int UDP_port;
        String request,answer;
        UDPClientSocket client;
        
        IP_address="127.0.0.1";
        UDP_port=7;
        request="ciao";
        
        client = new UDPClientSocket();
        answer = client.sendAndRecive(request, IP_address, UDP_port);
        System.out.println("ho ricevuto in risposta: " + answer);
        client.close_socket();
    }
    
}
