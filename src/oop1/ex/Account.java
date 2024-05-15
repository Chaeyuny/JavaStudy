package oop1.ex;

public class Account {
    //속성
    int balance; //잔액

    //기능

    //입금 메서드
    void deposit(int amount){ //메인에서 넘어오는 입금액 값
        balance +=amount;
    }

    //출금 메서드
    void withdraw(int amount){
        if (balance >= amount){
            balance -= amount;
        }else{
            System.out.println("잔액이 부족합니다!");
        }
    }
}
