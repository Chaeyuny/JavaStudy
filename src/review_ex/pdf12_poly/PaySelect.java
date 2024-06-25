package review_ex.pdf12_poly;

public abstract class PaySelect { //기능만 제공하므로 추상 클래스

    public static Pay findPay(String option){ //참조형 변수도 메서드 반환형태로 사용가능

        if(option.equals("kakao")){
            return new KakaoPay();
        }else if(option.equals("naver")){
            return new NaverPay();
        }else{
            return new DefaultPay(); // null체크 방지
        }

    }



}
