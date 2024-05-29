package access.a;


/*클래스 레벨의 접근 제어자는 public, default만 가능
  - public 클래스는 반드시 파일명과 이름 일치해야 함
  - 하나의 자바 파일에 public 클래스는 하나만 등장
  - 하나의 자바 파일에 default 접근 제어자 클래스는 무한정 생성 가능
*/
public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        //default 접근제어자 가진 클래스
        // : 같은 패키지 내에서만 접근 가능
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();

    }
}

class DefaultClass1{

}

class DefaultClass2{

}
