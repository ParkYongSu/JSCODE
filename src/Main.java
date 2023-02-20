import java.util.Scanner;
import jscode6.Money;
import jscode6.PhoneNumber;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("휴대폰 번호를 입력해주세요. ");
            String input = scanner.nextLine();
            try {
                PhoneNumber phoneNumber = new PhoneNumber(input);
                System.out.println("휴대폰 번호를 정상적으로 입력하셨습니다. 입력하신 휴대폰 번호는 " + phoneNumber.getPhoneNumberFormally() + "입니다.");
                break;
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
