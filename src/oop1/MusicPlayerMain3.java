package oop1;

public class MusicPlayerMain3 {

    public static void main(String[] args) {

        /*절차지향 프로그래밍 3
          : 메서드 추출
            장점
            - 로직 중복 제거 : 같은 로직 필요 시 메서드 여러번 호출하면 됨(모듈화한 것)
            - 변경 영향 범위 : 기능 수정 시 해당 메서드 내부만 수정하면 됨
            - 메서드 이름 추가 : 메서드 이름을 통해 원활히 코드 이해 가능
        */


        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
        on(data);

        //볼륨 증가
        volumeUp(data);
        //볼륨 증가
        volumeUp(data);
        //볼륨 감소
        volumeDown(data);


        //음악 플레이어 상태 확인
        showStatus(data);

        //음악 플레이어 끄기
        off(data);

    }

    //음악 플레이 시작 메서드
    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이를 시작합니다.");
    }

    //음악 플레이 종료 메서드
    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    //음악 볼륨 증가 메서드
    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : "+data.volume);
    }

    //음악 볼륨 감소 메서드
    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : "+data.volume);
    }

    //음악 플레이어 상태 확인 메서드
    static void showStatus(MusicPlayerData data){
        System.out.println("음악 플레이어 상태 확인");

        if (data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨 : "+ data.volume);
        } else{
            System.out.println("음악 플레이어 OFF");
        }
    }
}
