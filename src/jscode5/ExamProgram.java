package jscode5;

import java.util.Scanner;

public class ExamProgram {
    private final Scanner scanner = new Scanner(System.in);
    private int groupNum, htmlScore, cssScore, javascriptScore;
    public void execute() {
        input();
        int min = findMin();
        int max = findMax();
        double avg = calculateAvg();
        boolean isPass = checkPass(avg);
        printResult(isPass, max, min, avg);
    }

    private void input() {
        groupNum = inputData("몇 기인지 입력해주세요.");
        htmlScore = inputData("HTML 과목 점수를 입력해주세요.");
        cssScore = inputData("CSS 과목 점수를 입력해주세요.");
        javascriptScore = inputData("Javascript 과목 점수를 입력해주세요.");
    }
    private int inputData(String inputText) {
        System.out.println(inputText);
        return scanner.nextInt();
    }

    private int findMin() {
        int min = Math.min(htmlScore, cssScore);
        return Math.min(min, javascriptScore);
    }

    private int findMax() {
        int max = Math.max(htmlScore, cssScore);
        return Math.max(max, javascriptScore);
    }

    private double calculateAvg() {
        return (double) (htmlScore + cssScore + javascriptScore) / 3;
    }

    private boolean checkPass(double avg) {
        if (checkTwoMorePerfect(htmlScore, cssScore, javascriptScore)) {
            return true;
        }
        else {
            if (groupNum == 3) return avg >= 70;
            else return avg >= 60;
        }
    }

    private boolean checkTwoMorePerfect(int htmlScore, int cssScore, int javaScriptScore) {
        int count = 0;
        if (htmlScore == 100) count++;
        if (cssScore == 100) count++;
        if (javaScriptScore == 100) count++;
        return count >= 2;
    }

    private void printResult(boolean isPass, int max, int min, double avg) {
        if (isPass) System.out.println("합격입니다.");
        else System.out.println("불합격입니다.");
        System.out.println("전체 과목 중 최고점은 " + max + "점입니다.");
        System.out.println("전체 과목 중 최저점은 " + min + "점입니다.");
        System.out.println("전체 과목의 평균은 " + avg + "점입니다.");
    }
}
