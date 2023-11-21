package com.akash;

 abstract public class Employee {
     private String emplName;
     private int  emplId;
     public Employee(String empName,int emplId){
         this.emplName=empName;
         this.emplId=emplId;

     }
     abstract public double calcuateSalary();

     public String getEmplName() {
         return emplName;
     }

     public void setEmplName(String emplName) {
         this.emplName = emplName;
     }

     public int getEmplId() {
         return emplId;
     }

     public void setEmplId(int emplId) {
         this.emplId = emplId;
     }

     @Override
     public String toString() {
         return "Employee{" +
                 "emplName='" + emplName + '\'' +
                 ", emplId=" + emplId +
                 '}';
     }
 }
