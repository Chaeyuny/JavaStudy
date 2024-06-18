package review_ex.pdf2_ref;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        //배열 먼저 3칸 선언 후 productOrders[0] = productOrder1; 과 같이 넣어도 됨

        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);


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
