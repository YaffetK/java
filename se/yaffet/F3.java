package se.yaffet;

public class F3 {
    public void run(){
        System.out.println("Skriv in en mening");
        String mening=System.console().readLine();

        
    }

    public int antalOrd(String mening){
        int words = 0;
        
        boolean isword = false;
        for(int i = 0; i < mening.length();i++){
            char ch = mening.charAt(i);
            if(Character.isLetter(ch)){
                if(isword == false){
                    isword = true;
                    words++;
                }
            }
            else{
                isword = false;
            }

        }
        return words;
    }
    
}
        