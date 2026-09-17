import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student ID: ");
        String id = sc.nextLine();

        System.out.print("Enter marks in Subject 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter marks in Subject 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter marks in Subject 3: ");
        double m3 = sc.nextDouble();

        double average = (m1 + m2 + m3) / 3;

        System.out.println("\nStudent Details");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Average Marks: " + average);

        if (average >= 90)
            System.out.println("Performance: Excellent");
        else if (average >= 75)
            System.out.println("Performance: Very Good");
        else if (average >= 60)
            System.out.println("Performance: Good");
        else if (average >= 50)
            System.out.println("Performance: Average");
        else
            System.out.println("Performance: Needs Improvement");

        sc.close();
    }
}
