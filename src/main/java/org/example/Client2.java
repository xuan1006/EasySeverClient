package org.example;
import jdk.jshell.SourceCodeAnalysis;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1",888);

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));

            Scanner sc = new Scanner(System.in);
            System.out.println("user:");
            String user = sc.next();
            System.out.println("passwd:");
            String passwd = sc.next();
            pw.println(user);
            pw.println(passwd);


            pw.flush();
            System.out.println(br.readLine());
            s.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
