class Base {
    int x;
    public int getx() {
        return x;
    }
    public void setx(int X) {
        x = X;
    }
}
class Derived extends Base {
    int y ;
    public int gety() {
        return y;
    }
    public void sety(int Y) {
        y = Y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setx(5);
        System.out.println(b.getx());
        Derived d = new Derived();
        d.setx(8);
        System.out.println(d.getx());
    }
}
