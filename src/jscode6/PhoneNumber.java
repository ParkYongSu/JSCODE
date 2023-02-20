package jscode6;

public class PhoneNumber {
    private final String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        validate(phoneNumber);
        this.phoneNumber = phoneNumber;
    }

    private void validate(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            throw new IllegalArgumentException("휴대폰 번호는 11글자여야 합니다.");
        }

        if (!phoneNumber.startsWith("010")) {
            throw new IllegalArgumentException("휴대폰 번호는 010으로 시작해야 합니다.");
        }
    }

    public String getPhoneNumberFormally() {
        return this.phoneNumber.substring(0, 3)
            + "-"
            + this.phoneNumber.substring(3,7)
            + "-"
            + this.phoneNumber.substring(7);
    }
}
