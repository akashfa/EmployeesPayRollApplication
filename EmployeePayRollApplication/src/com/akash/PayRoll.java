package com.akash;

import java.util.ArrayList;

public class PayRoll {
    private ArrayList<Employee> employeeList;
    public PayRoll(){
        this.employeeList=new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void removeEmployee(int id){
        Employee removeEmp=null;
        for(Employee employee:employeeList){
            if(employee.getEmplId()==id){
                removeEmp=employee;
                break;
            }
        }
        if(removeEmp!=null){
            employeeList.remove(removeEmp);
        }
    }

    public void totalPayEmployees(){
        double totalPay=0;
        for(Employee employee:employeeList){
            totalPay+=employee.calcuateSalary();
        }
        System.out.println("Total Pay for Employees: "+totalPay);
    }
    public void displayEmployee(){
        System.out.println(employeeList);
    }
}
