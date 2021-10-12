package se.yaffet;
import java.util.Scanner;

public class C3 {
    public void spel(){
        Scanner input=new Scanner(System.in);

        while(true){
        
        System.out.println("mata in ett hel tal:");
        int tal1= input.nextInt();

        System.out.println("mata in ett annat hel tal:");
        int tal2= input.nextInt();

        int sum=tal1+tal2;

        System.out.println(sum);

            System.out.println("vill du fortsätta?J/N");
            String answer=input.toString();

            if(answer.equalsIgnoreCase("N"))
                break;
                
        }
    }
    
}
