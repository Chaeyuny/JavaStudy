package poly.car0;

public class Model3Car {
    //다형성 없는 코드 - 새 차 추가
    public void startEngine(){
        System.out.println("Model3Car.startEngine");
    }

    public void offEngine(){
        System.out.println("Model3Car.offEngine");
    }

    public void pressAccelerator(){
        System.out.println("Model3Car.pressAccelerator");
    }
}
