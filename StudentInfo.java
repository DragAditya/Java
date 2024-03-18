import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number of Students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        String[] name = new String[numStudents];
        String[] subject = new String[numStudents];
        int[] marks = new int[numStudents];

        for (int j = 0; j < numStudents; j++) {
            System.out.println("Enter The Student Name: ");
            name[j] = scanner.nextLine();
            System.out.println("Enter The Subject Name: ");
            subject[j] = scanner.nextLine();
            System.out.println("Enter The Marks: ");
            marks[j] = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
        }

        for (int k = 0; k < numStudents; k++) {
            System.out.println("Student Name: " + name[k]);
            System.out.println("Subject Name: " + subject[k]);
            System.out.println("Marks: " + marks[k]);
        }
    }
}
