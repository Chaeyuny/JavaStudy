package review_ex.pdf6_access;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount; //0으로 초기화됨

    //코드 작성

    public void addItem(Item item){
        if(itemCount >= items.length){ //10개 넘으면 추가x
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        //배열에 아이템 추가
        // iter이나 for문 x
        // 하나 추가될 때 count만 늘리면 다음 배열에 대입 가능
        items[itemCount] = item;
        itemCount++;

    }

    public void displayItems(){

        System.out.println("장바구니 상품 출력");

        //배열 길이만큼 돌면 null 생기므로 itemCount만큼 돌아야 함
        for (int i=0; i<itemCount; i++) {
            Item item = items[i]; //객체 하나의 참조값 item에 담기
            //해당 객체 멤버변수 가져다 쓸 수 있게 됨
            System.out.println("상품명:" + item.getProductName() + ", 합계 : " + item.getTotalPrice());
        }

        int totalPrice = totalPrice();
        System.out.println("전체 가격 합 : " + totalPrice);

    }


    //전체 가격을 구하는 로직은 메서드로 정의해서 사용
    //이 메서드 내에서만 사용되므로 private 사용
    private int totalPrice(){
        int totalPrice = 0;

        for (int i=0; i<itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }

        return totalPrice;
    }


}
