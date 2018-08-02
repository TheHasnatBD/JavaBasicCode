package abstraction;

public class HourlySalaryEmp extends Employee {

    private double hour_rate, total_hour;


    public HourlySalaryEmp(String name, String id, double hour_rate, double total_hour) {
        super(name, id);
        this.hour_rate = hour_rate;
        this.total_hour = total_hour;
    }

    public double getHour_rate() {
        return hour_rate;
    }

    public void setHour_rate(double hour_rate) {
        this.hour_rate = hour_rate;
    }

    public double getTotal_hour() {
        return total_hour;
    }

    public void setTotal_hour(double total_hour) {
        this.total_hour = total_hour;
    }


    @Override
    public double getSalary() {
        return getHour_rate() * getTotal_hour();
    }
}
