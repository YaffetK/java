package se.yaffet;

public class F4 {
    public void run(){
        System.out.println("mata in ett tal:");
        int tal=Integer.parseInt(System.console().readLine());
        
        int summanAvAllaSiffror=nummerlek(tal);

        System.out.println("Summan av alla sifror:" + summanAvAllaSiffror);
        

    }

    public int nummerlek(int tal){
        String s = Integer.toString(tal);/*vi gör om talet till en string så att vi kan använda oss av
        en for loop*/
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int num=Integer.parseInt(String.valueOf(ch));/*gör om värdet från typen character och
            lagrar det i int variabeln num*/
            sum+=num;
        }
        return sum;

    }
    
}
