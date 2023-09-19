package org.ntesla.itets.StdIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardIO {

    public static String in() {
        try {
            InputStreamReader stream = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(stream);
            return buffer.readLine();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

}
