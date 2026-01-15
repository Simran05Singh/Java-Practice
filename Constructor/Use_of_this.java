class Ekclass {
    int a;
    Ekclass(int a){
        this.a=a;
    }
    public int get_a() {
        return a;
    }
}
class Doclass extends Ekclass {
    Doclass(int c) {
        super(c);
        System.out.println("I am a constructor of Doclass");
    }
}
public class Use_of_this {
    public static void main(String[] args) {
        Ekclass e= new Ekclass(65);
        Doclass d= new Doclass(45);
        // System.out.println(e.get_a());
    }
}

