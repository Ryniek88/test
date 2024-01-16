public class MainAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(1000);
        account.withdrawing(400);
        account.depositing(5000);
    }
}
