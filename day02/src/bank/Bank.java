package bank;

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        System.out.println(account1);
        Account account2 = new Account(10000);
        System.out.println(account2);
    }
}
