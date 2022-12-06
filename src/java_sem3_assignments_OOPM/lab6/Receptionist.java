package java_sem3_assignments_OOPM.lab6;

import java.util.Vector;

public class Receptionist extends HospitalEmployee
{
    Vector<Bill> allottedBills;


    public Receptionist(String employeeName, String employeeId, double salary)
    {
        super(employeeName, employeeId, salary);
        allottedBills = new Vector<>();
    }

    public void makePaymentOfCustomer(Patient patient)
    {

    }

}
