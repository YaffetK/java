package se.yaffet;

import java.util.Scanner;

public class B4 {
    public void execute(){
    Scanner input=new Scanner(System.in);
    System.out.println("mata in veckodagar som siffror,1 betyder Måndag..7 betyder Söndag");
    int day=input.nextInt();

    switch (day) {
        case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("Wednesday");
          break;
        case 4:
          System.out.println("Thursday");
          break;
        case 5:
          System.out.println("Friday");
          break;
        case 6:
          System.out.println("Saturday");
          break;
        case 7:
          System.out.println("Sunday");
          break;
          default:
                System.out.println("Hmm ogiltig dag!");
        }
        System.out.println("Dagen du valde är" + day);
    }
}
