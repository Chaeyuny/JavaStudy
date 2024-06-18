package review_ex.pdf2_ref;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        //Main2 리팩토링 - 사용자 입력 받도록 개선

        Scanner sc = new Scanner(System.in);

        System.out.print("주문의 개수를 입력하세요 : ");
        int num = sc.nextInt();
        sc.nextLine();

        ProductOrder[] orders = new ProductOrder[num];

        for(int i=0; i<orders.length; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요");

            System.out.print("상품명 : ");
            String productName = sc.nextLine();
            System.out.print("가격 : ");
            int price = sc.nextInt();
            System.out.print("수량 : ");
            int quantity = sc.nextInt();
            sc.nextLine(); //입력 버퍼 비우는 코드

            //생성한 객체의 참조값 (메서드 결과값)을 배열에 저장
            orders[i] = createOrder(productName, price, quantity);


        }

        printOrders(orders);
        int totalAmount = getTotalAmount(orders); //참조값 한 번 담기
        System.out.println("총 결제 금액 : " + totalAmount);

    }


    private static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    private static void printOrders(ProductOrder[] orders) {

        for (ProductOrder productOrder : orders) {
            System.out.println("상품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량 : " + productOrder.quantity);
        }
    }

    private static int getTotalAmount(ProductOrder[] orders) {
        int totalMoney = 0;
        for (ProductOrder productOrder : orders) {
            totalMoney += productOrder.price*productOrder.quantity;
        }

        return totalMoney;
    }






}
