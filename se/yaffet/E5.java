package se.yaffet;

import java.util.ArrayList;
import java.util.Arrays;

public class E5 {
    public void run(){
        ArrayList<Integer>minLista=new ArrayList<>(Arrays.asList(12 ,-5, 32, -9, 34));
        int count=0;

        for(int tal:minLista){
            if(tal>0){
                count++;
            }
        }
       System.out.printf("Det är %d st tal som har värdet över 0", count);


    }



    
    
    
}
