package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //MethodinitMain3 할 때 기능 부분 추가
    void initMember(String name, int age, int grade){
        /* 앞선 예제들처럼 받아오는 매개변수 값이 없을 때에는 name 자체로 기능을 정의해 사용하면 되지만,
        해당 코드와 같이 필드에 외부(Main)로부터 받아온 매개변수 명이 필드명과 동일한 경우 this 키워드를 사용해서 구분한다. (이름이 같기 때문)
        this : 인스턴스 자신의 '참조값'을 의미. 즉 인스턴스의 멤버변수에 접근하게 됨
        */
        this.name = name; //멤버변수보다 매개변수가 코드블럭의 더 안쪽에 존재하므로 그냥 name이라고 쓰면 매개변수가 우선순위를 가짐
        this.age = age;
        this.grade = grade;
    }
}
