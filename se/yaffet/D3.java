package se.yaffet;

import java.util.Scanner;

public class D3 {
    public void mailadress(){
        Scanner input=new Scanner(System.in);

        System.out.println("Mata in en mail adress:");
        String mail=input.nextLine();

        int position=mail.indexOf('@');
        
        if(position==-1){
            System.out.println("Det finns inget '@' i mailet");       
        }
        int dot=mail.lastIndexOf('.');
        int charsAfterDot=(mail.length())-mail.lastIndexOf('.')-1;
        if(charsAfterDot==2 || charsAfterDot==3){
           Boolean validEmail=true;
           System.out.println("Email adressen är korrekt");
        }
        else
          System.out.println("Email adressen är inkorrekt");
        }
    }



    

