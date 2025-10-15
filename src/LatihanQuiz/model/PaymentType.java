package LatihanQuiz.model;

public abstract class PaymentType {
    public abstract void displayInfo();
    public abstract double calculate(double amount);
}
