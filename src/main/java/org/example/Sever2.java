package org.example;
import java.net.*;
import java.io.*;
public class Sever2 {
    public static void main(String[] args) {

            try{
                String user = "learning";
                String passwd = "678744532";
                ServerSocket ss = new ServerSocket(888);
                while(true) {
                    System.out.println("long...");
                    Socket s = ss.accept();
                    System.out.println("Online!");

                    BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                    PrintWriter pw = new PrintWriter(new BufferedOutputStream(s.getOutputStream()));

                    String usered = br.readLine();
                    String passwded = br.readLine();
                    if (usered.equals(user) && passwded.equals(passwd)) {
                        pw.println("Hello");
                    } else {
                        pw.println("error");
                    }
                    pw.flush();
                }
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
