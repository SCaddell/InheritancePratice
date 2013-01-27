package myconcrete;

/**
 *
 * @author Stuart - HP AMD 10
 */
public class HourlyEmployee extends Employee {
    
    private double  hourlyPayRate;      // current hourly pay rate

    /**
     * default constructor
     */
    public HourlyEmployee() {
        hourlyPayRate = 0.0;
    }
    
    /**
     * Constructor with Employee name and number
     * @param employeeNum
     * @param employeeName 
     */
    public HourlyEmployee(String employeeNum, String employeeName) {
        super(employeeNum, employeeName);
        hourlyPayRate = 0.0;
    }
    
    /**
     * Constructor with employee name, number, and hire date
     * @param employeeNum
     * @param employeeName
     * @param hireDate 
     */
    public HourlyEmployee(String employeeNum, String employeeName, 
           int hireDate) {
        super(employeeNum, employeeName, hireDate);
        hourlyPayRate = 0.0;
    }
    
    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
    
}