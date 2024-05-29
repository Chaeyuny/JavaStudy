package access;

public class BankAccount {

    /*좋은 캡슐화
      : 객체 데이터는 모두 숨기고, 기능은 꼭 필요한 것만 노출
    */

    private int balance;

    //생성자 단축키 alt + insert
    // -> constructor (기본생성자는 select None선택)
    public BankAccount() {
        this.balance = 0; //초깃값 0이라 없어도 되지만 public을 보기 위해 기재
    }

    //public 메서드 : deposit 입금
    public void deposit(int amount){
        if(isAmountValid(amount)){
            balance += amount;
        }else{
            System.out.println("유효하지 않은 금액입니다.");
        }

    }

    //잔고 유효 체크 -> 내부에서만 사용하는 기능이므로 숨김
    private boolean isAmountValid(int amount){
        // 금액이 0보다 커야함
        return amount > 0;
    }

    //public 메서드 : withdraw 출금
    public void withdraw(int amount){
        if(isAmountValid(amount) && balance - amount >= 0){
            balance -= amount;
        }else{
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    public int getBalance(){
        return balance;
    }


}
