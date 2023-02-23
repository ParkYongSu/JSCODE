package jscode7;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private List<Member> members = new ArrayList<>();

    public void add(Member member) {
        this.members.add(member);
    }

    public boolean checkExistEmail(String email) {
        for (Member member : this.members) {
            if (member.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public void findUserByName(String name) {
        for (Member member : this.members) {
            if (member.getName().equals(name)) {
                if (member.getClass() == Member.class) {
                    System.out.println(member.getName() + "님은 일반 회원이고, 이메일은 " + member.getEmail()
                        + "이고, 나이는 " + member.getAge() + "살입니다.");
                }
                else {
                    System.out.println(member.getName() + "님은 VIP 회원이고, 이메일은 " + member.getEmail()
                        + "이고, 나이는 " + member.getAge() + "살입니다.");
                }

                return;
            }
        }
        System.out.println("등록되지 않은 회원입니다.");
    }
}
