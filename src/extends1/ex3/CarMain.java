package extends1.ex3;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor(); //문열기 기능 추가됨

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        //새로 생성한 수소차
        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();

        /*기능 추가 + 클래스 확장
        * 상속 관계 덕분에 중복 줄어들고 새로운 수소차도 편리하게 확장함*/

    }
}
