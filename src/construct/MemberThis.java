package construct;

public class MemberThis {
    //this 생략
    String nameField;

    void initMember(String nameParameter){
        /*필드명과 파라미터명이 다르면 구분되기 때문에 this 생략가능
          : 우선순위 높은 코드블럭 내 매개변수 확인 -> 없으면 필드 확인하기 때문

          : 생략 가능해도 this를 사용하자는 개발규칙 사용하기도 함
             하지만 요새는 IDE가 발전해서 색으로 구분이 충분히 가능하므로 권장x
         */
        nameField = nameParameter;
    }
}
