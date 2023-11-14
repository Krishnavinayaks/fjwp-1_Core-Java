/*
Assignment-2
Define a student class with following data members
Idno, name, course and average
Add methods to read and display the student data.
*/
import java.util.Scanner;

public class Student04 {
    private int idno;
    private String name;
    private String course;
    private double average;

    public void readStudentData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student ID: ");
        idno = scanner.nextInt();

        System.out.println("Enter Student Name: ");
        name = scanner.next();
        System.out.println("Enter Student Course: ");
        course = scanner.next(); 
        System.out.println("Enter Student Average: ");
        average = scanner.nextDouble();

        scanner.close();
    }

    public void displayStudentData() {
        System.out.println("Student ID: " + idno);
        System.out.println("Student Name: " + name);
        System.out.println("Student Course: " + course);
        System.out.println("Student Average: " + average);
    }

    public static void main(String[] args) {
        Student04 student = new Student04();

        System.out.println("Enter Student Details:");
        student.readStudentData();

        System.out.println("\nStudent Details:");
        student.displayStudentData();
    }
}
