package com.sample;

import java.io.*;
import java.util.*;
import java.net.MalformedURLException;
//import java.net.MalformedURLException;
import java.net.URL;

public class ReadingWebPage {
	public static void main(String agrs[]) {
		
		try {
            URL url = new URL("https://www.youtube.com/mycodeschool/");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine; 
 
            while ((inputLine = in.readLine()) != null) {
                // Process each line.
                System.out.println(inputLine);
            }
            in.close(); 
 
        } catch (MalformedURLException me) {
            System.out.println(me); 
 
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
		
	}

}
