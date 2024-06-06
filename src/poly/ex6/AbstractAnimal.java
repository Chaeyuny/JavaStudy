package poly.ex6;

//클래스와 인터페이스 활용
// 클래스 상속 & 인터페이스 구현 함께 사용하는 예제

public abstract class AbstractAnimal { //추상 클래스(일반 메서드 포함가능)
    public abstract void sound();  //추상 메서드
    public void move(){            //일반 메서드
        System.out.println("동물 이동");
    }
}
