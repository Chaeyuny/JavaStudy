package poly.car1;

public class NewCar implements Car{
    /*역할과 구현 분리 적용 - OCP 원칙
      : 좋은 객체 지향 설계 원칙 중 하나

      1)Open for extension : 새로운 기능 추가, 변경사항이 생기면 기존 코드는 확장할 수 있어야 한다
      2)Closed for modification : 기존의 코드는 수정되지 않아야 한다.
      --> 확장에는 열려있고, 변경에는 닫혀있다
          즉, 기존 코드 수정 없이 새로운 기능을 추가할 수 있다는 의미
    */

    @Override
    public void startEngine() {
        System.out.println("NewCar.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("NewCar.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("NewCar.pressAccelerator");
    }

}
