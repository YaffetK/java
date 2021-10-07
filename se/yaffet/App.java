package se.yaffet;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    
    public static void main(String[] args) {
        var lab1 = new D1();
        lab1.run();

        var lab2=new D2();
        lab2.run();

        var lab3=new C3();
        lab3.spel();

        var lab4 = new D4();
        lab4.ordräknare();


    }
}
