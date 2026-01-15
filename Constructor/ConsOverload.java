class Recy {
    int length;
    int breadth;

    public Recy() {
        this.length = 4;
        this.breadth = 5;
    }
    public Recy(int l ,int b ) {
        this.length = l;
        this.breadth = b;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class ConsOverload {
    public static void main(String[] args) {
        Recy r = new Recy(3,4);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}

