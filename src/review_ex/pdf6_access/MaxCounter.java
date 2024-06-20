package review_ex.pdf6_access;

public class MaxCounter {
    //최대값 지정하고 최대값까지만 값이 증가하는 기능 제공

    private int count = 0; //내부 사용 숫자
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment(){
        if (count >= max){ //증가시킬 수 없을 때의 로직 먼저 기재
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;


 /*       if(count < max){
            count += 1; //this.count
        }else{
            System.out.println("최대값을 초과할 수 없습니다.");
        }
*/
    }

    //main에서 멤버변수 접근하기 위해 사용**
    //private라 직접 MaxCounter.count로 접근 불가하기 떄문
    public int getCount(){
        return count;
    }
}
