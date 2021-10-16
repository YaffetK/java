package se.yaffet;

public class D6 {
    public void run(){
        System.out.println("Please enter surname and last name:");
        String name=System.console().readLine();

        String name1=name.toUpperCase();

        String[] namnLista=name1.split(" ");

        char ch1=namnLista[0].charAt(0);
        char ch2=namnLista[1].charAt(0);

        String result=ch1+"."+ch2;


        System.out.printf("Första initialen är %C och andra initalien är %C resultatet blir %s", ch1,ch2,result);
        

        

        

        
    }
    
}
