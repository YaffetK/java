package se.yaffet;

import java.util.Scanner;

public class B7 {
    public void rabatt(){
        /*Be användaren mata in en summa på hur mycket pengar den har. 
        Be sedan användaren att ange om den har rabatt (J = ja liksom).

        1.Om summan är mellan 15 och 25 och användaren inte har rabatt skriv – Du kan köpa en liten hamburgare.
        2.Om summan är mellan 15 och 25 och användaren har rabatt skriv – 
        Du kan köpa en liten hamburgare och en pommes frites.
        3.Om summan är större än 25 och mindre än eller lika med 50 och
        användaren inte har rabatt skriv – Du kan köpa en stor hamburgare.
        4.Om summan är större än 25 och mindre än eller lika med 50 och
         användaren har rabatt skriv – Du kan köpa en stor hamburgare och pommes frites.
        5.Om summan är större än 60 eller om den är 50 och 60 och användaren har rabatt skriv
        – Du kan köpa ett meal med dryck*/
        


        Scanner input=new Scanner(System.in);

        System.out.println("Mata in hur mkt pengar du har:");
        int pengar=input.nextInt();

        System.out.println("Om du har rabatt ange:J");
        String ch=input.nextLine();

        boolean rabatt=false;

        if(ch.charAt(0)=='j'|| ch.charAt(0)=='J'){
            rabatt=true;
        }
        
        if(pengar>15&& pengar<25 && rabatt==false){
            System.out.println("Du kan köpa en liten hamburgare");
        }
        else if(pengar>15 && pengar<25&& rabatt==true){
            System.out.println("Du kan köpa en liten hamburgare och en pommes frites");
        }
        else if(pengar>25 && pengar<=50 && rabatt==false){
            System.out.println("Du kan köpa en stor hamburgare");
        }
        else if(pengar>25 && pengar<=50 && rabatt==true){
            System.out.println("Du kan köpa en stor hamburgare och pommes frites.");
        }
        else if(pengar>60 || pengar>=50 && pengar<=60& rabatt==true){
            System.out.println("Du kan köpa ett meal med dryck");

        }
        else{
        System.out.println("Du har för lite pengar");
        }


        
    }
    
}
