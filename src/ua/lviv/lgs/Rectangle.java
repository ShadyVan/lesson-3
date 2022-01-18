package ua.lviv.lgs;

public class Rectangle {

    private int length;
    private int width;


    Rectangle () {
        this.length = 23;
        this.width = 13;
    }

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void SandP() {
        System.out.println("Площа прямокутника = " + length*width);
        System.out.println("Периметр прямокутника = " + 2 * (length*width));
    }

}
