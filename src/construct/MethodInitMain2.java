package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        //생성자 알아보기2 - 메서드를 통해 반복 제거
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 15, 90);

        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적:" + s.grade);
        }
    }

    /*해당 메서드는 대부분 MemberInit 객체의 멤버변수를 사용함
     --> 이런 경우 속성과 기능을 한 곳에 두는 게 나음
     즉, MemberInit이 자기 자신의 데이터를 변경하는 기능을 제공하는 것이 좋다*/
    static void initMember(MemberInit member1, String name, int age, int grade){
        member1.name = name;
        member1.age = age;
        member1.grade = grade;
    }
}
