package access;

public class Speaker {
    //스피커 음량조절 소프트웨어 개발한다고 가정
    // 단, 소리가 100을 넘어가지 않게 한다.
    private int volume;
    /*처음과 다르게 private로 외부 접근 제한
    *  private = 이 '클래스 내부'에서만 호출 가능 */


    //생성자로 초기 음량 설정
    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp(){
        if(volume >= 100){
            System.out.println("음량 증가 불가. 최대음량");
        }else {
            volume += 10;
            System.out.println("음량 10 증가");
        }
    }

    void volumeDown(){
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume(){
        System.out.println("현재 음량 : " + volume);
    }
}
