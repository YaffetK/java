package se.yaffet;

public class B5 {
    public void execute(){
        
        System.out.println("Mata in ett tal:");//frågar användaren efter ett flyttal
        float input=Float.parseFloat(System.console().readLine());
        if(input==0){
            System.out.println("Zero");
        }
        else if(input>0){
            if(input>1000000)
            System.out.println("Large Positve");// skriver ut "Large Postive" om talet är större än 1000000
            else if(input<10)
            System.out.println("Small Positive");// skriver ut "Small Positive" om talet är mellan 1-9
            else
             System.out.print("Positive");// annars skriver den bara ut "Postive"
        }
        else{
            if(input<-1000000)
            System.out.println("Large Negative");
            else if(input>-10)
            System.out.println("Small Negative");
            else 
            System.out.println("negative");
        }

    }
}
    
