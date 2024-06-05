package poly.basic;

public class CastingMain3 {

    public static void main(String[] args) {

        //upcasting vs downcasting
        Child child = new Child();
        Parent parent1 = (Parent) child; //부모는 자식 담기 가능.
        Parent parent2 = child; //업캐스팅은 생략 가능, 권장

        parent1.parentMethod();
        parent2.parentMethod(); //부모 메서드 다 호출가능

        /*업캐스팅은 생략 가능 --> 매우 자주 사용하기 때문
        * 다운캐스팅은 생략 불가능 (직접 명시적으로 캐스팅)
        *  : 잘못하면 심각한 런타임 오류가 발생하기 때문*/

    }
}
