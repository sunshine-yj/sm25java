package bank;

public class Atm {
    public static void main(String[] args) {
        Account account = new Account(10000);
        System.out.println(account);
        try {
            account.withdraw(20000);
        } catch (NotEnoughbalanceException e) {
            System.out.println("잔액이 부족합니다.");
            System.out.println(e.getMessage());
        }
        try {
            account.deposit(20000);
        } catch (NegativeValueException e) {
            System.out.println("양수금액을 입급 하세요");
            System.out.println(e.getMessage());
        }
        System.out.println(account);


    }
}
