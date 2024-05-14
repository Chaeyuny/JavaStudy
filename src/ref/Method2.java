package ref;
public class Method2 {
    //class1의 ClassStart3 리팩토링
    public static void main(String[] args) {

        //1. 이름, 나이, 성적을 주고 createStudent 메서드 호출
        Student student1 = createStudent("학생1", 15, 90);
        //createStudent를 통해 반환된 객체 참조값을 student1에 대입
        // -> main 내에서 이 이후로 student1을 통해 실제 객체 사용가능

        Student student2 = createStudent("학생2", 16, 80);

        //student1,2의 참조값을 넘김
        printStudent(student1);
        printStudent(student2);
    }


    //전달한 값으로 객체를 생성해서 참조값을 '반환'하는 메서드
    // (객체 생성 및 초기값 설정 한번에 처리)
    static Student createStudent(String name, int age, int grade){
        //2. student 객체 생성 후 해당 객체의 멤버변수 값을 받아온 매개변수 값으로 셋팅
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

        //3. 만들어진 student 객체의 참조값을 반환 (밖에서 사용할 수 있도록)
        return student;
    }


    //전달한 학생 객체의 필드(멤버변수) 값을 읽어서 출력하는 메서드
    static void printStudent(Student student){
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }
}
