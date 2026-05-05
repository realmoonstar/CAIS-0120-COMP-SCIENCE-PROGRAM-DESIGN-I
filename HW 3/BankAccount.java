//Part 1 
 
public class BankAccount { 
 
    private String accountNumber; 
    private Person accountHolder; 
    private String dateCreated; 
    private double currentBalance; 
    private double withdrawLimit; 
    private double totalWithdrawn;   // tracks cumulative withdrawals 
 
    public BankAccount(String accountNumber, Person accountHolder, 
                       String dateCreated, double currentBalance, 
                       double withdrawLimit) { 
 
        this.accountNumber = accountNumber; 
        this.accountHolder = accountHolder; 
        this.dateCreated = dateCreated; 
        this.currentBalance = currentBalance; 
        this.withdrawLimit = withdrawLimit; 
        this.totalWithdrawn = 0; 
    } 
 
    public String getAccountNumber() { 
        return accountNumber; 
    } 
 
    public Person getAccountHolder() { 
        return accountHolder; 
    } 
 
    public String getDateCreated() { 
        return dateCreated; 
    } 
 
    public double getCurrentBalance() { 
        return currentBalance; 
    } 
 
    public double getWithdrawLimit() { 
        return withdrawLimit; 
    } 
 
    public void setWithdrawLimit(double withdrawLimit) { 
        this.withdrawLimit = withdrawLimit; 
    } 
 
    public String getAccountHolderName() { 
        return accountHolder.getName(); 
    } 
 
    public void depositMoney(double amount) { 
        currentBalance += amount; 
    } 
 
    public boolean withdrawMoney(double amount) { 
        if (amount > currentBalance) { 
            return false; 
        } 
        if (totalWithdrawn + amount > withdrawLimit) { 
            return false; 
        } 
 
        currentBalance -= amount; 
        totalWithdrawn += amount; 
        return true; 
    } 
 
    public String toString() { 
        return "Account Number: " + accountNumber + 
               "\nAccount Holder: " + accountHolder.getName() + 
               "\nDate Created: " + dateCreated + 
               "\nCurrent Balance: $" + currentBalance + 
               "\nWithdraw Limit: $" + withdrawLimit + 
               "\nTotal Withdrawn: $" + totalWithdrawn; 
    } 
} 
 
d to add person class like so import BankApplication.Person; 
 
