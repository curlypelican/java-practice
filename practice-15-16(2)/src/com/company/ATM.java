package com.company;

public class ATM implements Runnable {

    private Bank account;
    private boolean op;
    private int thread;
    int sum;

    ATM(Bank account, boolean op, int thread, int sum) {
        this.account = account;
        this.op = op;
        this.thread = thread;
        this.sum = sum;
    }

    @Override
    public synchronized void run() {
        Thread.currentThread().setName("Вход в поток " + this.thread +
                (this.op ? "    Пополнение: " : "   Снятие: ") + sum);
        
        System.out.println(Thread.currentThread().getName());
        
        if (this.op)
            account.deposit(this.sum, this.thread);
        else
            account.withdraw(this.sum, this.thread);
    }
}