package se.yaffet;

import java.util.Scanner;

public class C4 {
    public void algoritm(){
        Scanner input=new Scanner(System.in);
        
        int sum=0;

        for(int i=0;i<10;i++){


        System.out.println("Mata in ett tal" + (i));
        int siffra=input.nextInt();


        sum+=siffra;

        }
        System.out.println("summan av vad du matat in är " + sum);

    }

    
    
}
