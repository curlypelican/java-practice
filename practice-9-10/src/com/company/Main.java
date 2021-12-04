package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("=====КОМПАНИЯ 9-10=====" + "\n" + "\tДобро пожаловать!");

        Company company = new Company();

        company.hireAll(80,"Manager");
        company.hireAll(10,"TopManager");
        company.hireAll(180,"Operator");

        System.out.print("Доход компании: " + company.getIncome());
        ArrayList<Employee> a = new ArrayList<Employee>(company.getTopSalaryStaff(15));
        ArrayList<Employee> b = new ArrayList<Employee>(company.getLowestSalaryStaff(30));

        System.out.println("\n\n15 самых ВЫСОКИХ зарплат в компании: ");
        for (int i = 0; i < a.size();i++)
            System.out.print(a.get(i).calcSalary() + "\n");

        System.out.println("\n30 самых низких зарплат в компании: ");
        for (int i = 0; i < b.size(); i++)
            System.out.print(b.get(i).calcSalary() + "\n");

        for (int i = 0; i < (company.listEmp.size()) / 2; i++)
            company.fire((company.listEmp.size() / 2 + i));

        ArrayList<Employee> a1 = new ArrayList<Employee>(company.getTopSalaryStaff(15));
        ArrayList<Employee> b1 = new ArrayList<Employee>(company.getLowestSalaryStaff(30));

        System.out.println("\n\n15 самых ВЫСОКИХ зарплат после увольнения: ");
        for (int i = 0; i < a1.size(); i++)
            System.out.print(a1.get(i).calcSalary() + "\n");

        System.out.println("\n30 самых низких зарплат после увольнения: ");
        for (int i = 0; i < b1.size(); i++)
            System.out.print(b1.get(i).calcSalary() + "\n");

    }
}
