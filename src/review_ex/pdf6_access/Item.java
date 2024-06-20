package review_ex.pdf6_access;

public class Item {
    private String productName;
    private int price;
    private int quantity;

    //코드 작성

    public Item(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    //멤버변수들을 사용한 계산이므로 Item에서 get메서드로 처리
    // get메서드를 통해 -> ShoppingCart 클래스에서 값 사용
    public int getTotalPrice() {
        return price*quantity;
    }

}
