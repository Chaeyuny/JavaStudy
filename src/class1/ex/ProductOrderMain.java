package class1.ex;

public class ProductOrderMain {
    /*ProductOrderMain 클래스 안에 main() 메서드를 포함하여
    여러 상품의 주문 정보를 배열로 관리하고, 그 정보들을 출력하고, 최종 결제 금액을 계산해 출력하기 */

    public static void main(String[] args) {

        ProductOrder[] productOrder = new ProductOrder[3];

        ProductOrder product1 = new ProductOrder();
        product1.productName = "두부";
        product1.price = 2000;
        product1.quantity = 2;
        productOrder[0] = product1;

        ProductOrder product2 = new ProductOrder();
        product2.productName = "김치";
        product2.price = 5000;
        product2.quantity = 1;
        productOrder[1] = product2;

        ProductOrder product3 = new ProductOrder();
        product3.productName = "콜라";
        product3.price = 1500;
        product3.quantity = 2;
        productOrder[2] = product3;


        int totalPrice = 0;

        for (ProductOrder order : productOrder) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량:" + order.quantity);
            totalPrice += order.price * order.quantity; // 상품 값 누적해서 더하기
        }
        System.out.println("총 결제 금액 : " + totalPrice);

    }

}
