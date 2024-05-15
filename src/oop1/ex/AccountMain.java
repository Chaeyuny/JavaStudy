package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        //입금
        account.deposit(10000);
        //출금
        account.withdraw(9000);
        //출금시도 -> 잔액부족 출력 확인
        account.withdraw(2000);
        //잔고 출력
        System.out.println("잔고 : " + account.balance);
    }
}
