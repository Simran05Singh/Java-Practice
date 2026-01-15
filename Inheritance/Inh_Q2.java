class Rectangle {
    float l, b;
    Rectangle(float l, float b) {
        this.l = l;
        this.b = b;
    }
    public float Area() {
        return (l * b);
    }
}
class Cuboid extends Rectangle {
    float h;
    Cuboid(float l, float b, float h) {
        super(l, b);
        this.h = h;
    }
    public float Volume() {
        return (l * b * h);
    }
}
public class Inh_Q2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5.5f, 6.5f);
        Cuboid c = new Cuboid(5.5f, 6.5f, 7.5f);
        System.out.println("Area of Rectangle: " + r.Area());
        System.out.println("Volume of Cuboid: " + c.Volume());
    }
}
