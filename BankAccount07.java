/*Assignment-2. Write a Java program that allows the user to create a bank account and perform transactions such as deposit, withdrawal, and balance inquiry. Using a conditional operator (ternary operator ), display the message whether minimum balance is maintained or not. Steps:

 ? Create a class BankAccount 
 ? Add three member variables: String accountHolderName , int accountNumber and int balance; 
 ? Add a constructors using all three members ? Add getters and setters. ? Add method deposit (int), withdraw(int) 
 ? Implement the methods by increasing or decreasing the balance ? In the main method create a bank account 
 ? Withdraw money from this account and/or deposit into this account ? Get the balance 
 ? Create a string variable “status” inside the main method 
 ? Assign values to status as “Minimum Balance Maintained” if balance is above or equal to 5000. Otherwise values of status will be “Minimum Balance not Maintained”. Use conditional operator (ternary operator ) to assign the values of the status. 
 ? Display the status
 */
class BankAccount07 {
    private String accountHolderName;
    private int accountNumber;
    private int balance;

    public BankAccount07(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount07 account = new BankAccount07("John Doe", 123456, 10000);
        account.withdraw(5000);
        account.deposit(2000);
        int balance = account.getBalance();
        String status = balance >= 5000 ? "Minimum Balance Maintained" : "Minimum Balance not Maintained";
        System.out.println("Status: " + status);
    }
}
