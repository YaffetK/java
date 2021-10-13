package se.yaffet;

import java.util.Scanner;

public class C7 {
    public void nästladloop(){

        Scanner input=new Scanner(System.in);

        System.out.println("Enter Height");
        int height=input.nextInt();

        System.out.println("Enter width");
        int width=input.nextInt();

        for(int row = 0; row < height; row++){
            for(int col = 0; col < width; col++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }
    
}
