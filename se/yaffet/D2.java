package se.yaffet;

public class D2 {
    public void stjärnor(){

        String randomOrd=("Detta är en sträng som du skall ändra på");

        randomOrd=randomOrd.replace(' ', '*');

        int antalStjärnor=0;

        for(int i=0; i<randomOrd.length(); i++){
            if(randomOrd.charAt(i)=='*'){
                antalStjärnor++;
            }
        }
        System.out.println(randomOrd);

       System.out.println("Det finns "+ antalStjärnor+" st stjärnor"); 
       System.out.printf("Det finns %s stjärnor\n", antalStjärnor);  
    
    }
}
