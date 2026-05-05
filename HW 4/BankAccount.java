public class BankAccount {

    protected int accountNumber;
    protected Person accountHolder;
    protected String dateCreated;
    protected double currentBalance;
    protected double withdrawLimit;
    protected double totalWithdrawn;

    public BankAccount(int accountNumber, Person accountHolder, String dateCreated,
                       double currentBalance, double withdrawLimit) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.dateCreated = dateCreated;
        this.currentBalance = currentBalance;
        this.withdrawLimit = withdrawLimit;
        this.totalWithdrawn = 0;
    }

    public int getAccountNumber() { return accountNumber; }
    public Person getAccountHolder() { return accountHolder; }
    public String getDateCreated() { return dateCreated; }
    public double getCurrentBalance() { return currentBalance; }
    public double getWithdrawLimit() { return withdrawLimit; }

    public void setAccountHolder(Person p) { this.accountHolder = p; }
    public void setWithdrawLimit(double limit) { this.withdrawLimit = limit; }

    public String getAccountHolderName() {
        return accountHolder.getName();
    }

    public void depositMoney(double amount) {
        if (amount > 0) currentBalance += amount;
    }

    public boolean withdrawMoney(double amount) {
        if (amount <= 0) return false;
        if (amount > currentBalance) return false;
        if (totalWithdrawn + amount > withdrawLimit) return false;

        currentBalance -= amount;
        totalWithdrawn += amount;
        return true;
    }

    public String toString() {
        return "Account Number: " + accountNumber +
               "\nHolder: " + getAccountHolderName() +
               "\nDate Created: " + dateCreated +
               "\nBalance: $" + currentBalance +
               "\nWithdraw Limit: $" + withdrawLimit +
               "\nTotal Withdrawn: $" + totalWithdrawn;
    }
}
