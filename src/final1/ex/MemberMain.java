package final1.ex;

public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();

        //id 바뀌면 안됨
        // - changeData 메서드도 매개변수 name만 받도록 수정해야 함
        member.changeData("myId2", "seo");
        member.print();
    }
}
