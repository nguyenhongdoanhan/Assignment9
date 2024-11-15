package Example;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Student {
    String id;       
    String name;     
    int age;          
    LocalDate date;   
    public void enterStudentInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        id = scanner.nextLine();

        System.out.print("Enter student name: ");
        name = scanner.nextLine();

        System.out.print("Enter student age: ");
        age = scanner.nextInt();

        System.out.print("Enter enrollment day: ");
        int day = scanner.nextInt();

        System.out.print("Enter enrollment month: ");
        int month = scanner.nextInt();

        System.out.print("Enter enrollment year: ");
        int year = scanner.nextInt();

        date = LocalDate.of(year, month, day);

        scanner.close();
    }

    public void displayStudentInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Enrollment Date: " + date.format(formatter));
    }
}

