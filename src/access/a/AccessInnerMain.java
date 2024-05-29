package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지 default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        //**private 호출 불가
//        data.privateField = 3;
//        data.privateMethod();

        /*innerAccesss는 public Method이므로 외부호출 가능
         :메서드는 외부에서 호출되었지만, 메서드 자체가 AccessData에 포함되어 있으므로
         자신의 private 필드와 메서드에 모두 접근 가능(내부 접근이므로)
        */
        data.innerAccess();


    }
}
