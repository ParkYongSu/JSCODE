package jscode4;

public class Person {
    private final String name;
    private final int age;
    private final boolean isCollegeStudent;
    private final double weight;

    public Person(String name, int age, boolean isCollegeStudent, double weight) {
        this.name = name;
        this.age = age;
        this.isCollegeStudent = isCollegeStudent;
        this.weight = weight;
    }

    public Person(String name, String age, boolean isCollegeStudent, String weight) {
        this.name = name;
        this.age = Integer.parseInt(age);
        this.isCollegeStudent = isCollegeStudent;
        this.weight = Double.parseDouble(weight);
    }

    public Person(String name, String age, boolean isCollegeStudent, double weight) {
        this.name = name;
        this.age = Integer.parseInt(age);
        this.isCollegeStudent = isCollegeStudent;
        this.weight = weight;
    }

    public Person(String name, int age, boolean isCollegeStudent, String weight) {
        this.name = name;
        this.age = age;
        this.isCollegeStudent = isCollegeStudent;
        this.weight = Double.parseDouble(weight);
    }

    public void printProfile() {
        System.out.println("이름 : " + this.name);
        System.out.println("나이 : " + this.age);
        System.out.println("대학생인가요? : " + this.isCollegeStudent);
        System.out.println("몸무게 : " + this.weight);
        System.out.println();
    }
}
