package se.yaffet;

import java.util.ArrayList;
import java.util.Arrays;

public class F8 {
    public void run(){
        System.out.println("Mata in en bokstav");
        char ch=System.console().readLine().charAt(0);

        if(vokal(ch))
            System.out.println("Vokal");
        else
            System.out.println("Inte vokal");


    }
     public boolean vokal(char ch){
         char lower=Character.toLowerCase(ch);
        
       ArrayList<Character>vokaler=new ArrayList<>(Arrays.asList('a','i','e','u','y','o','ä','å','ö'));

       return vokaler.contains(lower);

   }
        
  }


    

