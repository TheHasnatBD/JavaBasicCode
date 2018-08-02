package abstraction;

public class EmployeeMainClass {

    public static void main(String[] args) {

        BaseSalaryEmp baseSalaryEmp = new BaseSalaryEmp("Hasnat", "019", 20000);
        HourlySalaryEmp hourlySalaryEmp = new HourlySalaryEmp("Adom", "111", 500, 48);


        Employee[] employees = new Employee[2];
        employees[0] = baseSalaryEmp;
        employees[1] = hourlySalaryEmp;

        for (Employee employee : employees){
            System.out.println(employee.getClass().getSimpleName()+": "+ employee.getSalary());

        }


        System.out.println("---------------------");
        System.out.println(Employee.getCompany_name());
        Employee.company_location = "Khulna"; // to modify static value, access first the CLASS
        System.out.println(hourlySalaryEmp.company_location);


        BaseAndCommissionSalaryEmp em =
                new BaseAndCommissionSalaryEmp("Hasan", "234", 15000, 500, 5, 7);
        System.out.println("----------Base & Commission Salary-----------");
        System.out.println(em.getSalary());




    }
}
