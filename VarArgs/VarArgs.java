public class VarArgs {
    static void sum(int ...arr) {
        int s = 0;
        for (int a: arr) {
            System.out.println(a); 
        }
    }
    public static void main(String[] args) {
        sum(2,3,4);
        sum(1,2,3);
    }
    
}
