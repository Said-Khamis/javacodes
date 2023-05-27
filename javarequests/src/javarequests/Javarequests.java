/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javarequests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author gil_t
 */
public class Javarequests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        // TODO code application logic here
      
        postRequest();
    }
    
    protected static void postRequest() throws MalformedURLException, ProtocolException, IOException{
        URL url = new URL("http://192.168.100.13:8005/api/login.php");
        //URLConnection connection = url.openConnection();
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        
        connection.setRequestMethod("POST");
        
        connection.setDoOutput(true);
        connection.setDoInput(true);
        
        connection.setRequestProperty("Content-Type", "application/json");
        
        String requestBody = "{\"mobile\": \"+255717273084\"}";
        
        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(requestBody.getBytes());
        outputStream.flush();
        outputStream.close();
            
        // Get the response code
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);
            
          // Read the response
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        StringBuilder response = new StringBuilder();
        while ((line = reader.readLine()) != null) {
              response.append(line);
        }
        reader.close();
            
            // Print the response
        System.out.println("Response: " + response.toString());

            // Close the connection
        connection.disconnect();
    }
    
    protected static void getRequest() throws MalformedURLException, ProtocolException, IOException{
        
            URL url = new URL("https://api.example.com/data");
        //URLConnection connection = url.openConnection();
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        
            connection.setRequestMethod("GET");
       
             int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            System.out.println("Response Body: " + response.toString());
            connection.disconnect();
    }
    
}
