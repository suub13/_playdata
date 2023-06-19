package org.example.Dto;


// Dto - Data Transfer Object
// VO 나 Dto -> 한사람분의 변수나 테이블로 따지면 하나의 테이블
// DB 테이블을 자바로 불러올 때, 사용하는 클래스 - 데이터를 담는다.
// insert, update, delete 쿼리는 테이블 단위로 구성. 테이블 필드와 일치.
// select의 경우 join이 있어서 join 컬럼에 맞춰서 만든다.
// 2개 이상의 테이블, 엄격하게 개발하는 팀에서는 데이터를 읽어오는 경우에 Vo라는 접미어를 붙인다.
// 대부분 프로젝트 할 떄, Vo Dto 사용을 결정한다.

public class BookDto {
    private String title="";
    private String author="";
    private int count = 0;
    private int price =0;

    public BookDto(String title, String author, int count, int price) {
        this.title = title;
        this.author = author;
        this.count = count;
        this.price = price;
    }

    public BookDto(){  }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getCount() {
        return count;
    }

    public int getPrice() {
        return price;
    }
}
