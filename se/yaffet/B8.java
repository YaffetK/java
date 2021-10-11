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
        String location=input.nextLine();

        char loc=location.charAt(0);

        System.out.println("Hur gammal är du?");
        int age=input.nextInt();

        System.out.println("vilken är din promillehalt?");
        float promillehalt=input.nextFloat();








    }
    
}
