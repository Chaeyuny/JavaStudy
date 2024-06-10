package poly.ex.pay2;

import java.util.Scanner;

public class PayMain2 {
    //문제 3 - 사용자 입력받도록 수정 / exit 입력하면 프로그램 종료
    public static void main(String[] args) {
        PayService payService = new PayService();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("결제 수단을 입력하세요 : ");
            String payOption = scanner.nextLine();

            if(payOption.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.print("결제 금액을 입력하세요 : ");
            int amount = scanner.nextInt();
            scanner.nextLine();

            payService.processPay(payOption, amount);
        }

    }
}
