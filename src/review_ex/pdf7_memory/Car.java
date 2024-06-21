package review_ex.pdf7_memory;

public class Car {
    private static int count; //메서드 영역에 생성되는 클래스변수
    private String carName; //힙 영역에 생성되는 멤버변수

    //생성자
    public Car(String carName) {
        System.out.println("차량 구입, 이름:" + carName);
        this.carName = carName;
        count++; //차량 구매 시 1 증가
    }

    public static void showTotalCars(){
        //static은 static 변수만 가져다 쓸 수 있음
        System.out.println("구매한 차량 수 : "+ count);
    }
}
