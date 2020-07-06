package cn.eirture.aop.advices;

public interface CustomerService {

    void doSomething();

    String getName();

    String getAge();

    double calculatePayment(double rate, int hours);
}
