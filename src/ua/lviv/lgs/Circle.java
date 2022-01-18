package ua.lviv.lgs;

public class Circle {

    private double radius;
    private double diameter;

    Circle (double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public void S(){
        System.out.println("Площа кола = " + (3.14*3.14)*(diameter*diameter)/4);
    }

    public void L(){
        System.out.println("Довжина кола =" + 2*(3.14*radius));
    }
}
