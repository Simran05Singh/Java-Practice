class A {
    public int a;
    public int met1() {
        return a;
    }
    public void met2() {
        System.out.println("I am method 2 of class A");
    }
}
class B extends A {
    @Override
    public void met2() {
        System.out.println("I am method 2 of class B");
    }
}
public class Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.met2();
        B b = new B();
        b.met2();
    }
}
