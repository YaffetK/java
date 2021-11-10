package se.yaffet;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    
    public static void main(String[] args) {
        String nyaTexten = " ";
        while (true){
            System.out.println("Skriv in en text");
            String texten = System.console().readLine();
            int numberOfLetters = texten.length();

            if (numberOfLetters > 1 && numberOfLetters < 20)
            nyaTexten = texten;
            break;

        }

        int nyaTries = 0;
        while (true){
            System.out.println("Mata in antal gånger");
            int tries = Integer.parseInt(System.console().readLine());

            if (tries > 1 && tries < 20)
            nyaTries = tries;
            break;
        }

        for (int i =0; i < nyaTries; i++){
            System.out.println(nyaTexten);
        }

    }




    }

