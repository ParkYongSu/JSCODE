package jscode4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void rent() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("대여할 책의 번호를 입력하세요.");
            for (int i = 0; i < this.books.size(); i++) {
                this.books.get(i).printInfo(i + 1);
            }

            int number = scanner.nextInt();
            if (number > 0 && number <= this.books.size()) {
                if (this.books.get(number - 1).getEnableRental()) {
                    this.books.get(number - 1).setEnableRental(false);
                    System.out.println("정상적으로 대여가 완료되었습니다.");
                }
                else {
                    System.out.println("대여 중인 책은 대여할 수 없습니다.");
                }
            }
        }
    }
}
