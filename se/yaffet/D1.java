package se.yaffet;

import java.util.Scanner;

public class D1 {
    public void run(){
        Scanner input=new Scanner(System.in);
    
        while(true){

        System.out.println("Skriv in ditt namn:");
        String name=input.nextLine();

        System.out.println("Ditt namn har "+ name.length()+" tecken");

        int antalInMatadeNamn=0;
        antalInMatadeNamn++;

        if(name.equalsIgnoreCase("Exit")){
            break;
        }
        System.out.println("Hejdå,du matade in totalt "+ antalInMatadeNamn+" namn");


    }
}
    
}
