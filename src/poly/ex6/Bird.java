package poly.ex6;

//클래스 상속, 인터페이스 구현 같이 가능
// : 클래스 상속은 하나만 가능하지만, 인터페이스는 여러 개 구현 가능
// : 클래스(extends)가 앞에 와야 함

public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
