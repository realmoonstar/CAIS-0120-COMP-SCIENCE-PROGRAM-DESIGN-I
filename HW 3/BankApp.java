//Part2 
import java.util.Scanner; 
 
public class BankApp { 
    public static void main(String[] args) { 
 
        Scanner scan = new Scanner(System.in); 
 
        System.out.println("Enter account holder name:"); 
        String name = scan.nextLine(); 
 
        System.out.println("Enter gender (m/f):"); 
        char gender = scan.next().charAt(0); 
 
        System.out.println("Enter age:"); 
        int age = scan.nextInt(); 
        scan.nextLine(); // clear buffer 
 
        Person holder = new Person(name, gender, age); 
 
        System.out.println("Enter account number:"); 
        String accountNumber = scan.nextLine(); 
 
        System.out.println("Enter date created:"); 
        String dateCreated = scan.nextLine(); 
 
        System.out.println("Enter initial balance:"); 
        double balance = scan.nextDouble(); 
 
        System.out.println("Enter withdrawal limit:"); 
        double limit = scan.nextDouble(); 
 
        BankAccount account = new BankAccount(accountNumber, holder, dateCreated, balance, 
limit); 
 
        String command = ""; 
 
        while (!command.equalsIgnoreCase("QUIT")) { 
 
            System.out.println("\nEnter a command (DEPOSIT, WITHDRAW, BALANCE, QUIT):"); 
            command = scan.next(); 
 
            if (command.equalsIgnoreCase("BALANCE")) { 
                System.out.println("Current balance: $" + account.getCurrentBalance()); 
            } 
 
            else if (command.equalsIgnoreCase("DEPOSIT")) { 
                System.out.println("Enter amount to deposit:"); 
                double amount = scan.nextDouble(); 
                account.depositMoney(amount); 
                System.out.println("Deposit successful."); 
            } 
 
            else if (command.equalsIgnoreCase("WITHDRAW")) { 
                System.out.println("Enter amount to withdraw:"); 
                double amount = scan.nextDouble(); 
                boolean success = account.withdrawMoney(amount); 
 
                if (success) { 
                    System.out.println("Withdrawal successful."); 
                } else { 
                    System.out.println("Withdrawal failed."); 
                } 
            } 
 
            else if (!command.equalsIgnoreCase("QUIT")) { 
                System.out.println("Invalid Command, please try again"); 
            } 
        } 
 
        System.out.println("Goodbye!"); 
    } 
} 
 
//Part 3 would Need to add person class like so import BankApplication.Person
