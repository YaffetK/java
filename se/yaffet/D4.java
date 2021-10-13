package se.yaffet;

import java.util.Scanner;

public class D4 {
    public void ordräknare(){
        Scanner input=new Scanner(System.in);

        System.out.println("Skriv in en mening:");
        String mening=input.nextLine();
        
        String[] antalOrd=mening.split(" ");
        System.out.println("antal ord blev " + antalOrd.length);
    }
    
}
