package construct.ex;

public class Book {
    String title; //제목
    String author; //저자
    int page; //페이지 수

    //BookMain 코드 작동하도록 클래스 완성하기

    //기본 생성자
    // : 이미 다른 생성자가 있어서 자동생성되지 않으므로 정의해야 함.
    Book(){
        // 아예 비워두지 말것 (그냥 출력하면 null 나옴)
        this("", "", 0);
    }

    //title과 author만을 매개변수로 받는 생성자
    Book(String title, String author){
        this(title, author, 0); //매개변수 3개 생성자 갖다씀
    }

    //모든 필드를 매개변수로 받는 생성자
    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo(){
        System.out.println("제목 : " + title + " 저자 : " + author + " 페이지 : " + page );
    }


}
