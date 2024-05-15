package oop1;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        //객체지향 프로그래밍
        // - 음악 플레이어 속성과 기능이 모두 정의된 클래스 활용

        MusicPlayer player = new MusicPlayer();

        //음악 플레이어 켜기
        player.on();

        //볼륨 증가
        player.volumeUp();

        //볼륨 증가
        player.volumeUp();

        //볼륨 감소
        player.volumeDown();

        //음악 플레이어 상태
        player.showStatus();

        //음악 플레이어 끄기
        player.off();

        /*실제 음악 플레이어처럼 동작
        *음악 플레이어 사용자 입장에서는 내부에 어떤 데이터(isOn, volume)가 있는지 전혀 몰라도 됨.
        * 단순히 MusicPlayer가 제공하는 기능 중 필요한 것만을 호출하여 사용하면 됨
        */

        /* 캡슐화
           : 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해
             외부에 제공하는 것
         */
    }


}
