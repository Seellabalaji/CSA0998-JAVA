import java.util.Scanner;

class BankAccount {
    private String depositorName;
    private int accountNumber;
    private String accountType;
    private double balance;

    public BankAccount(String depositorName, int accountNumber, String accountType, double balance) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
        displayBalance();
    }

    public void withdraw(double amount) {
        if (balance - amount >= 500) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
            displayBalance();
        } else {
            System.out.println("Insufficient balance! Minimum balance should be maintained.");
            displayBalance();
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }

    public static BankAccount readAccountDetailsFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter depositor name: ");
        String depositorName = scanner.nextLine();
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // Clear the input buffer
        System.out.print("Enter account type (Savings/Current): ");
        String accountType = scanner.nextLine();
        return new BankAccount(depositorName, accountNumber, accountType, 10000); // Initial balance = 10000
    }

    public static void main(String[] args) {
        BankAccount account = readAccountDetailsFromUserInput();
        Scanner scanner = new Scanner(System.in);

        int choice;
        double amount;
        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Display Balance\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    amount = scanner.nextDouble();
                    account.deposit(amount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    amount = scanner.nextDouble();
                    account.withdraw(amount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
