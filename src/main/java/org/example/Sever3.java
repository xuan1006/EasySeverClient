package org.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever3 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(123);
            Socket s = ss.accept();

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));

            String usercommand = br.readLine();
            System.out.println("usercommand :" + usercommand);
            if (usercommand.equals("dir")){
                dir(pw);
            }


        }
        catch (IOException e) {
            System.out.println("發生了" + e + "意外");
        }
    }

    private static void dir(PrintWriter pw) {
        File file = new File(".");
        String[] filenames = file.list();
        String result = "";
        for (String filename:filenames){
            result += filename + ";";
        }
        pw.println(result);
        pw.flush();
    }
}
