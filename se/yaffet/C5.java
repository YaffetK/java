package se.yaffet;

import java.util.Scanner;

public class C5 {
    public void bakåt(){

        Scanner input=new Scanner(System.in);

        System.out.println("Mata in ett tal");
        int siffra=input.nextInt();

        for(int i=siffra-1;i>0;i--){
            System.out.println(i);
        }

        
    }
    
}
