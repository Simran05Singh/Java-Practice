class Ekclass {
    int a;
    Ekclass(int v){
        a=v;
    }
    public int get_a() {
        return a;
    }
}
public class Const {
    public static void main(String[] args) {
        Ekclass e= new Ekclass(5);
        System.out.println(e.get_a());
    }
}
