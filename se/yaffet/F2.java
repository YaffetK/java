package se.yaffet;



public class F2 {
    public void run(){

        System.out.println("hur gammal är du?");
        String a=System.console().readLine();
        int age=Integer.parseInt(a);
       
        System.out.println("Ska du till (k)rogen eller (S)ystemet?");
        char location= System.console().readLine().charAt(0);

        boolean myndig=canBuyBear(age, location);


        System.out.println("Du är myndig:" + myndig);
    
    }

    public boolean canBuyBear(int age,char location){

        if(age>=18 && location=='k')
         return true;

         if(age>=20 && location=='s')
           return true;

           else
           return false;  

    }
    
}
