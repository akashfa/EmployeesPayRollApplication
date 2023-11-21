package com.akash;

public class FullTimeEmployee extends Employee{
    private double monthlySalary;
   public  FullTimeEmployee(String name,int id,double salary){
           super(name,id);
           this.monthlySalary=salary;
    }
    @Override
    public double calcuateSalary(){
       return monthlySalary;
    }
}
