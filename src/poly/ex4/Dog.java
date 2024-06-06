package poly.ex4;

public class Dog extends AbstractAnimal {

    //추상 메서드 자식이 오버라이딩
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
