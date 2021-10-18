package se.yaffet;

public class F6 {
    public void run(){

        System.out.println("Skriv in en mening");
        String mening=System.console().readLine();

        String[] ordLista=mening.split(" ");
        String längstaOrdet=HittaLängstaOrdet(ordLista);

        System.out.printf("Det längsta ordet i arraylistan är %s", längstaOrdet);
        

    }

    public String HittaLängstaOrdet(String[] ordLista){
         String längstHittils ="";
        for(String ord :ordLista){
            if(ord.length()>längstHittils.length())
            längstHittils=ord;
        }

        return längstHittils;  

    }
    
}
