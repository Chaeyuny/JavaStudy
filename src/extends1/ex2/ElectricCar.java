package extends1.ex2;

public class ElectricCar extends Car {

    //Car의 기능 move()를 물려받으므로, 충전 기능만 정의하면 됨
    public void charge(){
        System.out.println("충전합니다.");
    }
}
