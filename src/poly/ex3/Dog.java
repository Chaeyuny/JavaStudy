package poly.ex3;

public class Dog extends  AbstractAnimal{

    //추상 메서드 자식이 오버라이딩
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
