package myconcrete;

/**
 *
 * @author Stuart - HP AMD 10
 */
public class Employee {
    
    private String  employeeName;   // Employee name
    private String  employeeNum;    // Employee number
    private int     hireDate;       // Employee Hire date (ccyymmdd)
    private int     termDate;       // Employee Termination date (ccyymmdd)
    
    /**
     * Constructor with Employee name and number
     * @param employeeNum
     * @param employeeName 
     */
    public Employee(String employeeNum, String employeeName) {
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
    public Employee(String employeeNum, String employeeName, int hireDate) {
        setEmployeeNum(employeeNum);
        this.employeeName = employeeName;
        this.hireDate = hireDate;
        this.termDate = 0;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public int getHireDate() {
        return hireDate;
    }

    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }

    public int getTermDate() {
        return termDate;
    }

    public void setTermDate(int termDate) {
        this.termDate = termDate;
    }
    
}
