package abstraction;

public class BaseSalaryEmp extends Employee {

    private double monthly_salary;

    public BaseSalaryEmp(String name, String id, double monthly_salary) {
        super(name, id);
        this.monthly_salary = monthly_salary;
    }

    public double getMonthly_salary() {
        return monthly_salary;
    }

    public void setMonthly_salary(double monthly_salary) {
        this.monthly_salary = monthly_salary;
    }



    @Override
    public double getSalary() {
        return getMonthly_salary();
    }
}
