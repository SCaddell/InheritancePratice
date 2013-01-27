package myinterface;

/**
 *
 * @author Stuart - HP AMD 10
 */
public class SalariedEmployee implements Employee {
    
    private String  employeeName;   // Employee name
    private String  employeeNum;    // Employee number
    private int     hireDate;       // Employee Hire date (ccyymmdd)
    private int     termDate;       // Employee Termination date (ccyymmdd)
    private double  yearlySalary;   // current yearly salary
    
    /**
     * default constructor
     */
    public SalariedEmployee() {
        this.employeeName = "";
        this.employeeNum = "";
        this.hireDate = 0;
        this.termDate = 0;
    }
    
    /**
     * Constructor with Employee name and number
     * @param employeeNum
     * @param employeeName 
     */
    public SalariedEmployee(String employeeNum, String employeeName) {
        setEmployeeNum(employeeNum);
        this.employeeName = employeeName;
        this.hireDate = 0;
        this.termDate = 0;
    }
    
    /**
     * Constructor with employee name, number, and hire date
     * @param employeeNum
     * @param employeeName
     * @param hireDate 
     */
    public SalariedEmployee(String employeeNum, String employeeName, 
            int hireDate) {
        setEmployeeNum(employeeNum);
        this.employeeName = employeeName;
        this.hireDate = hireDate;
        this.termDate = 0;
    }

    @Override
    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String getEmployeeNum() {
        return employeeNum;
    }

    @Override
    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    @Override
    public int getHireDate() {
        return hireDate;
    }

    @Override
    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public int getTermDate() {
        return termDate;
    }

    @Override
    public void setTermDate(int termDate) {
        this.termDate = termDate;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }
    
    @Override
    public String toString() {
        String str = "myinterface"
                + "   EmpNum: " + employeeNum
                + "   EmpName: " + employeeName
                + "   Hire Date: " + hireDate 
                + "   Termination Date: " + termDate 
                + "   Salary: " + yearlySalary + "\n";
        return str;
    }
    
}
