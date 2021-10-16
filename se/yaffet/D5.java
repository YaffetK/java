package se.yaffet;


public class D5 {
    public void ordlek(){

        System.out.println("Mata in ett ord eller en mening:"); //frågar användaren efter ett ord eller en mening
         String input=System.console().readLine();

         int position=0; //varför måste denna variabel vara utanför While loopen

        while(true){
       
         

         System.out.println("ange en position: och mata in ett tal");
          position=Integer.parseInt(System.console().readLine());

         

          if(position>input.length()|| position<0){
              System.out.println("felaktigt, mata in en ny siffra");
          }

          else if(position<input.length() || position>0){
              break;
          }

        }
        char ch = input.charAt(position);
        System.out.printf("Tecknet på position %d är %c", position, ch);



    }

    
}
