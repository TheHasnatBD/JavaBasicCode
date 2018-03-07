package LinkedList;

import java.util.LinkedList;

public class EmployeeList {
    public static void main(String[] args) {

        //Employee Linked list
        LinkedList<Employee> employees = new LinkedList<Employee>();

        //Insert Employee
        Employee employee1 = new Employee(1, "Name 1", "Dept 1", "Number 1");
        Employee employee2 = new Employee(2, "Name 2", "Dept 2", "Number 2");
        Employee employee3 = new Employee(3, "Name 3", "Dept 3", "Number 3");
        Employee employee4 = new Employee(4, "Name 4", "Dept 4", "Number 4");
        Employee employee5 = new Employee(5, "Name 5", "Dept 5", "Number 5");
        Employee employee6 = new Employee(6, "Name 6", "Dept 6", "Number 6");
        Employee employee7 = new Employee(7, "Name 7", "Dept 7", "Number 7");
        Employee employee8 = new Employee(8, "Name 8", "Dept 8", "Number 8");
        Employee employee9 = new Employee(9, "Name 9", "Dept 9", "Number 9");

        //Add to linked list
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);
        employees.add(employee9);

        //Print all employee information
        for (Employee employee : employees ){
            System.out.println("ID: "+employee.id +"\tName: "+employee.name+",\tDept: "+employee.dept+",\tMobile: "+employee.mobile);
        }

    }
}
