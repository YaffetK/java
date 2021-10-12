package se.yaffet;

import java.util.Scanner;

public class C2 {
        public void execute() {
            Scanner input = new Scanner(System.in);

            System.out.println("Mata in ett tal:");
            int tal1 = input.nextInt();

            System.out.println("mata in ett annat tal:");
            int tal2 = input.nextInt();

            if (tal2 > tal1) {
                for (int i = tal1; i <tal2; i++) {
                    System.out.println(i);
                }
            } else
                for (int i = tal2; i > tal1; i--) {
                    System.out.println(i);
                }

            if (tal2 > tal1) {
                int i = tal1;
                while (i <= tal2) {
                    System.out.println(i);
                    i++;
                }
            }
            else {
                int i = tal2;
                while (i >= tal1) {
                    System.out.println(i);
                    i--;
                }

            }
        }
    }

