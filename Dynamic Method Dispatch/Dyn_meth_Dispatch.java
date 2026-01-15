class One{
    public void greet(){
        System.out.println("Hello from class One");
    }
    public void name(){
        System.out.println("I am class One");
    }
}
class Two extends One{
    public void swagat(){
        System.out.println("Namaste from class Two");
    }
    @Override
    public void name(){
        System.out.println("I am class Two");
    }
}
public class Dyn_meth_Dispatch {
    public static void main(String[] args) {
        // One obj1 = new One();
        One obj = new Two();
        obj.greet();  // Calls method from class One 
        obj.name();   // Calls overridden method from class Two 
    }
}
