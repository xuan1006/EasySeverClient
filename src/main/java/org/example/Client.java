package org.example;

import java.net.*;
import java.io.*;

public class Client{
    public static void main(String args[]){
        try{
            String host = "localhost";
            int port = 123;
            Socket client = new Socket(host,port);
            PrintWriter pw = new PrintWriter(client.getOutputStream(),true);
            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));

            pw.println("Ae110639");
            pw.println("塗蒼璿");
            pw.println();
            pw.flush();


            pw.close();
            br.close();
        }
        catch (IOException e) {
            System.out.println("發生了" + e + "意外");
        }
    }
}
