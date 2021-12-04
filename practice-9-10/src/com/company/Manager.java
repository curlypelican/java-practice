package com.company;

public class Manager extends Employee implements EmployeePosition{

    private double income;

    Manager() {}

    public double getCell() {
        income = ((int)(115000 + (140000 - 115000 + 1) * Math.random()));
        return (105500 + 0.05 * income);
        //return (105500 + 0.05 * ((int)(115000 + (140000 - 115000 + 1) * Math.random())));
    }

    public double getInc() {
        return income;
    }
}
