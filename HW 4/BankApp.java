import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();

        try { bank.load(); }
        catch (Exception e) { System.out.println("No saved data found."); }

        int nextAccountNumber = 1;

        while (true) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1 Create New Account");
            System.out.println("2 Perform Operations on Existing Account");
            System.out.println("3 Delete Account");
            System.out.println("4 Display Average Balance");
            System.out.println("5 Display Max & Min Balance");
            System.out.println("6 Display Low Balance Accounts");
            System.out.println("7 Quit");
            System.out.print("Choose: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Name: ");
                    String name = input.nextLine();
                    Person p = new Person(name, 'm', 18);

                    System.out.print("Initial balance: ");
                    double bal = input.nextDouble();

                    System.out.print("Withdraw limit: ");
                    double limit = input.nextDouble();
                    input.nextLine();

                    System.out.print("Date created: ");
                    String date = input.nextLine();

                    System.out.print("Type (C = Checking, S = Savings): ");
                    String type = input.nextLine().toUpperCase();

                    BankAccount acc;

                    if (type.equals("C"))
                        acc = new CheckingAccount(nextAccountNumber, p, date, bal, limit);
                    else
                        acc = new SavingsAccount(nextAccountNumber, p, date, bal, limit);

                    bank.addAccount(acc);
                    System.out.println("Account created. Number: " + nextAccountNumber);
                    nextAccountNumber++;

                    operateAccount(acc, input);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    int num = input.nextInt();
                    BankAccount found = bank.findAccount(num);

                    if (found == null)
                        System.out.println("Account not found.");
                    else
                        operateAccount(found, input);
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    int del = input.nextInt();
                    System.out.println(bank.deleteAccount(del) ? "Deleted." : "Not found.");
                    break;

                case 4:
                    System.out.println("Average balance: $" + bank.getAverageBalance());
                    break;

                case 5:
                    System.out.println("Max: $" + bank.getMaximumBalance());
                    System.out.println("Min: $" + bank.getMinimumBalance());
                    break;

                case 6:
                    for (BankAccount a : bank.getLowBalanceAccounts())
                        System.out.println(a.getAccountNumber() + " - $" + a.getCurrentBalance());
                    break;

                case 7:
                    try { bank.save(); } catch (Exception e) {}
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void operateAccount(BankAccount acc, Scanner input) {

        while (true) {
            System.out.println("\n--- ACCOUNT MENU (" + acc.getAccountNumber() + ") ---");
            System.out.println("BALANCE, DEPOSIT, WITHDRAW, EXIT");
            System.out.print("Choose: ");

            String cmd = input.next().toUpperCase();

            switch (cmd) {

                case "BALANCE":
                    System.out.println("Balance: $" + acc.getCurrentBalance());
                    break;

                case "DEPOSIT":
                    System.out.print("Amount: ");
                    acc.depositMoney(input.nextDouble());
                    break;

                case "WITHDRAW":
                    System.out.print("Amount: ");
                    boolean ok = acc.withdrawMoney(input.nextDouble());
                    System.out.println(ok ? "Success" : "Failed");
                    break;

                case "EXIT":
                    return;

                default:
                    System.out.println("Invalid.");
            }
        }
    }
}
