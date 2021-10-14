package se.yaffet;

import java.util.ArrayList;
import java.util.Arrays;

public class E4 {
    public void run(){
        
        ArrayList<String> Lista = new ArrayList<>(Arrays.asList("abc", "xyz", "aba", "1221", "Yaffet", "alla"));

        ArrayList<String> Lista2 = new ArrayList<>();

        int count = 0;

        for (String a : Lista) {
            if (a.length() >= 2 && a.charAt(0) == a.charAt(a.length() - 1)) {
                count++;
                Lista2.add(a);
            }

        }
        System.out.printf("Antal blev %d\n", count);
        System.out.printf("Lista2 nya ord som tillkommit är %s\n",Lista2);
    }
}