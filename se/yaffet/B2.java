package se.yaffet;

import java.util.Scanner;


public class B2 {
    public void execute(){
        Scanner input=new Scanner(System.in);
        System.out.println("Mata in ett heltal:");
        int tal1=input.nextInt();
        System.out.println("Mata in ett till heltal:");
        int tal2=input.nextInt();
        System.out.println("Mata in ett tredje heltal:");
        int tal3=input.nextInt();
        
        if(tal1>tal2&& tal1>tal3){
            System.out.println("Det största talet är " + tal2);
        }
        
          else if(tal2>tal1&& tal2>tal3){
            System.out.println("Det största talet är " + tal2);
          }
          else{
              System.out.println("Det största talet är " + tal3);
          }


    }
    
}
