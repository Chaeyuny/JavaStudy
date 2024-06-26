package class1;

public class ClassStart5 {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();

        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;


        //ClassStart4 리팩토링
        Student[] students = {student1, student2}; //Student[] students = new Student[] {student1, student2};

//        for (int i=1; i <students.length; i++){
//            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
//        }

        for (int i=0; i <students.length; i++){
            //변수명 줄여서 출력
            // 루프 돌때마다 배열값 s에 대입
            Student s = students[i];
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }

        //for-each문으로 변경 : 단축키 iter 하면 구조 생성됨
        for (Student s : students){
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }


    }
}
