package class1;

public class ClassStart4 {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();

        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        //student 타입 변수를 2개 보관할 수 있는 사이즈 2 배열 생성 --> null로 초기화됨
        Student[] students = new Student[2];

        //배열에 참조값(student1, student2 --> student 인스턴스의 참조값) 대입
        students[0] = student1;
        students[1] = student2;

        /*주의 -- 자바에서 대입은 항상 변수에 들어있는 값을 복사하는 것
        *         students[0] = x001  --> 참조값 대입됨(인스턴스 자체가 든 것이 아니라 위치를 나타내는 참조값이 들어있음)
        * 즉, 기존에 student1, 2에 들어있는 참조값도 그대로 유지된다*/

        /*배열에 들어있는 객체 사용
          : 배열에 먼저 접근 -> 객체에 접근 */
                                 //배열에 든 참조값을 통해 student 인스턴스에 모두 접근 가능
        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].grade);
    }
}
