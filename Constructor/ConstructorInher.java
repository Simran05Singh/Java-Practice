class Base {
    int x;
    Base () {
        System.out.println("I am a constructor");
    }
    Base(int a) {
        System.out.println("I am a constructor with value: "+ a);
    }
}
class Derived extends Base {
    int y;
    Derived() {
        super(0);
        System.out.println("I am derived class constructor");
    }
}

public class ConstructorInher {
    public static void main(String[] args) {/
        Derived d = new Derived();
    }
}
