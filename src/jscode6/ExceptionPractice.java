package jscode6;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class ExceptionPractice {
    public void catchNumberFormatException() {
        Scanner scanner = new Scanner(System.in);

        boolean isContinued = true;
        while (isContinued) {
            System.out.println("숫자를 입력해주세요.");
            String input = scanner.nextLine();
            try {
                int number = parseInt(input);
                System.out.println("입력하신 숫자는 " + number + "입니다.");
            }
            catch (NumberFormatException e) {
                System.out.println("잘못된 값을 입력하셨습니다.");
            }
        }
    }
}
