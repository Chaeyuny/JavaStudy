package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    //나머지 코드 완성

    //장바구니에 담기
    public void addItem(Item item){
        //상품 최대개수 넘었는지 체크 (검증 로직)
        if(itemCount >= items.length){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        //정상 로직
            items[itemCount] = item;
            itemCount++; //addItem을 쓸 때마다 배열 다음칸에 저장되도록

    }


    //상품명 출력부터 x---
    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for (int i=0; i < itemCount; i++) { //배열 크기만큼이 아니라 담긴만큼 돌아야 하므로 itemCount 이용
            Item item = items[i]; //items에서 참조값 하나 꺼내서 변수 item에 담음

            //item 객체에서 이름을 가져오는 getName 기능, 합계 기능 필요
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());

        }
        System.out.println("전체 가격 합: "+ calculateTotalPrice());

    }

    //전체 가격 계산 메서드 별도 구현
    // : 메서드 내부에서만 호출하므로 private
    private int calculateTotalPrice(){
        int totalPrice = 0;
        for (int i=0; i<itemCount; i++){
            Item item = items[i];
            totalPrice += item.getTotalPrice();

        }
        return totalPrice;
    }


}
