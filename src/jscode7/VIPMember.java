package jscode7;

public class VIPMember extends  Member{
    private final int ptCount;

    public VIPMember(String email, String name, int age, int ptCount) {
        super(email, name, age);
        this.ptCount = ptCount;
    }

    public int getPtCount() {
        return this.ptCount;
    }
}
