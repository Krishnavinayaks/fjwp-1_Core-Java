/*2. Write a program to calculate the gross salary of a group of
employees. Basic salary should be taken from the user.
If the basic salary is greater than 15000 ,HRA=20% and DA=60% will be
given, else HRA=3000 and DA 70% will be given to the employee.
Note:Input of basic salary will be taken from the keyboard. After calculating
the salary of one employee, the program will ask for the user's choice as
int. If “-1” is entered then the loop will continue and the loop will exit for
other int inputs.
*/
import java.util.Scanner;
public class GrossSalary10{
public static double calculateGrossSalary(double basicSalary) {
double hra;
double da;
double grossSalary;
if (basicSalary > 15000) {
hra = 0.2 * basicSalary;
da = 0.6 * basicSalary;
} else {
hra = 3000;
da = 0.7 * basicSalary;
}
grossSalary = basicSalary + hra + da;
return grossSalary;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int choice = -1;
do {
System.out.println("Enter the basic salary of an employee: ");
double basicSalary = sc.nextDouble();
double grossSalary = calculateGrossSalary(basicSalary);
System.out.println("The gross salary of the employee is: " + grossSalary);
System.out.println("Enter -1 to continue or any other number to exit: ");
choice = sc.nextInt();
} while (choice == -1);
System.out.println("Thank you for using the program.");
sc.close();
}
}