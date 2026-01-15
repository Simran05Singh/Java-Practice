import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + "\n" + b);
        sc.close();
    }
}