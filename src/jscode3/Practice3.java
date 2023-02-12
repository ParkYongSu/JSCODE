package jscode3;

import java.util.*;

public class Practice3 {
    public void multiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("[구구단] 몇 단을 출력하실건가요?");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                System.out.println("프로그램을 성공적으로 종료했습니다.");
                break;
            }

            try {
                int num = Integer.parseInt(input);
                if (num >= 1 && num <= 9) {
                    for (int i = 1; i <= 9; i++) {
                        System.out.println(num + " * " + i + " = " + num * i);
                    }
                }
                else System.out.println("1단에서 9단까지만 출력이 가능합니다.");
            }
            catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public void arrayPractice() {
        List<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(7);
        array.add(10);
        array.add(9);
        array.add(4);

        array.remove(Integer.valueOf(7));
        System.out.println(array.get(1));

        Collections.sort(array, Collections.reverseOrder());

        for (Integer integer : array) {
            System.out.println(integer);
        }

        System.out.println(array.contains(11));
    }
}
