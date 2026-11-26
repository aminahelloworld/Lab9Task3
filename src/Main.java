public class Main {

    public static void main(String[] args) {
        Account account = new Account("Amina Nurlanova", 1000, "PL-12345678");

        try {
            System.out.println("Trying to transfer 1500...");
            account.transfer(1500, "PL-87654321");   // more than the balance
        } catch (NotEnoughMoneyException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            System.out.println("Current balance: " + account.getBalance());
        }
    }
}