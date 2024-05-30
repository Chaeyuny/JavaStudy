package static2.ex;

public class MathArrayUtils {
    //배열 합, 평균, 최대, 최소값 찾는 기능을 가진 MathArrayUtils 클래스 만들기
    // MathArrayUtils은 객체를 생성하지 않고 사용해야 함


    //틀린 부분 : 인스턴스 생성 방지
    private MathArrayUtils(){
        //기본 생성자를 private = 메인에서의 인스턴스 생성을 막는다.
    }

    public static int sum(int[] values){
        int sum=0;

        for (int value : values) {
            sum += value;
        }
//        for(int i=0; i<values.length; i++){
//            sum += values[i];
//        }
        return sum;
    }

    public static double average(int[] values){
        //계산식은 바로 리턴하는 게 좋음
        return (double) sum(values)/values.length;
    }

    public static int min(int[] values){
        int min = values[0];

        for(int value : values){
            if(min > value){
               min = value;
            }
        }
        return min;
    }

    public static int max(int[] values){
        int max = 0;
        max = values[0];
        for(int value : values){
            if(max < value){
                max = value;
            }
        }
        return max;
    }

}
