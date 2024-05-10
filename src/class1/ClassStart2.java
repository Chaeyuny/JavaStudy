package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        // ClassStart1 문제에 배열 적용

        //코드 변경은 최소화 성공
        // 단, 학생 한명의 정보가 세개의 데이터로 나눠진다는 문제점이 발생 (수정 어려움)
        // 컴퓨터 입장에선 문제가 없지만 사람이 관리하기 어려운 방식
        String[] studentNames = {"학생1", "학생2", "학생3", "학생4"};
        int[] studentAges = {15, 16, 17, 20};
        int[] studentGrades = {90, 80, 70, 60};

        for (int i = 0; i < studentNames.length; i++){
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 성적:" + studentGrades[i]  );
        }


    }
}
