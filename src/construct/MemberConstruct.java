package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    /*생성자
      - 프로그래밍 시 객체를 생성하고 이후 바로 초기값을 할당하는 경우가 많음.
        즉, 앞서 만든 initMember와 같은 메서드를 매번 생성해야 함
      - 대부분의 객체 지향 언어는 이러한 경우를 고려해 객체를 생성하자마자
        즉시 필요한 기능을 좀 더 편리하게 수행할 수 있도록 '생성자'기능 제공(생성 시점에 필요한 기능 수행 가능)
      - 메서드와 비슷하지만 차이가 있음

       : 클래스 이름과 동일해야 하므로 대문자로 시작함
       : 생성자는 반환 타입이 없어서 비워두어야 함 (void도 x)
       : 나머지는 메서드와 동일
     */


    //생성자 오버로딩과 this()
    // - 추가한 부분 : 성적 입력 안한 경우의 생성자 추가(오버로딩)
    MemberConstruct(String name, int age){
//        this.name = name;
//        this.age = age;
//        this.grade = 50;


        /*this() 기능 사용
          : 위와 같이 사용 시 아래 생성자와 로직이 중복됨
            -> this()를 이용하면 생성자 내부에서 자신의 생성자를
            호출할 수 있음

           : 주의) 생성자 코드의 첫줄에만 작성할 수 있다. (ex) 출력문 다음 X
         */
        this(name, age, 50);
     }


    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name = " + name + " age = " + age + " ,rade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
