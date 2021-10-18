package se.yaffet;

public class F9 {
    public void run(){
        System.out.print("Skriv in en text:");
        String mening = System.console().readLine();

        String result = Translate(mening);
        System.out.println(result);
        
    }

    private String Translate(String mening) {
        var F8 = new F8();
        String result = "";
        for(int i = 0; i < mening.length();i++){
            char ch = mening.charAt(i);

            //Går raden under att förbättra? Japp, isConsonant
            if(Character.isLetter(ch) && F8.vokal(ch) == false  ){
                result = result + ch + 'o' + ch;
            }
            else
                result = result + ch;

        }
        return result;
    }



}
    
