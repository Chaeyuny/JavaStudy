package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        //객체 생성 시 바로 생성자 호출하여 기능 이용 -> 객체 생성과 동시에 초기값 설정 가능
        //  -- 괄호 안채울 경우 ctrl+p로 필요한 정보 확인 가능

        //생성자 호출 : new 생성자이름(생성자에 맞는 인수 목록)  ---> 생성자이름=클래스이름
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        /*new 키워드 사용해서 객체 생성 시 마지막 괄호()는
        객체를 생성하면서 동시에 생성자를 호출한다는 의미를 포함하고 있으므로 같이 써야함*/


        /*생성자의 최대 장점 ** 제약이 생긴다
        * 메서드로 초깃값 설정 시 해당 메서드를 호출하지 않아도 프로그램은 작동함.
        * 즉, 꼭 필요한 값들 없이 수행하게 됨.
        * 생성자는 객체를 생성할 때 직접 정의한 생성자가 있을 경우 이를 반드시 호출해야 한다
        * --> 생성자 사용은 필수값 입력을 보장한다 */

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적:" + s.grade);
        }
    }
}
