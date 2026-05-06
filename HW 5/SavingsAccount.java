public class SavingsAccount extends BankAccount {

    private int depositCount = 0;
    private int withdrawalCount = 0;

    public SavingsAccount(int num, Person p, String date, double bal, double limit) {
        super(num, p, date, bal, limit);
    }

    @Override
    public void depositMoney(double amount) {
        super.depositMoney(amount);
        depositCount++;
        withdrawalCount = 0;

        if (depositCount == 10) {
            double interest = currentBalance * 0.20;
            super.depositMoney(interest);
            depositCount = 0;
        }
    }

    @Override
    public boolean withdrawMoney(double amount) {
        boolean success = super.withdrawMoney(amount);

        if (success) {
            withdrawalCount++;
            depositCount = 0;

            if (withdrawalCount == 3) {
                double fee = currentBalance * 0.05;
                super.withdrawMoney(fee);
                withdrawalCount = 0;
            }
        }

        return success;
    }
}
