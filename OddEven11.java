/*3. Write a program to count and print the total number of odd and even
numbers from user inputs. Program will ask for user inputs in a loop. Loop
*/
import java.util.Scanner;
public class OddEven11 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int oddCount = 0;
int evenCount = 0;
int choice = 1;
while (choice == 1) {
System.out.println("Enter a number: ");
int num = sc.nextInt();
if (num % 2 == 0) {
evenCount++;
} else {
oddCount++;
}
System.out.println("Enter 1 to continue or any other number to exit: ");
choice = sc.nextInt();
}
System.out.println("The total number of odd numbers is: " + oddCount);
System.out.println("The total number of even numbers is: " + evenCount);
sc.close();
}
}
