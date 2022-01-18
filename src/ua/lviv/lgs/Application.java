package ua.lviv.lgs;

public class Application {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10,20);

        Circle c1 = new Circle(1.1,2.2);


        r1.SandP();
        r2.SandP();

        c1.S();
        c1.L();


    }
}
