package myabstract;

/**
 *
 * @author Stuart - HP AMD 10
 */
public class SalariedEmployee extends Employee {
    
    private double  yearlySalary;   // current yearly salary

    /**
     * default constructor
     */
    public SalariedEmployee() {
        yearlySalary = 0.0;
    }
    
    /**
     * Constructor with Employee name and number
     * @param employeeNum
     * @param employeeName 
     */
    public SalariedEmployee(String employeeNum, String employeeName) {
        super(employeeNum, employeeName);
        yearlySalary = 0.0;
    }
    
    /**
     * Constructor with employee name, number, and hire date
     * @param employeeNum
     * @param employeeName
     * @param hireDate 
     */
    public SalariedEmployee(String employeeNum, String employeeName, 
           int hireDate) {
        super(employeeNum, employeeName, hireDate);
        yearlySalary = 0.0;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }
    
    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }
    
    public String toString() {
        String str = super.toString()
                + "Yearly Salary: " + yearlySalary + "\n";
        return str;
    }
    
}
