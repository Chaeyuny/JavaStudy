package poly.ex5;

//인터페이스 상속 키워드 : implements(구현)
public class Dog implements InterfaceAnimal{

    //상속과 속성은 동일. 추상메서드 전부 오버라이딩(구현) 해야함
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
