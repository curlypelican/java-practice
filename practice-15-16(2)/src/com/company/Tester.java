package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tester {

    Tester() {}

    public void test() {

        Bank Test = new Bank("Person");
        int atm1 = 5000, atm2 = 1000;

        ATM test1 = new ATM(Test, true, 1, atm1);
        ATM test2 = new ATM(Test, false, 2, atm2);
        ATM test3 = new ATM(Test, false, 3, atm2);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        service.execute(test1);
        service.execute(test2);
        service.execute(test3);
        service.shutdown();
    }
}
