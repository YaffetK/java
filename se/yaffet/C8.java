package se.yaffet;

public class C8 {
    public void run(){
        int password=12345;
        int tries=0;

        while(true){
            System.out.println("Mata in ett 5-siffrigt lösenord");
            int input=Integer.parseInt(System.console().readLine());

            if(input==password) {
                System.out.println("korrekt,välkommen tillbaka");
                break;
            }

             if(tries==3) {
                 System.out.println("Tyvärr ditt konto har blivit låst");
                 break;
             }
            System.out.println("fel lösenord försök en gång till");

            tries++;
            

        }
    }
}
    }
    
}
