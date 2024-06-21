package review_ex.pdf7_memory;

public class MathArrayUtils {

    //인스턴스 생성 막기
    private MathArrayUtils(){}

    public static int sum(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int min = values[0];
        for (int value : values) {
            if(min>value){
                min = value;
            }
        }
        return min;

    }

    public static int max(int[] values) {
        int max = values[0];
        for (int value : values) {
            if(max<value){
                max = value;
            }

        }
        return max;
    }
}
