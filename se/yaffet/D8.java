package se.yaffet;

public class D8 {
    public void run(){
        System.out.println("ange spelarnman:");
        String name=System.console().readLine();
        if(name.equalsIgnoreCase("Yaffet Kahsay")){
            System.out.println("Vilken fantastisk spelare nummer 10 var!");
        }
        else{
            System.out.println("Aldrig hört talas om den spelaren");
        }
    }
    
}
