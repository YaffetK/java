package se.yaffet;

import java.util.ArrayList;

public class E6 {
    public void run(){
        ArrayList<String>spelarLista=new ArrayList<>();

        while(true){
        System.out.println("Mata in namn på Hockeyspelare:");
        String namn=System.console().readLine();
        if(namn.equalsIgnoreCase("exit") && spelarLista.size()>=5){
            break;
             }
        else if (namn.equalsIgnoreCase("exit")&& spelarLista.size()<5){
            System.out.println("nej nej fortsätt mata in några namn!!");
             }
             else{
                 spelarLista.add(namn);
                  }

        }
        String longest="";

        for(String s:spelarLista){
            if(s.length()>longest.length())
                longest=s;
        }

        System.out.println("det längsta inmatade namnet är "+ longest);

    }

}
    

