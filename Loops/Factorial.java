import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=1;
        System.out.println("Enter no");
        int n = sc.nextInt();
        for (int i=1 ; i<=n ; i++){
            s = s*i;
        }
        System.out.println("Factorial = " + s);
    }
}
