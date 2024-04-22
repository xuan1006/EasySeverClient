package org.example;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client3 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1",123);

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));

            Scanner sc = new Scanner(System.in);
            System.out.println("Connection surccess...");
            String userinput = sc.next();

            pw.println(userinput);
            pw.flush();

            String result = br.readLine();
            result = result.replaceAll(";","\n");
            System.out.println(result);
        }
        catch (IOException e) {
            System.out.println("發生了" + e + "問題");
        }

    }
}
