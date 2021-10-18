package se.yaffet;

public class F7 {
    public void run(){
        System.out.println("Vad är din månadslön?");
        double salary=Integer.parseInt(System.console().readLine());

        double lönEfterSkatt=salarayAfterTaxes(salary);
        System.out.println("din lön efter skatt blir " + lönEfterSkatt + "kr");


    }

    public double salarayAfterTaxes(Double salary){
        if(salary>=30000){
            return salary*0.33;
        }
        else if(salary<15000){
            return salary*0.12;
        }
        else{
            return salary*0.28;
        }
        
    }
    
}
