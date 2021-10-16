package se.yaffet;

public class E1 {
    public void nummerlista(){
        int[] nummerLista={34 ,32, 55, 9, 12};
        int smallest=nummerLista[0];//ger första värdet i listan ett värde så att vi kan jämföra med alla tal i lista
        int largest=nummerLista[0];//ger första värdet i listan ett värde så att vi kan jämföra med alla tal i lista

        for(int a:nummerLista) {
            if (a < smallest)
                smallest = a;/*int a går igenom hela listan och när den hittar det minsta talet lagras det värdet
               i smallest */
            if (a > largest)
                largest = a;/*int a går igenom hela listan och när den hittar det minsta talet lagras det värdet
               i smallest */
        }
        System.out.printf("Största:%d Minsta:%d", largest,
                smallest);

     }



     
    }
    

