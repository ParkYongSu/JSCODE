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
            
            // 'number > 0 && number <= this.books.size()' 부분의 로직을 다른 개발자가 본다면 무슨 의미인지 단번에 알아차리기가 어렵습니다. 
            // validateInputNumber(int number)와 같은 메서드로 분리하면 훨씬 가독성이 좋아집니다!
            if (number > 0 && number <= this.books.size()) {
                 // 'number - 1'이 어떤 걸 의미하는 지 다른 개발자 입장에서 단번에 알아차리기 어렵습니다. 따라서 int index = number - 1;이라는 변수를 사용함으로써
                  // 조금 더 가독성있게 코드를 작성하실 수도 있습니다!
                if (this.books.get(number - 1).getEnableRental()) {
                   // setEnableRental()라는 메서드명은 비즈니스 로직의 의미를 명확하게 나타내지 못합니다. setEnableRental() 대신에 다른 메서드명을 사용해보세요. 
                  // 참고 : https://blog.naver.com/jktk1/221551306370
                  // 검색 키워드 : 'getter, setter를 사용하지 마라'
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
