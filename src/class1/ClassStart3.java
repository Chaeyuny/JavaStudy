package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        /*int, String처럼 Student라는 사용자 정의 타입을 생성하는 것.
         사용자가 정의하는 타입을 만들기 위해 설계도 필요
         설계도가 클래스
        */

        Student student1;         //변수 선언
        student1 = new Student(); // 실제 메모리에 생성(객체 생성)

        /* 메모리에 student 객체 생성 시
          해당 클래스가 가진 멤버변수(name, age, grade) 를 사용하는데 필요한
          메모리 공간도 함께 확보된다 */

        student1.name = "학생1";  // . 기호로 클래스에 접근
        student1.age = 15;
        student1.grade = 90;

                            //객체 생성
        Student student2 = new Student();
        //객체(인스턴스) : 설계도(클래스)를 가지고 실제 메모리에 만들어진 실체
        // 클래스는 붕어빵 틀, 객체는 붕어빵

        /* 객체가 생성되고 나면 참조값이 반환되고, student2와 같은 변수에 생성된 객체 참조값이 대입된다.
           그래서 student2로 . 기호를 활용해 메모리에 있는 실제 객체에 접근할 수 있다.
            --> 변수에 참조값을 보관하지 않으면 접근할 수 없기 때문
            변수마다 참조값은 다르다 (객체 생성 시 메모리 할당 주소가 다르므로)
         */

        //참조값 확인
        System.out.println(student1);
        System.out.println(student2);

        student2.name = "학생2"; // 참조값을 통해 객체 접근 -> name 멤버 변수에 "학생2" 데이터 저장됨
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }
}
