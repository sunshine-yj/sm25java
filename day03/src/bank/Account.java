package bank;

public class Account {

    private String accNo;
    private double balance;

    public Account() {
        this.accNo = "11111111";
        this.balance = 0;
    }

    public Account(double balance) {
        this.accNo = "22222222";
        this.balance = balance;
    }

    public Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public void deposit(double money) throws NegativeValueException {
        if (money < 0) {
            throw new NegativeValueException("EX0002");
        }
        this.balance += money;
        System.out.println("입금처리 완료: ");
    }

    public void withdraw(double money) throws NotEnoughbalanceException {
        // 출금 금액이 balance보다 커야 한다.
        if(money > this.balance){
            throw new NotEnoughbalanceException("EX0001");
        }
        this.balance -= money;
        System.out.printf("당행 출금 완료: \n");

    }

    public void withdraw(double money, String acc) {
        this.balance -= money;
        System.out.println("타행 출금 완료: ");
    }

    @Override
    public String toString() {
        return "Account{" + "accNo='" + accNo + '\'' + ", balance=" + balance + '}';
    }

    public double getBalance() {
        return balance;
    }
}
