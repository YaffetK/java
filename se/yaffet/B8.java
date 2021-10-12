package se.yaffet;

import java.util.Scanner;

public class B8 {
    public void calculator(){
         /*Bygg en applikation där man får mata in (eller lägg direkt i variabler)

            location (K = krogen, S = systemet)
            age (heltal)
            promillehalt (float)
            Efter detta ska du beräkna om skriva ut ifall man får köpa öl. Dvs
            Om vi är på krogen och age > 18
            Om vi är på systemet och age > 20
            Men vår promillehalt får inte överstiga 1.0 */



        Scanner input=new Scanner(System.in);
        
        System.out.println("vart är du,(k)rogen eller (s)ystemet?");
        String location=input.nextLine();//här får vi strängen från användaren

        char loc=location.charAt(0);// här gör vi om strängen till en char

        System.out.println("Hur gammal är du?");
        int age=input.nextInt();

        System.out.println("vilken är din promillehalt?");
        float promillehalt=input.nextFloat();

        boolean canBuyBear=true;

        if(promillehalt>1.0){  // om promillehalten är äver 1.0 får du canbuybear=false vilket innebär du kan ej köpa
            canBuyBear=false;
        }

        else if(loc=='k'|| loc=='K' && age>=18){ /*om promillehalten är mindre än 1.0, och du valt krogen
             och är över 18 så kan du köpa öl */  
            canBuyBear=true;
        
            if(loc=='s'|| loc=='S' && age>=20)  /*om promillehalten är mindre än 1.0, och du valt systemet
            och är över 20 så kan  du köpa öl */
             
            canBuyBear=true;
        

            else if (loc!='s' || loc!='S'|| loc!='k'|| loc!='K')/*ifall det inmatade ordet är allt annat än "K,k,S,s"
            så blir utskriftet ogiltigt, men koden funkar inte*/
            canBuyBear=false;
            System.out.println("Ogiltigt, försök igen");
        
        }
        
        else {
            canBuyBear=false;
        }
        System.out.print("Resultat:");

        if(canBuyBear)
            System.out.println("Ja du kan köpa alkohol");

        else
            System.out.println("Nej du kan inte köpa öl");


    }
    
}
