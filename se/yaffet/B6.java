package se.yaffet;

import java.util.Scanner;

public class B6 {
    public void vokal(){
        Scanner input=new Scanner(System.in);
        System.out.print("Mata in ett ord:");
        String ord=input.nextLine();
        boolean vokal=false;//kopplar inte vad boolean har för funktion här

        if(ord.length()>1){
        System.out.println("Bara ett tecken tillåts");//om längden på ordet är mer än ett ord gör om
        }
        else{
        char bokstav = ord.charAt(0);/*Vi ger ett nytt värde i variabeln bokstav som har typen char,
        värdet får den från ordets index*/

        if(bokstav=='a'|| bokstav=='e'|| bokstav=='i'|| bokstav=='o'|| bokstav=='u'|| bokstav=='y'|| bokstav=='å'
        || bokstav=='ä'|| bokstav=='ö'){
            vokal=true;
        }
        
        }
        if(vokal)
            System.out.println("Det är en vokal");
        
        else
            System.out.println("Det är en konsonant");
        
        
    }
    
}
