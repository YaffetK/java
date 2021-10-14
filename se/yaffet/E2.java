package se.yaffet;

import java.util.ArrayList;
import java.util.Arrays;

public class E2 {
    public void lista(){

        ArrayList<Integer>nummerLista=new ArrayList<>(Arrays.asList(12,55,32,9,34));/*metod för att lägga in värden
        utan att använda nummerLista.add funktionen*/

        ArrayList<Integer>andraNummerlistan=new ArrayList<>(Arrays.asList(72 ,55, 32, 4, 88));

        ArrayList<Integer>commonArrayList=new ArrayList<>();

        for(int a:nummerLista){
            if(andraNummerlistan.contains(a))
                commonArrayList.add(a);
        }

        for(int tal:commonArrayList) {
            System.out.println(tal);
        }

    }
             
    
    
}
