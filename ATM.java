import java.util.Scanner;

public class ATM {
    private double balance = 1000.00;

    public void showMenu() {
        System.out.println("Welcome to ATM!");
        System.out.println("Please select an option:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    public void depositMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        double depositAmount = scanner.nextDouble();


        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println("Successfully deposited $" + depositAmount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }


    public void withdrawMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();


        if (withdrawAmount > 0 && withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("Successfully withdrawn " + withdrawAmount);
        } else if (withdrawAmount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }


    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            atm.showMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    atm.depositMoney();
                    break;
                case 3:
                    atm.withdrawMoney();
                    break;
                case 4:
                    System.out.println("Thank you for using ATM! Goodbye.");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
//My first java project 