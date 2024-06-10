package poly.ex.pay1;

public class PayMain1 {
    public static void main(String[] args) {
        //문제2 - 리팩토링
        // : 새로운 결제수단 쉽게 추가할 수 있도록 코드 리팩토링하기
        // : ocp 원칙 지키기, PayMain0 코드 제외하고 모두 변경가능.
        // : 리팩토링 후에도 실행결과 pay0과 동일하도록 유지

        PayService payService = new PayService();

        //kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        //naver 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        //잘못된 결제 수단 선택
        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);
    }
}
