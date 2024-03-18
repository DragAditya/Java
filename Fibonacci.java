import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Number; ");
        int num = scanner.nextInt();
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i < num; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }

}
