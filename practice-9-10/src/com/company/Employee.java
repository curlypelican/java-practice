package com.company;

public class Employee extends Company implements EmployeePosition{

    public String name;
    public String surname;
    public String position;
    public double salary;
    public double income;

    Employee() {}

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    Employee(String position, double salary, double s) {
        switch(position) {
            case "Manager": {
                Manager m = new Manager();
                this.salary = m.getCell();
                income = m.getInc();
                break;
            }
            case "TopManager": {
                if (s == 1)
                    this.salary = new TopManager().getCell() * 1.5;
                else
                    this.salary = new TopManager().getCell();
                break;
            }
            case "Operator": {
                this.salary = new Operator().getCell();
                break;
            }
        }
        this.position = position;
    }

    public String getJobTitle() {
        return this.position;
    }

    public double calcSalary() {
        return this.salary;
    }
}

