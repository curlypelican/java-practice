package com.company;
import java.util.*;

public class Company {
    //список сотрудников
    protected ArrayList<Employee> listEmp = new ArrayList<Employee>();

    Company() {}

    //hire() - найм одного сотрудника
    public void hire(String profession) {
        double sum = 0;
        if (profession == "TopManager") {

            for (int i = 0; i < listEmp.size(); i++) {
                if (listEmp.get(i).getJobTitle() == "Manager")
                    sum += listEmp.get(i).salary;
            }
            if (sum > 10000000)
                sum = 1;
            else
                sum = 0;
        }
        listEmp.add(new Employee(profession, 10000, sum));
    }

    //hireAll() - найм списка сотрудников
    public void hireAll(int n, String profession) {
        for (int i = 0; i < n; i++)
            hire(profession);
    }

    //fire() - увольнение сотрудника
    public void fire(int i) {
        listEmp.remove(listEmp.get(i));
    }

    //getIncome() - получение значения дохода компании
    public double getIncome() {
        double sum = 0;

        for (int i = 0; i < listEmp.size(); i++)
            if (listEmp.get(i).getJobTitle() == "Manager") {
                //System.out.println(sum);
                sum += listEmp.get(i).income;
            }

        return sum;
    }

    //Создайте два метода, возвращающие список указанной длины (count).
    //Они должны содержать сотрудников, отсортированных
    //по убыванию и возрастанию заработной платы:
    public ArrayList <Employee> getTopSalaryStaff(int count) {

        double[][] arr = new double[listEmp.size()][2];

        for (int i = 0; i < listEmp.size(); i++){
            arr[i][0] = listEmp.get(i).calcSalary();
            arr[i][1] = i;
        }

        for (int i = 0; i < listEmp.size(); i++)
            for (int j = 0; j < listEmp.size(); j++)
                if (arr[i][0] > arr[j][0])
                {
                    double x = arr[i][0];
                    double y = arr[i][1];
                    arr[i][0] = arr[j][0];
                    arr[i][1] = arr[j][1];
                    arr[j][0] = x;
                    arr[j][1] = y;
                }

        ArrayList<Employee> emp = new ArrayList<Employee>();

        for (int i = 0; i < count; i++)
            emp.add(listEmp.get((int)arr[i][1]));
        return emp;
    }

    public ArrayList <Employee> getLowestSalaryStaff(int count) {

        double[][] arr = new double[listEmp.size()][2];

        for (int i = 0; i < listEmp.size(); i++){
            arr[i][0] = listEmp.get(i).calcSalary();
            arr[i][1] = i;
        }

        for (int i = 0; i < listEmp.size(); i++)
            for (int j = 0; j < listEmp.size(); j++)
                if (arr[i][0] < arr[j][0])
                {
                    double x = arr[i][0];
                    double y = arr[i][1];
                    arr[i][0] = arr[j][0];
                    arr[i][1] = arr[j][1];
                    arr[j][0] = x;
                    arr[j][1] = y;
                }

        ArrayList<Employee> emp = new ArrayList<Employee>();

        for (int i = 0; i < count; i++)
            emp.add(listEmp.get((int)arr[i][1]));

        return emp;
    }
}
