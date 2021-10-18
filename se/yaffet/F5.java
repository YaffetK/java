package se.yaffet;

public class F5 {
    public void run(){
        System.out.println("Mata in ditt lösenord");
        String input=System.console().readLine();

        String giltigLösenord=validLösenord(input);

        if(giltigLösenord.isEmpty()){
            System.out.printf("Ditt lösenord %s är giltigt" , giltigLösenord);
        }
        else{
            System.out.println("Error");
        }


    }

    public String validLösenord(String input){
        if(input.length()<8)
        return "Lösenordet måste innehålla minst 8st tecken";

        if(!lösenordInnehållerBaraSiffrorOchBokstäver(input))
        return "Lösenord får bara innehålla och bokstäver";

        if(!atLeastTwoDigigts(input))
        return "Lösenordet måste innehålla minst 2st siffror";

        else
        return "";

       



    


    }


    public boolean atLeastTwoDigigts(String input){

        int count=0;
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(Character.isDigit(ch))
             count++;  
            }

          
          if(count>=2)
            return true;
           
          else
            return false;
            
           


    }
    

     public boolean lösenordInnehållerBaraSiffrorOchBokstäver(String input){
          for (int i=0;i<input.length(); i++){
            char ch=input.charAt(i);

            if(Character.isLetterOrDigit(ch));
            return true;
        
          }
          
              return false;
             
        }

    }
    

