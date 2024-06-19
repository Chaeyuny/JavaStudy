package review_ex.pdf4_constructor;

public class Book {
    String title; //제목
    String author; //저자
    int page; //페이지 수

    Book(){ //매개변수 없는 기본 생성자
        this("", "", 0);
    }

    //생성자 오버라이딩 - title, author만 받는 생성자
    public Book(String title, String author) {
        this(title, author, 0);
    }

    //모든 필드를 매개변수로 받는 생성자
    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    //main 작동하도록 코드 완성하기
    void displayInfo(){
        System.out.println("제목: " + title + ",저자: " + author
        + ",페이지: " + page);
    }

}
