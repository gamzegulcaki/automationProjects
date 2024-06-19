package io.github.gamzegulcaki;

import java.util.List;

public class Main {

  public static void main(String[] args) {
   Department itDepartment=new Department("IT");
   Employee employee1=new Employee("Gamze Gül Çakı","Software Test Engineer",10);
   Employee employee2=new Employee("Ayşegül Biricik","Software Test Engineer",5);
   itDepartment.addEmployee(employee1);
   itDepartment.addEmployee(employee2);
    List<Employee> employeeList=itDepartment.getEmployeeList();

    System.out.println("Department: "+itDepartment.getName());
    for (Employee employee: employeeList){
      System.out.println(employee);
    }
  }

}