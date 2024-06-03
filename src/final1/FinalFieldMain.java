package final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        //final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);

        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);
        //생성자마다 값 다르게 할당 가능 -> 이후에는 값 변경 불가



        //final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();

        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);
        /*생성자가 여러개이더라도 값 변경 불가
          : 필드 코드에 해당 값이 미리 정해져있기 때문에
            모든 인스턴스가 같은 값 사용 -> 메모리 낭비
            => static 영역(공용) 사용하면 좋음
        */


        //상수 : static final = 값이 바뀌지 않는 공용변수
        // : 상수는 변하지 않고, 항상 일정한 값을 갖는 수를 의미.
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);

        /*static 영역은 단 하나만 존재하는 영역
         :CONST_VALUE 변수는 JVM 상에서 하나만 존재하므로
          중복, 메모리 비효율 문제 모두 해결 가능

          --> 즉, 필드에 final + 필드 초기화 사용하는 경우
              static을 붙여 사용하는 것이 효과적.
        * */
    }


}
