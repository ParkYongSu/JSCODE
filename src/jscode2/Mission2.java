package jscode2;

import java.util.Scanner;

public class Mission2 {
    public void printTestResult() {
        int max;
        int min;
        Scanner scanner = new Scanner(System.in);

        System.out.println("몇 기인지 입력해주세요.");
        int groupNum = scanner.nextInt();

        System.out.println("HTML 과목 점수를 입력해주세요.");
        int htmlScore = scanner.nextInt();

        System.out.println("CSS 과목 점수를 입력해주세요.");
        int cssScore = scanner.nextInt();

        if (htmlScore > cssScore) {
            max = htmlScore;
            min = cssScore;
        }
        else {
            max = cssScore;
            min = htmlScore;
        }

        System.out.println("Javascript 과목 점수를 입력해주세요.");
        int javaScriptScore = scanner.nextInt();

        if (javaScriptScore > max) max = javaScriptScore;
        else if (javaScriptScore < min) min = javaScriptScore;

        double avg = (double) (htmlScore + cssScore + javaScriptScore) / 3;
        boolean isPass;

        if ((htmlScore == 100 && cssScore == 100)
                || (htmlScore == 100 && javaScriptScore == 100)
                || (cssScore == 100 && javaScriptScore == 100)) {
            isPass = true;
        }
        else {
            if (groupNum == 3) {
                isPass = avg >= 70;
            }
            else {
                isPass = avg >= 60;
            }
        }

        if (isPass) System.out.println("합격입니다.");
        else System.out.println("불합격입니다.");
        System.out.println("전체 과목 중 최고점은 " + max + "점입니다.");
        System.out.println("전체 과목 중 최저점은 " + min + "점입니다.");
        System.out.println("전체 과목의 평균은 " + avg + "점입니다.");
    }
}
