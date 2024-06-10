package poly.ex.pay1;

public class DefaultPay implements PayType{
    //결제수단이 없을 경우도 수단 중 하나로 넣을 수 있음

    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
