package se.yaffet;

public class F5 {
    public void run(){
        System.out.println("Mata in ditt lösenord");
        String input=System.console().readLine();

        String tomText=validLösenord(input);

        System.out.println(validLösenord(input));

        if(tomText.isEmpty()){
            System.out.printf("Ditt lösenord %s är giltigt", input);
        }
        else{
            System.out.println("Error: " + input);
        }


    }

    public String validLösenord(String input){
        if(input.length()<8)
        return "Lösenordet måste innehålla minst 8st tecken";

        if(lösenordInnehållerAnnatÄnSiffrorOchBokstäver(input))
        return "Lösenord får bara innehålla siffror och bokstäver";

        if(!atLeastTwoDigigts(input))
        return "Lösenordet måste innehålla minst 2st siffror";

        return "";
    
    }


    public boolean atLeastTwoDigigts(String input){

         int count=0;
          for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(Character.isDigit(ch))
             count++;  
            }
          
          if(count>=2){
            return true;
          }
           
          else{
            return false; 
          }

    }
    
     public boolean lösenordInnehållerAnnatÄnSiffrorOchBokstäver(String input){
          for (int i=0;i<input.length(); i++){
            char ch=input.charAt(i);

            if(!Character.isLetterOrDigit(ch))
            return true;
        
          }
          
             return false;
             
        }

 }
    

