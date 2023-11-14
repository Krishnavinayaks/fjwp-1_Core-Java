/*classname : Bill

data member : billno - int, description - string , sales_amount, discount, amt_afterdiscount - double

method:

	readbill(): from the user read billno,description, sales_amount

	calculatebill(): if sales_amount>50000, discount=10%, else discount=2%, then calculate amt_afterdiscount

	showbill(): display all the datamember.

create 2 obkects to implement for 2 bills

*/
import java.util.Scanner;
class Bill05 {
    private int billno;
    private String description;
    private double salesAmount;
    private double discount;
    private double amtAfterDiscount;

    public void readBill() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Bill Number: ");
        billno = scanner.nextInt();

        System.out.println("Enter Description: ");
        description = scanner.next();

        System.out.println("Enter Sales Amount: ");
        salesAmount = scanner.nextDouble();

        scanner.close();
    }

    public void calculateBill() {
        if (salesAmount > 50000) {
            discount = 0.10;
        } else {
            discount = 0.02;
        }

        amtAfterDiscount = salesAmount * (1 - discount);
    }

    public void showBill() {
        System.out.println("Bill Number: " + billno);
        System.out.println("Description: " + description);
        System.out.println("Sales Amount: $" + salesAmount);
        System.out.println("Discount: " + (discount * 100) + "%");
        System.out.println("Amount After Discount: $" + amtAfterDiscount);
    }

    public static void main(String[] args) {
        Bill05 bill1 = new Bill05();
        Bill05 bill2 = new Bill05();

        System.out.println("Enter Bill 1 Details:");
        bill1.readBill();
        bill1.calculateBill();

        System.out.println("\nBill 1 Details:");
        bill1.showBill();

        System.out.println("\nEnter Bill 2 Details:");
        bill2.readBill();
        bill2.calculateBill();

        System.out.println("\nBill 2 Details:");
        bill2.showBill();
    }
}
