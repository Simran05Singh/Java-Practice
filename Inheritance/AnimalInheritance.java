class Animal {
    public void disp() {
        System.out.println("I am an animal");
    }
}
class Dog extends Animal {
    public void displ() {
        System.out.println("Dog is also an animal");
    }
}
public class AnimalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.disp();
        d.displ();
    }
}
 