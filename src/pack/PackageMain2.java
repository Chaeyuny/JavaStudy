package pack;
import pack.a.User;

//패키지 안에 객체 여러개인 경우(User2 ~) : import pack.a.*

public class PackageMain2 {
    public static void main(String[] args) {

        //패키지가 다르면 클래스명 중복 가능

        //pack.a.User import
        User userA = new User();

        //pack.b.User는 import 불가
        /* 클래스 이름 중복 시 하나만 import 가능하므로
           자주 사용하는 패키지를 import 하기*/
        pack.b.User userB = new pack.b.User();


        /*패키지 규칙
        * 패키지 이름, 위치는 폴더 위치와 동일(필수)
        * 패키지 이름은 관례적으로 모두 소문자
        * 패키지 이름 앞부분은 일반적으로 회사 도메인을 거꾸로 사용
           : com.company.myapp
           * 외부 라이브러리와의 중복 방지
           * 오픈소스나 라이브러리 만들어서 외부에 제공할 경우 꼭 지키는 것이 좋음

         *패키지와 계층 구조
          : 패키지가 계층 구조를 이루더라도, 모든 패키지는 아무 연관이 없는 서로 다른 패키지이다.
        */

    }
}
