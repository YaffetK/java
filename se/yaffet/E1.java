package se.yaffet;

public class E1 {
    public void nummerlista(){
     int[]lista={12,55,32,9,34};
     int largest = lista[0];
        int smallest = lista[0];

        for(int tal : lista){
            if(tal < smallest)
                smallest  = tal;
            if(tal > largest)
                largest = tal;
        }
        System.out.printf("Största:%d Minsta:%d", largest,
                 smallest);

    
     

     


     

    }
    
}
