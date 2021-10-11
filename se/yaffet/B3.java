package se.yaffet;

import java.util.Scanner;

public class B3 {
    public void veckodagar(){
        Scanner input=new Scanner(System.in);
        System.out.println("mata in veckodagar som siffror,1 betyder Måndag..7 betyder Söndag");
        int veckonummer=input.nextInt();

        if (veckonummer==1){
            System.out.println("Måndag");
        }
        else if(veckonummer==2){
            System.out.println("Tisdag");
        }
        else if(veckonummer==3){
            System.out.println("Onsdag");
        }
        else if(veckonummer==4){
            System.out.println("Torsdag");
        }
        else if(veckonummer==5){
            System.out.println("Fredag");
        }
        else if(veckonummer==6){
            System.out.println("Lördag");
        }
        else if(veckonummer==7){
            System.out.println("Söndag");
        }
        else{
            System.out.println("Ogiltigt nummer,mata in ett nytt nummer");

        }
        System.out.println("Dagen du valde är" + veckonummer);
    }
    
}
