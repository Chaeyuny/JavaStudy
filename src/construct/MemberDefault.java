package construct;

public class MemberDefault {
    //기본생성자 알기
    String name;

    /* 클래스에 생성자가 하나도 없으면 자바 컴파일러는
    매개변수 없고, 작동 코드가 없는 기본 생성자를 자동으로 만든다.
      : 사용자에게 보이지는 않음, 생성자 기능이 필요없는 경우도 있으므로 기본 생성자를 자동생성함.
    ****단, 생성자가 하나라도 있으면 자바는 기본 생성자를 만들지 않는다.

    MemberDefault의 기본 생성자(자동생성, 클래스와 같은 접근제어자 가짐)
    public MemberDefault(){

    }
    * */

    //기본생성자를 직접 정의 할 수도 있음
    public MemberDefault(){
        System.out.println("생성자 호출");
    }
}
