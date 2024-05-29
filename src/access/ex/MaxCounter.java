package access.ex;

public class MaxCounter {
    //문제 : 최대 카운터와 캡슐화

    //MaxCounter 클래스 생성
    // : 최대값을 지정하고 최대값까지만 값이 증가하는 기능 제공
    // : 접근제어자 활용해서 데이터를 캡슐화할 것

    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment(){
//        if(count<max){
//            count++;
//        }else{
//            System.out.println("최대값을 초과할 수 없습니다.");
//        }


        //검증에서 통과 못하면 실행으로 안넘어가는 방식으로 짜는 게 좋다.
        //검증 로직
        if(count >= max){
            System.out.println("최대값을 초과할 수 없습니다.");
            return; //빠져나감
        }

        //실행로직
        count++;
    }

    public int getCount(){
        return count;
    }
}
