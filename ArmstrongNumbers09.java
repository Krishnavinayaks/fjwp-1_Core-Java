/*1. Write a program to find out all the armstrong numbers within a given
range using a method named printArmstrongNumber( int start, int
end) by taking input from the user. The program should print the
Armstrong number in a given range starting from “start” and ending
with “end”.
Note: input should be taken from the keyboard. Use a loop to calculate the
Armstrong number from “start” to “end”. Also use loops to calculate the
cube of a number. Do not use the Math.pow() function.
*/
import java.util.Scanner;
public class ArmstrongNumbers09 {
public static boolean isArmstrong(int n) {
int sum = 0;
int temp = n; 
while (temp > 0) {
int digit = temp % 10; 
sum += digit * digit * digit;
temp /= 10; 
}
return sum == n;
}
public static void printArmstrongNumber(int start, int end) {
for (int i = start; i <= end; i++) {
if (isArmstrong(i)) { 
System.out.println(i);
}
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in); 
System.out.println("Enter the start of the range: "); 
int start = sc.nextInt();
System.out.println("Enter the end of the range: "); 
int end = sc.nextInt();
System.out.println("The Armstrong numbers in the range " + start + " to " + end + " are: "); 
printArmstrongNumber(start, end); 
sc.close();
}
}