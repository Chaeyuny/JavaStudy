package access.ex;

public class Item {
    //클래스는 다른 패키지에서도 사용 가능,
    // 장바구니에는 상품을 최대 10개만 담을 수 있음
    //  --> 초과 시 장바구니가 가득 찼습니다 출력


    private String name;
    private int price;
    private int quantity;


    //나머지 코드 완성


    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //여기부터 x ----

    //매개변수로 받아와서 대입한 값을 반환?
    public String getName(){
        return name;
    }

    //합계 계산 메서드
    // 합계 계산할 때 필요한 필드가 Item 클래스에 있으므로 여기서 하는 게 좋음
    public int getTotalPrice() {
        return price * quantity;
    }

}
