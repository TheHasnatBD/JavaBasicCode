package abstraction;


public class BaseAndCommissionSalaryEmp extends Employee {

    private double monthly_salary, product_price, commission_rate, total_sale;


    public BaseAndCommissionSalaryEmp(String name, String id, double monthly_salary, double product_price, double commission_rate, double total_sale) {
        super(name, id);
        this.monthly_salary = monthly_salary;
        this.product_price = product_price;
        this.commission_rate = commission_rate;
        this.total_sale = total_sale;
    }

    public double getMonthly_salary() {
        return monthly_salary;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public void setMonthly_salary(double monthly_salary) {
        this.monthly_salary = monthly_salary;
    }

    public double getCommission_rate() {
        return commission_rate;
    }

    public void setCommission_rate(double commission_rate) {
        this.commission_rate = commission_rate;
    }

    public double getTotal_sale() {
        return total_sale;
    }

    public void setTotal_sale(double total_sale) {
        this.total_sale = total_sale;
    }


    @Override
    public double getSalary() {
        return getMonthly_salary() + ((getCommission_rate() * getProduct_price()) / 100) * getTotal_sale();
    }
}
