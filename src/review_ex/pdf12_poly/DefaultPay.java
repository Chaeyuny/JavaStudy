package review_ex.pdf12_poly;

public class DefaultPay implements Pay{
    //결제 수단이 없는 경우도 결제 종류로 보기
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
