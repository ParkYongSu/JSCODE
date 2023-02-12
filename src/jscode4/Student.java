package jscode4;

public class Student {
    private final String name;
    private final int koreanScore, englishScore;

    public Student(String name, int koreanScore, int englishScore) {
        this.name = name;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
    }

    public void printInfo() {
        System.out.println("이름 : " + this.name);
        System.out.println("국어 : " + this.koreanScore);
        System.out.println("영어 : " + this.englishScore);
        System.out.println();
    }
}
