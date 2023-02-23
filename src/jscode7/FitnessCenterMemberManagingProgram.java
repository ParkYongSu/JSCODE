package jscode7;
import java.util.Scanner;

public class FitnessCenterMemberManagingProgram {
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        MemberRepository memberRepository = new MemberRepository();

        while (true) {
            System.out.println("원하시는 번호를 입력해주세요.");

            System.out.println("1. 회원등록");
            System.out.println("2. 회원조회");
            String serviceNumber = scanner.nextLine();

            if (Integer.parseInt(serviceNumber) == 1) {
                System.out.println("원하시는 번호를 입력해주세요.");

                System.out.println("1. 일반 회원");
                System.out.println("2. VIP 회원");
                String userNumber = scanner.nextLine();

                String email = inputData("이메일을 입력해주세요.");
                String name = inputData("이름을 입력해주세요.");
                String age = inputData("나이를 입력해주세요.");

                Member member;

                if (Integer.parseInt(userNumber) == 1) {
                    member = new Member(email, name, Integer.parseInt(age));
                }
                else {
                    String ptCount = inputData("신청한 PT 횟수를 입력해주세요.");
                    member = new VIPMember(
                        email, name, Integer.parseInt(age), Integer.parseInt(ptCount));
                }

                boolean isContains = memberRepository.checkExistEmail(member.getEmail());

                if (isContains) {
                    System.out.println("이미 등록된 이메일이어서 회원 등록에 실패했습니다.");
                }
                else {
                    System.out.println("회원 등록이 성공적으로 완료되었습니다.");
                    memberRepository.add(member);
                }
            }
            else {
                String targetName = inputData("조회하려는 회원의 이름을 입력해주세요.");
                memberRepository.findUserByName(targetName);
            }
        }
    }

    private String inputData(String inputText) {
        System.out.println(inputText);
        return scanner.nextLine();
    }
}
