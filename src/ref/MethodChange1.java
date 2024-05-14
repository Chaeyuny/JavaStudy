package ref;

public class MethodChange1 {

    public static void main(String[] args) {
        //기본형과 메서드 호출

        int a = 10;
        System.out.println("메서드 호출 전 :  " + a);

       //1. 메서드 호출 시 매개변수 x에 a의 값을 전달한다
        changePrimitive(a);
        System.out.println("메서드 호출 후 :  " + a);
        //3. x의 값만 변하는 것이므로 메서드 호출 후에도 a값은 10. 변하지 않는다
    }

    /*2. 즉, int x = a;
      -> 자바에서 변수에 값을 대입하는 것은
         항상 값을 복사해서 대입하는 것이므로 변수 a,x 각각 숫자 10을 가진다*/
    static void changePrimitive(int x) {
        x = 20;
    }// 메서드 종료. 메서드 종료 시 x값은 제거됨
}
