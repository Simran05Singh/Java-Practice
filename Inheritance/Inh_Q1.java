class Circle {
    float r;
    Circle(float r) {
        this.r = r;
    }
    public float Area() {
        return (r*r*3.14f);
    }
}
class Cylinder extends Circle {
    float h;
    Cylinder(float r,float h) {
        super(r);
        this.h = h;
    }
    public float Volume() {
        return (r*r*3.14f*h);
    }
}
public class Inh_Q1 {
    public static void main(String[] args) {
        Circle c = new Circle(6.6f);
        Cylinder cy = new Cylinder(6.7f,7.8f);
        System.out.println("Area of Circle: " + c.Area());
        System.out.println("Volume of Cylinder: " + cy.Volume());
    }
}
