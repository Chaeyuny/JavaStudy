package review_ex.pdf12_poly;

public class PayService {

    public void processPay(String option, int amount){

        System.out.println("결제를 시작합니다 : option = " + option + ", amount=" + amount);

        //결제수단 선택->결제 루틴 수행
        Pay pay = PaySelect.findPay(option); //Pay가 반환타입인 메서드
        boolean result = pay.pay(amount);

        if (result){
            System.out.println("결제가 성공했습니다.");
        }else{
            System.out.println("결제가 실패했습니다.");
        }

    }
}
