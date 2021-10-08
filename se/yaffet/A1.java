package se.yaffet;

import java.util.Scanner;

public class A1 {
    public void execute(){
        Scanner input=new Scanner(System.in);
        System.out.print("mata in ett heltal:");
        int tal1= input.nextInt();

        System.out.println("mata in ett annat heltal:");
        int tal2= input.nextInt();
        int largest=tal1;
        if(tal1>tal2)
            largest=tal1;
        else
            largest=tal2;

        System.out.println(largest + "är det största talet");

    } 
}
    
