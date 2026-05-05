public class CheckingAccount extends BankAccount {

    private int depositCount = 0;

    public CheckingAccount(int num, Person p, String date, double bal, double limit) {
        super(num, p, date, bal, limit);
    }

    @Override
    public void depositMoney(double amount) {
        super.depositMoney(amount);
        depositCount++;

        if (depositCount == 10) {
            double interest = currentBalance * 0.05;
            super.depositMoney(interest);
            depositCount = 0;
        }
    }
}
