package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2_re {
    public static void main(String[] args) {
        //ProductOrderMain2 사용자 입력 받도록 리팩토링

        Scanner sc = new Scanner(System.in);

        //1. 입력할 주문 개수 설정
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int n = sc.nextInt();
        sc.nextLine(); // 입력 버퍼를 비우기 위한 코드


        //2. 입력 개수만큼 주문 목록 입력받기

        //  ** 객체의 참조값을 담는 배열 선언
        ProductOrder[] orders = new ProductOrder[n];

        for(int i = 0; i<orders.length; i++){
            System.out.println(i+1 + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명 : ");
            String productName = sc.nextLine();

            System.out.print("가격 : ");
            int price = sc.nextInt();

            System.out.print("수량 : ");
            int quantity = sc.nextInt();
            sc.nextLine(); // 입력 버퍼를 비우기 위한 코드

        //3. 입력받은 상품명, 가격, 수량을 매개변수로 하여 객체 생성하고 반환된 참조값을 order[] 배열에 담기
            orders[i] = createOrder(productName, price, quantity);
        }

        //4. 주문 목록 (order 배열) 출력
        printOrders(orders);

        //5. 총 금액 출력
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 금액 : " + totalAmount);

    }

    //ProductOrder 생성, 매개변수 초기값 설정 및 ProductOrder 반환 메서드
    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    //ProductOrder 배열 출력 메서드
    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    /*배열을 받아서 배열에 들어있는 전체 ProductOrder 총 결제금액을
    계산하고 결과를 반환하는 메서드 */
    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }

}
