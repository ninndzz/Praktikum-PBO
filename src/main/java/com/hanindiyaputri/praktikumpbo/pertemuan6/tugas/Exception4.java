
package com.hanindiyaputri.praktikumpbo.pertemuan6.tugas;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class Exception4 {
    public static void main(String[] args) throws IOException  {
        String url = "ht://ittelkom.com/";
            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestMethod("GET");
            int response =  conn.getResponseCode();
            if(response == 200){
                Scanner responseReader = new Scanner(conn.getInputStream());
                StringBuffer buffer = new StringBuffer();
                while(responseReader.hasNextLine()){
                    buffer.append(responseReader.nextLine()+"");
                }
                responseReader.close();
                System.out.println(buffer.toString());
            }
            System.out.println("Mohon Tuliskan dengan Benar URL - nya !");
            
    
                }
            }
            
    
