package se.yaffet;

import java.util.Scanner;

public class F1 {
    public void run(){
        Scanner input=new Scanner(System.in);

        System.out.println("Mata in tal 1:");
        int tal1=input.nextInt();

        System.out.println("Mata in tal 2");
        int tal2=input.nextInt();

        System.out.println("Mata in tal3");
        int tal3=input.nextInt();

        int minstaNumret=smallestNumber(tal1, tal2, tal3);

        System.out.println("Det minsta talet är"+ minstaNumret);

    }

    public int smallestNumber(int tal1,int tal2,int tal3){

        if(tal1<tal2&&tal1<tal3)
            return tal1;

            if(tal2<tal1&& tal2<tal3)
            return tal2;

            else
            return tal3; 

        

        
        
    }
    
}
