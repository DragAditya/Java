import java.util.Scanner;

class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        if (isPalindrom(num) == true) {
            System.out.println("Number is palindrom");
        } else {
            System.out.println("Number is not palindrom");
        }
    }

    public static boolean isPalindrom(int num) {
        int temp = num;
        int rev = 0;

        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (temp == rev) {
            return true;
        } else {
            return false;
        }
    }
}
