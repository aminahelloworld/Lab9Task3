public class Account {

    private String owner;
    private int balance;
    private String accountNumber;

    // Constructor with all parameters
    public Account(String owner, int balance, String accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    // Getters and setters
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Method simulating a transfer
    public void transfer(int amount, String targetAccountNumber) throws NotEnoughMoneyException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Transfer amount must be positive.");
        }
        if (amount > balance) {
            throw new NotEnoughMoneyException(
                    "Transfer of " + amount + " failed. Available funds: " + balance);
        }
        balance -= amount;
        System.out.println("Transferred " + amount + " to account " + targetAccountNumber);
    }
}