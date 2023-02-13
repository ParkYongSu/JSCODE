import jscode4.*;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("클린코드(Clean Code)", true);
        Book book2 = new Book("객체지향의 사실과 오해", true);
        Book book3 = new Book("테스트 주도 개발(TDD)", true);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.rent();
    }
}