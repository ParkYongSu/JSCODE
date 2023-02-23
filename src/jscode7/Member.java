package jscode7;

import java.util.Objects;

public class Member {
    private final String email, name;
    private final int age;

    public Member(String email, String name, int age) {
        this.email = email;
        this.name = name;
        this.age = age;
    }

    public String getEmail() {return this.email;}

    public String getName() {return this.name;}

    public int getAge() {return this.age;}
}
