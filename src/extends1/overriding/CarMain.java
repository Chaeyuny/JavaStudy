package extends1.overriding;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); //부모 기능 재정의

        /*electricCar.move(); 호출 시 Car의 move가 아닌
         electricCar에서 재정의한 move가 호출됨 */

        GasCar gasCar = new GasCar();
        gasCar.move(); //Car의 move 호출



    }
}
