package oop1;

public class MusicPlayer {
    //객체 지향 프로그래밍 - 음악 플레이어 객체 정의 (속성, 기능)

    int volume;
    boolean isOn;

    void on(){
        //자기 자신의 데이터를 사용하므로 매개변수 받을 필요 없음
        isOn = true;
        System.out.println("음악 플레이를 시작합니다.");
    }

    //음악 플레이 종료 메서드
    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    //음악 볼륨 증가 메서드
    void volumeUp(){
        volume++;
        System.out.println("음악 플레이어 볼륨 : "+volume);
    }

    //음악 볼륨 감소 메서드
    void volumeDown(){
        volume--;
        System.out.println("음악 플레이어 볼륨 : "+volume);
    }

    //음악 플레이어 상태 확인 메서드
    void showStatus(){
        System.out.println("음악 플레이어 상태 확인");

        if (isOn){
            System.out.println("음악 플레이어 ON, 볼륨 : "+ volume);
        } else{
            System.out.println("음악 플레이어 OFF");
        }
    }


    /*해당 클래스에 음악 플레이어에 필요한 속성과 기능을 모두 정의함.
    * 음악 플레이어가 필요한 곳에서 이 클래스만 있으면 온전한 음악 플레이어를 생성해서 사용 가능.
    * 음악 플레이어를 사용하는 데 필요한 모든 속성과 기능이 하나의 클래스에 포함되어 있음*/
}
