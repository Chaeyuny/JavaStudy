package poly.ex.pay1;

public abstract class PayStore {

    //문자열에 따라 생성해야 하는 메서드 달라짐
    // -> 메서드 찾아가는 기능만을 가진 추상 클래스 추가

    public static PayType findPay(String option){
        if(option.equals("kakao")){
            return new KakaoPay();
        }else if(option.equals("naver")){
            return new NaverPay();
        }else{
            return new DefaultPay();
        }
    }
}
