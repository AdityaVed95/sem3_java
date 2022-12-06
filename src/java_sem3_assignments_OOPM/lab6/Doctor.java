package java_sem3_assignments_OOPM.lab6;

import java.util.*;

public class Doctor extends HospitalEmployee
{
    Vector <Patient> allottedPatients;

    public Doctor(String employeeName, String employeeId, double salary)
    {
        super(employeeName, employeeId, salary);
        allottedPatients = new Vector<>();
    }

    public int consultPatient(Patient patient)
    {
        return 0;
    }


}
