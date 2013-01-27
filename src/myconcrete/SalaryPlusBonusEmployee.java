package myconcrete;

/**
 *
 * @author Stuart - HP AMD 10
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee {
    
    private double  empBonus;      // empolyee bonus
    
    /**
     * default constructor
     */
    public SalaryPlusBonusEmployee() {
        empBonus = 0.0;
    }
    
    /**
     * Constructor with Employee name and number
     * @param employeeNum
     * @param employeeName 
     */
    public SalaryPlusBonusEmployee(String employeeNum, String employeeName) {
        super(employeeNum, employeeName);
        empBonus = 0.0;
    }
    
    /**
     * Constructor with employee name, number, and hire date
     * @param employeeNum
     * @param employeeName
     * @param hireDate 
     */
    public SalaryPlusBonusEmployee(String employeeNum, String employeeName, 
           int hireDate) {
        super(employeeNum, employeeName, hireDate);
        empBonus = 0.0;
    }

    public double getEmpBonus() {
        return empBonus;
    }

    public void setEmpBonus(double empBonus) {
        this.empBonus = empBonus;
    }

    public String toString() {
        String str = super.toString()
                + "Employee Bonus: " + empBonus + "\n";
        return str;
    }
    
}
