import java.io.*;
import java.util.ArrayList;

public class Bank {

    private ArrayList<BankAccount> accounts;
    private double balanceThreshold = 100;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount acc) {
        accounts.add(acc);
    }

    public BankAccount findAccount(int number) {
        for (BankAccount acc : accounts)
            if (acc.getAccountNumber() == number)
                return acc;
        return null;
    }

    public boolean deleteAccount(int number) {
        BankAccount acc = findAccount(number);
        if (acc != null) {
            accounts.remove(acc);
            return true;
        }
        return false;
    }

    public double getAverageBalance() {
        if (accounts.isEmpty()) return 0;
        double sum = 0;
        for (BankAccount acc : accounts)
            sum += acc.getCurrentBalance();
        return sum / accounts.size();
    }

    public double getMaximumBalance() {
        if (accounts.isEmpty()) return 0;
        double max = accounts.get(0).getCurrentBalance();
        for (BankAccount acc : accounts)
            if (acc.getCurrentBalance() > max)
                max = acc.getCurrentBalance();
        return max;
    }

    public double getMinimumBalance() {
        if (accounts.isEmpty()) return 0;
        double min = accounts.get(0).getCurrentBalance();
        for (BankAccount acc : accounts)
            if (acc.getCurrentBalance() < min)
                min = acc.getCurrentBalance();
        return min;
    }

    public ArrayList<BankAccount> getLowBalanceAccounts() {
        ArrayList<BankAccount> low = new ArrayList<>();
        for (BankAccount acc : accounts)
            if (acc.getCurrentBalance() < balanceThreshold)
                low.add(acc);
        return low;
    }

    public void save() throws IOException {
        FileWriter fw = new FileWriter("bankdata.txt");
        for (BankAccount acc : accounts) {
            fw.write(acc.getAccountNumber() + "," +
                     acc.getAccountHolderName() + "," +
                     acc.getCurrentBalance() + "," +
                     acc.getWithdrawLimit() + "\n");
        }
        fw.close();
    }

    public void load() throws IOException {
        accounts.clear();
        File file = new File("bankdata.txt");
        if (!file.exists()) return;

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            int num = Integer.parseInt(parts[0]);
            String name = parts[1];
            Person p = new Person(name, 'm', 18);
            double bal = Double.parseDouble(parts[2]);
            double limit = Double.parseDouble(parts[3]);

            BankAccount acc = new BankAccount(num, p, "Loaded", bal, limit);
            accounts.add(acc);
        }

        br.close();
    }
}
