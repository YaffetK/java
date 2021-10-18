package se.yaffet;



public class F2 {
    public void run(){

        System.out.println("hur gammal är du?");
        String a=System.console().readLine();
        var age=Integer.parseInt(a);
       
        System.out.println("Ska du till (K)rogen eller (S)ystemet?");
        var location= System.console().readLine().charAt(0);

        boolean myndig=canBuyBear(age, location);


        System.out.println("Du är tillåten att köpa alkohol:" + myndig);
    
    }

    public boolean canBuyBear(int age,char location){

        if(age>=18 && location=='K')
         return true;

         if(age>=20 && location=='S')
           return true;

           else
           return false;  

    }
    
}
