package se.yaffet;

public class D2 {
    public void run(){
        String randomOrd="Detta är en sträng som du skall ändra på";
        randomOrd.replace(" ", "*");
        int antalStjärnor=0;
        for(int i=0;i<randomOrd.length();i++){
            if(randomOrd.charAt(i)=='*'){
                antalStjärnor++;
            }
     }

    System.out.println("Det finns"+ antalStjärnor+"st stjärnor");
            
    
    
}
}
