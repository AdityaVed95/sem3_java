package java_sem3_assignments_OOPM.lab6;

public abstract class HospitalEmployee
{
    //POJO
    String EmployeeName;
    String employeeId;
    double salary;

    public HospitalEmployee(String employeeName, String employeeId, double salary)
    {
        EmployeeName = employeeName;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getEmployeeId()
    {
        return employeeId;
    }

    public double getSalary()
    {
        return salary;
    }

    public String getEmployeeName()
    {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
