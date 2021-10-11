package se.yaffet;

import java.util.Scanner;


public class B5 {
    public void execute(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mata in ett tal:");//frågar användaren efter ett flyttal
        float input=scanner.nextFloat();
        if(input==0){
            System.out.println("Zero");
        }
        else if(input>0){//om det inmatade talet är större än 0 går vi in i for loopen
            if(input>1000000)
            System.out.println("Large Positve");// skriver ut "Large Postive" om talet är större än 1000000
            else if(input<10)
            System.out.println("Small Positive");// skriver ut "Small Positive" om talet är mellan 1-9
            else
             System.out.print("Positive");// annars skriver den bara ut "Postive"
        }
        else{
            if(input<-1000000)
            System.out.println("Large Negative");
            else if(input>-10)
            System.out.println("Small Negative");
            else 
            System.out.println("negative");
        }

    }
}
    
