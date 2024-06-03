package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); //참조형 변수에 final

        //data = new Data();
        // 변수 선언 시점에 참조값 할당했으므로 참조값 변경불가

        //참조 대상의 객체 값은 변경 가능 --value는 final아님
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);

        /*참조형 변수 (data)에 fianl이 붙으면 안에 든 참조값을 다른 값으로 변경 불가
          즉, 다른 객체를 참조하게 바꿀 수 없음
        *  : 참조값만 변경하지 못한다는 것이고, 참조하는 대상의 객체 값은
             변경할 수 있음 (위의 경우 value가 final이 아님)
        */
    }
}
