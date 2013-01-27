package myabstract;

/**
 *
 * @author Stuart - HP AMD 10
 */
public abstract class Employee {
    
    private String  employeeName;   // Employee name
    protected String  employeeNum;    // Employee number
    private int     hireDate;       // Employee Hire date (ccyymmdd)
    private int     termDate;       // Employee Termination date (ccyymmdd)
    
    /**
     * default constructor
     */
    public Employee() {
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

    /**
     * Making this an abstract method.  Each subclass can have its own edit
     * and format requirements.  However, this field is required.
     * @param employeeNum 
     */
    public abstract void setEmployeeNum(String employeeNum);

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
    
    public String toString() {
        String str = "EmpNum: " + employeeNum
                + "   EmpName: " + employeeName
                + "   Hire Date: " + hireDate 
                + "   Termination Date: " + termDate + "\n";
        return str;
    }
    
}
