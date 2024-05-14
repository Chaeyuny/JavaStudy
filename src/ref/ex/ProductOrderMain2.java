package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        //class1.ex.ProductOrderMain 리팩토링

        /*여러 상품의 주문정보를 배열로 관리하고, 그 정보들을 출력하고,
        * 최종 결제 금액을 계산하여 출력하기 -- 문제에 주어진 메서드 포함*/

        //여러 상품의 주문 정보 담는 배열 생성
        ProductOrder[] order = new ProductOrder[3];

        order[0] = createOrder("두부", 2000, 2);
        order[1] = createOrder("김치", 5000, 1);
        order[2] = createOrder("콜라", 1500, 2);

        printOrders(order);

        //**단축키 ctrl + alt + v
        //   :getTotalAmount 앞에 커서 두고 누르면 int totalAmount 자동생성
        int totalAmount = getTotalAmount(order);
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

        //개선할 부분 : 처음에 일반 for문 사용함
        //             -> 값만 필요하므로 foreach 가능
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }

}
