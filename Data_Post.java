import java.io.BufferedReader; /* BufferedReader is used to read the response data 
                               as text from the server's response stream, and it's included by importing the java.io package 
                               because it's part of Java's I/O functionality.
                               */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection; /* Here import 'java.net' package in here because the java.net package
                                   contains classes and interfaces related to network communication, 
                                   including handling HTTP connections. Here's why java.net is import  */
import java.net.URL;

public class Data_Post {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://jsonPlaceholder.typicode.com/posts/");

        HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
        httpUrlConnection.setRequestMethod("POST");
        httpUrlConnection.setDoOutput(true);
        OutputStream outPutStream = httpUrlConnection.getOutputStream();
        String postString = "Hi this is Didar, i'm currently learning 'Spring Boot' framework and try to solve problem from 'Codeforce' regularly";
        outPutStream.write(postString.getBytes());

        /*
         * In this code, use some of built-in class, method. For this,import
         * package from their java standard library.
         */

        int validation = httpUrlConnection.getResponseCode();
        System.out.println("Response Code : " + validation);
        System.out.println("Response Message : " + httpUrlConnection.getResponseMessage());
        if (validation == 201) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpUrlConnection.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            String store = null;
            while ((store = bufferedReader.readLine()) != null) {
                stringBuffer.append(store);
            }
            System.out.println("Get Response " + stringBuffer.toString());
        }
    }
}
