import java.util.Scanner;
class InternetBillCalculator {
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
