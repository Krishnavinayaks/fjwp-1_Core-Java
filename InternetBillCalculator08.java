/*1. Write a program which calculates the monthly bill amount for a
internet subscriber based on the following logic:
1) If the total data consumed is less than 10 GB then bill amount will be Rs. 300. (Basic charge)

2) If the data consumed is between 10 GB and 30 GB then bill
amount will be basic charge + 5* (Total GB consumed - 10).
That means consumers will be charged Rs 5 for each
additional GB consumed over 10 GB.

3) If the consumer consumes more than 30 GB then
The bill amount = 400 + 3 *(Total GB consumed - 30).
That means the consumer has to pay additional Rs 3 for each
GB above 30GB.
Use if-else block to solve the problem
*/
import java.util.Scanner;
class InternetBillCalculator08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total data consumed in GB: ");
        double totalDataConsumed = scanner.nextDouble();

        double basicCharge = 300.0;
        double billAmount;

        if (totalDataConsumed < 10) {
            billAmount = basicCharge;
        } else if (totalDataConsumed >= 10 && totalDataConsumed <= 30) {
            billAmount = basicCharge + 5 * (totalDataConsumed - 10);
        } else {
            billAmount = 400 + 3 * (totalDataConsumed - 30);
        }

        System.out.println("Monthly Bill Amount: Rs. " + billAmount);

        scanner.close();
    }
}
