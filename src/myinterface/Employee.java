package myinterface;

/**
 *
 * @author Stuart - HP AMD 10
 */
public interface Employee {
    
    // employee default constructor
    //  can't really have since you can't implement it
    // public void Employee();
    
    // for constructor with employee number and name
    //  can't really have since you can't implement it
    // public void Employee(String employeeNum, String employeeName);
    
    //  for constructor with employee number, name, and hire date
    //  can't really have since you can't implement it
    // public void Employee(String employeeNum, String employeeName, int hireDate);
    
    public String getEmployeeName();

    public void setEmployeeName(String employeeName);

    public String getEmployeeNum();
    
    public void setEmployeeNum(String employeeNum);

    public int getHireDate();

    public void setHireDate(int hireDate);

    public int getTermDate();

    public void setTermDate(int termDate);
    
    @Override
    public String toString();        
    
}
