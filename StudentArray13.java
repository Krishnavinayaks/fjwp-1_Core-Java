/*
1. read and store student records with rollno, name, average marks of 10 students using arrays. and display the

same to user. display the student list who are scored above 60 as average marks.
*/
import java.util.Scanner;
public class StudentArray13
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] rollno = new int[10]; 
String[] name = new String[10]; 
double[] avgMarks = new double[10]; 
for (int i = 0; i < 10; i++) { 
System.out.println("Enter the roll number of student " + (i + 1) + ": ");
rollno[i] = sc.nextInt(); 
System.out.println("Enter the name of student " + (i + 1) + ": ");
name[i] = sc.next(); 
System.out.println("Enter the average marks of student " + (i + 1) + ": ");
avgMarks[i] = sc.nextDouble(); 
}
System.out.println("The student records are: ");
System.out.println("Roll no\tName\tAverage marks"); 
for (int i = 0; i < 10; i++) { 
System.out.println(rollno[i] + "\t" + name[i] + "\t" + avgMarks[i]); 
}
System.out.println("The students who scored above 60 as average marks are: ");
System.out.println("Roll no\tName\tAverage marks"); 
for (int i = 0; i < 10; i++) { 
if (avgMarks[i] > 60) { 
System.out.println(rollno[i] + "\t" + name[i] + "\t" + avgMarks[i]);
}
}
sc.close();
}
}
