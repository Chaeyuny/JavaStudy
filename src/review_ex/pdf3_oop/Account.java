package review_ex.pdf3_oop;

public class Account {
    int balance;

    //balance 값 자체가 변경되므로 int형, return 안해도 됨
    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        if(balance >= amount){
            balance -=amount;
        }else{
            System.out.println("잔액이 부족합니다.");
        }
    }
}
