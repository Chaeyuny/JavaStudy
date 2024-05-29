package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.volumeUp();
        speaker.showVolume();

        //음량 100 넘으면 증가x
        speaker.volumeUp();
        speaker.showVolume();

        //--- 초기 프로그램 여기까지.
        // 다음 개발자가 음량 높이기 시도했다고 가정
        //  : 필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        //speaker.volume = 200; //private 접근 오류 발생
        speaker.showVolume();

        /*필드에 접근 제어자를 걸지 않을 경우 200이 출력되어 버림
         -> 필드에 직접 접근할 수 있으므로
            volumeUp 기능이 소용 없어지는 것

            : '접근 제어자'를 통해 외부 접근 막아주면 된다
               volume 필드를 Speaker 클래스 외부에서는 접근 못하게 막아주면 됨
               --> 200으로 직접 수정 불가
        */
    }
}
