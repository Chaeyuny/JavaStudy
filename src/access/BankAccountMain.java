package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("balance = "+ account.getBalance());

        //BankAccount 사용자 입장에서는 account, deposit, withdraw 메서드만 알면 됨
    }
}
