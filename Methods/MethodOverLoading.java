class Method {
    public void sum(int a, int b) {
        System.out.println(a+b);
    }
    public void sum(float a, float b) {
        System.out.println(a+b);
    }
}
public class MethodOverLoading {
    public static void main(String[] args) {
        Method m = new Method();
    m.sum(2,3);
    m.sum(1.1f ,2.2f);
    }
}
