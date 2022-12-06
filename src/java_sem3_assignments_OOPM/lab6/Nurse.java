package java_sem3_assignments_OOPM.lab6;

import java.util.*;

public class Nurse extends HospitalEmployee
{

    Vector <Patient> allottedPatients;

    public Nurse(String employeeName, String employeeId, double salary)
    {
        super(employeeName, employeeId, salary);
        allottedPatients = new Vector<>();
    }

    public int servePatient(Patient patient)
    {
        return 0;
    }
}