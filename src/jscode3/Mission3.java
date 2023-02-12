package jscode3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Mission3 {
    public void sortStudents() {
        System.out.println("학생의 이름을 입력하고 엔터를 누르세요. (한글로만 입력해야 합니다.)\n학생들을 다 입력했다면, print라고 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        List<String> studentsList = new ArrayList<>();
        while (true) {
            String name = scanner.nextLine();

            if (mustFinish(name)) break;

            if (Pattern.matches("^[ㄱ-ㅎ가-힣]*$", name)) {
                studentsList.add(name);
            }
            else {
                System.out.println("학생의 이름은 한글로만 입력해야 합니다.");
            }
        }

        System.out.println("[학생 명단(가나다순)]");
        Collections.sort(studentsList);
        for (String name : studentsList) {
            System.out.println(name);
        }
    }

    public void findWinner() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        List<Double> records = new ArrayList<>();

        while (true) {
            try {
                System.out.println("선수의 번호를 입력하세요.");
                String numberInput = scanner.nextLine();
                if (mustFinish(numberInput)) break;

                System.out.println("이 선수의 100m 달리기 기록이 몇 초인지 입력하세요.");
                String recordInput = scanner.nextLine();
                if (mustFinish(recordInput)) break;

                int number = Integer.parseInt(numberInput);
                double record = Double.parseDouble(recordInput);
                if (numbers.contains(number)) {
                    int index = numbers.indexOf(number);
                    numbers.remove(index);
                    records.remove(index);
                }
                numbers.add(number);
                records.add(record);
            }
            catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        if (!records.isEmpty()) {
            double winnerRecord = records.get(0);

            for (double target : records) {
                if (target < winnerRecord) winnerRecord = target;
            }

            int winnerIndex = records.indexOf(winnerRecord);

            System.out.println("1등 : " + numbers.get(winnerIndex) +"번 선수" + "/ "
                    + String.format("%.2f", records.get(winnerIndex))
                    +"초 (참가인원 : " + numbers.size() +"명)");
        }
    }

    private boolean mustFinish(String value) {
        return value.equals("print");
    }
}
