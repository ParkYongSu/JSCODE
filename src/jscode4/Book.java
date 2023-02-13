package jscode4;

public class Book {
    private final String name;
    private boolean enableRental;

    public Book(String name, boolean enableRental) {
        this.name = name;
        this.enableRental = enableRental;
    }

    public void printInfo(int number) {
        String rentStatus = this.enableRental ? "대여 가능" : "대여 중";
        System.out.println(number + ". " + name + "-" + rentStatus);
    }

    public boolean getEnableRental() {return this.enableRental;}

    public void setEnableRental(boolean value) {this.enableRental = value;}
}
