package cn.eirture.aop.advices;

import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    public void doSomething() {
        System.out.println("do something in the CustomerServiceImpl...");
    }
}