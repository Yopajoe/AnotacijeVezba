package org.ntesla.itets;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

         while (true){

             System.out.print("Unesi poruku: ");
             String input = in();

            Method method = Arrays.stream(Test.class.getMethods())
                 .filter(m->m.getName().equals("testMetoda"))
                 .findFirst()
                 .get();
            try {
                String out = (String)method.invoke(null,input);
                if(out != null)
                    System.out.println(out);
                else
                    throw new NullPointerException();
            }
            catch (NullPointerException | InvocationTargetException  | IllegalAccessException e){
                e.printStackTrace();
                throw new RuntimeException();
            }

             // System.out.println(Test.testMetoda(input));
         }

    }

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