package final1;

public class ConstantMain1 {
    //최대 참여자 수 1000명을 넘어가면 대기자로 등록되는 시스템
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 : " + 1000);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수 : " + currentUserCount);

        if(currentUserCount > 1000){
            System.out.println("대기자로 등록합니다.");
        }else{
            System.out.println("게임에 참여합니다.");
        }
    }

    //고정된, 반복 사용하는 값 1000
}
