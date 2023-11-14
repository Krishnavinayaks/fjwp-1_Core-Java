/*Lab 1:



	class name : Product



	data members :  prdid, prddescription, batchcode, price, profit;



	method:  addproduct() with args assign the values to datamembers and display to user

	(with args and no return value)



		calculate_profit()  if price>=10000 and <=100000  profit is 10% on price

				if price between 100000 to 500000 profit is 15% on price

				if price is >500000 profit is 20% on price (with return type and no args)
*/
class Product12 {
int prdid;
String prddescription;
String batchcode;
double price;
double profit;
void addProduct(int prdid, String prddescription, String batchcode, double price) {
this.prdid = prdid;
this.prddescription = prddescription;
this.batchcode = batchcode;
this.price = price;
System.out.println("Product added successfully:");
displayProduct();
}
double calculateProfit() {
if (price >= 10000 && price <= 100000) {
profit = 0.10 * price;
} else if (price > 100000 && price <= 500000) {
profit = 0.15 * price;
} else if (price > 500000) {
profit = 0.20 * price;
}
return profit;
}
void displayProduct() {
System.out.println("Product ID: " + prdid);
System.out.println("Product Description: " + prddescription);
System.out.println("Batch Code: " + batchcode);
System.out.println("Price: Rs " + price);
System.out.println("Profit: Rs " + calculateProfit());
}
public static void main(String[] args) {
Product12 product = new Product12();
product.addProduct(1, "smartphone with advanced features", "Miphone", 15000.0);
}
}
