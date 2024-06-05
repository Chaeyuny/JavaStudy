package poly.basic;

public class CastingMain5 {

    //parent 인스턴스 타입 검사 : instanceof
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

        if(parent instanceof Child){ //Child 타입이 맞는지 확인
            System.out.println("Child 인스턴스 맞음");
            ((Child) parent).childMethod(); //확인 후 다운캐스팅
        }
    }
}
