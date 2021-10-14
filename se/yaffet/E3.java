package se.yaffet;

import java.util.ArrayList;
import java.util.Arrays;

public class E3 {
    public void run(){
        ArrayList<Integer>nummerLista=new ArrayList<>(Arrays.asList(12 ,55, 32, 9, 34));

        int sum=0;

        for(int a:nummerLista){
            sum+=a;
        }
        System.out.print("summan av alla tal blir" + sum);
    }
    
}
