    package org.example;

import java.net.*;
import java.io.*;

public class Sever {
    public static void main(String args[]){
        while (true) {
            try {
                ServerSocket svs = new ServerSocket(123);
                System.out.println("waiting for it...");
                Socket s = svs.accept();
                System.out.println("Online!");

                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                String content;
                while ((content = br.readLine())!=null){
                    if (content.isEmpty()){
                        break;
                    }
                    System.out.println(content);
                }

                s.close();
                svs.close();
                System.out.println("Finish!");
            } catch (IOException e) {
                System.out.println("發生了" + e + "意外");
            }
        }
    }
}