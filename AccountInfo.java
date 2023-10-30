public class AccountInfo {
    private double balance;
    private double interestRate;

    public AccountInfo(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }
    public AccountInfo() {
        this(0, 0.05); 
    }
    public void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added $" + amount + " to the account. Current balance: $" + balance);
        } else {
            System.out.println("Amount to be added must be greater than 0.");
        }
    }
    public void withdrawMoney(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew $" + amount + " from the account. Current balance: $" + balance);
            } else {
                System.out.println("Insufficient funds. A $5 penalty will be charged.");
                balance -= 5;
                System.out.println("Penalty of $5 charged. Current balance: $" + balance);
            }
        } else {
            System.out.println("Amount to be withdrawn must be greater than 0.");
        }
    }
    public void inquireBalance() {
        System.out.println("Current balance: $" + balance);
    }
    public void computeInterest() {
        double interestEarned = balance * interestRate;
        balance += interestEarned;
        System.out.println("Interest earned: $" + interestEarned);
        System.out.println("Updated balance after interest: $" + balance);
    }

    public static void main(String[] args) {
        AccountInfo account1 = new AccountInfo(1000, 0.03); // Create an account with an initial balance of $1000 and 3% interest rate
        account1.inquireBalance();
        account1.addMoney(500);
        account1.withdrawMoney(300);
        account1.computeInterest();
    }
}
