package com.akash;


public class Main {
    public static void main(String[] args) {

        PayRoll payRoll=new PayRoll();

        FullTimeEmployee emp1=new FullTimeEmployee("Akash Sharma",1,30000);
        PartTimeEmployee emp2=new PartTimeEmployee("Viaks Sharma",2,50,100);

        payRoll.addEmployee(emp1);
        payRoll.addEmployee(emp2);
       // Add Employess Sccessfully :

        double salary= emp1.calcuateSalary();
        System.out.println("Fulltime Employess Salary : "+salary);
        System.out.println("Part time Employess Salary :");
        double salary1=emp2.calcuateSalary();
        System.out.println("Part time Employess Salary : "+salary1);

        payRoll.totalPayEmployees();
        System.out.println("Before Employess: ");
        payRoll.displayEmployee();
        System.out.println("After remove employess :");
        payRoll.removeEmployee(1);
        payRoll.displayEmployee();

    }
}