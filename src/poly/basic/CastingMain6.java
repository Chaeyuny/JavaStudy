package poly.basic;

public class CastingMain6 {

    //Java 16 ~ : instanceof를 사용하면서 동시에 변수 선언 가능
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);

    }

    private static void call(Parent parent){
        parent.parentMethod();

        //Child 인스턴스인 경우 childMethod() 실행
        if(parent instanceof Child child){ //instanceof로 Child인거 확인되면 바로 변수 선언 가능
            System.out.println("Child 인스턴스 맞음");
            child.childMethod(); //인스턴스 맞으면 다운캐스팅 코드 생략가능
        }
    }
}
