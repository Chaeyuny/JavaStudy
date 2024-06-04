package extends1.super2;

public class ClassC extends ClassB{

    public ClassC(){

        //부모인 ClassB에 기본생성자 없으므로 super를 직접 정의
        // 단, 생성자는 하나만 호출 가능 -> ClassB 생성자 중 하나를 선택하면 됨
        super(10, 20);
        System.out.println("ClassB 생성자");
    }

}
