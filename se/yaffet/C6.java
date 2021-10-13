package se.yaffet;

import java.util.Scanner;

public class C6 {
    public void tärningar(){

        Scanner scanner=new Scanner(System.in);

        while(true){

       int tärning1=(int) (Math.random()*6)+1;
       int tärning2=(int) (Math.random()*6)+1;

       System.out.println("tärning 1 gav dig " + tärning1);
       System.out.println("tärning 2 gav dig " +  tärning2);

       System.out.println("Knappa in Y/y ifall du vill fortsätta");
       String input=scanner.nextLine();

       if(!input.equalsIgnoreCase("y")){
           break;

       }



        }

        


    }
    
}
