package jscode2;

import java.util.Scanner;

public class Practice2 {
    public void inputName() {
        System.out.println("이름을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("입력하신 이름은 " + name + "입니다.");
    }

    public void printIUProfile() {
        String name = "아이유";
        int age = 30;
        boolean isCollegeStudent = true;
        double weight = 40.5;
        long property = 10000000000l;
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("대학생인가요? : " + isCollegeStudent);
        System.out.println("몸무게 : " + weight);
        System.out.println("재산 : " + property);
    }

    public void math1() {
        System.out.println((((10 + 5) * 3) / 5) % 7);
    }

    public void math2() {
        int a = 7;
        int b = 5;
        int c = 3;
        int d = 6;
        System.out.println(++a);
        System.out.println(b++);
        System.out.println(c--);
        System.out.println(--d);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public void divideThreeEqualParts() {
        System.out.println("보너스 금액을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int bonus = scanner.nextInt();
        double part = (double) bonus / 3;
        System.out.println("3등분된 보너스 금액은 " + part + "원 입니다.");
    }

    public void checkMultipleOfThree() {
        System.out.println("3의 배수인지 판단하고 싶은 숫자를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input % 3 == 0) {
            System.out.println("3의 배수입니다.");
        }
        else {
            System.out.println("3의 배수가 아닙니다.");
        }
    }
}
