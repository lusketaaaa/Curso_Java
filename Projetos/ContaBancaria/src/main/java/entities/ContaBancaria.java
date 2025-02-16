package entities;
public class ContaBancaria {
    private String accountHolder;
    private int accountNumber;
    private double accountBalance;

    public ContaBancaria(int accountNumber, String accountHolder, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountName(String newHolder) {
        accountHolder = newHolder;
    }

    public void makeDeposit(double value) {
        this.accountBalance += value;
    }

    public String haveBalance(double withdrawRequest) {
        if (withdrawRequest < this.accountBalance) {
            return "false";
        }
        else {
            return "true";
        }
    }

    public void makeWithdraw(double value) {
        value = value + 5;
        this.accountBalance = this.accountBalance - value;
    }

    public String getAccountInfo() {
        return "Account " + getAccountNumber() +
                ", Holder: " + getAccountHolder() +
                ", Balance: $ " + String.format("%.2f", getAccountBalance());
    }
}