package static2.ex;

//Car 클래스를 작성하자
public class Car {
    private String carName;
    private static int carCount;

    //생성자
    public Car(String carName) {
        //맞았지만 헷갈린 부분 - 객체 생성될 때 출력
        System.out.println("차량 구입, 이름 : " + carName);
        this.carName = carName;
        carCount++;
    }

    //정적메서드
    public static void showTotalCars(){
        System.out.println("구매한 차량 수 : " + carCount);
    }


}
