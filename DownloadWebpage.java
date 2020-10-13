package com.sample;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadWebpage {
	public static void main(String args[]) throws IOException {
		String url = "https://www.youtube.com/mycodeschool/"; 
        DownloadPage(url); 
	}
	public static void DownloadPage(String webpage) 
    { 
        try { 
  
            // Create URL object 
            URL url = new URL(webpage); 
            BufferedReader readr =  
              new BufferedReader(new InputStreamReader(url.openStream())); 
  
            // Enter filename in which you want to download 
            BufferedWriter writer =  
              new BufferedWriter(new FileWriter("C:/Users/prem/Download.html")); 
              
            // read each line from stream till end 
            String line; 
            while ((line = readr.readLine()) != null) { 
                writer.write(line); 
            } 
  
            readr.close(); 
            writer.close(); 
            System.out.println("Successfully Downloaded."); 
            
        } 
  
        // Exceptions 
        catch (MalformedURLException mue) { 
            System.out.println("Malformed URL Exception raised"); 
        } 
        catch (IOException ie) { 
            System.out.println("IOException raised"); 
        } 
    } 
}
