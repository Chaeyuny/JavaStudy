package ref;
public class Method1 {
    //class1의 ClassStart3 리팩토링
    public static void main(String[] args) {

        //1. student1의 참조값, name, age, grade 값 넘김
        Student student1 = new Student();
        initStudent(student1,"학생1", 15, 90);

        Student student2 = new Student();
        initStudent(student2,"학생2", 16, 80);

        //student1,2의 참조값을 넘김
        printStudent(student1);
        printStudent(student2);
    }

    //전달한 학생 객체의 필드(멤버변수)에 값을 설정하는 메서드
    static void initStudent(Student student, String name, int age, int grade){
        /*2. 받아온 참조값 student를 통해 실제 객체의 멤버변수에 접근해서,
             매개변수로 받아온 값(name, age, grade)을 대입
        */
        student.name = name; //대입연산자 오른쪽 값이 매개변수로 받아온 값
        student.age = age;
        student.grade = grade;

        /* 참조형은 메서드 호출 시 참조값을 전달하므로, 메서드 내부에서 전달한 참조값을 통해
           객체의 값을 변경하거나 값을 읽어서 사용할 수 있다
        */
    }

    //전달한 학생 객체의 필드(멤버변수) 값을 읽어서 출력하는 메서드
    static void printStudent(Student student){
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }
}
