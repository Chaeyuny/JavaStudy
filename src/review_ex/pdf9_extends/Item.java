package review_ex.pdf9_extends;

public class Item {
    private String name;
    private int price;

    //공통되는 객체
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //공통되는 부분까지 작성
    public void print(){
        System.out.println("이름 : " + name +", 가격:" + price);
    }

    public int getPrice() {
        return price;
    }
}
