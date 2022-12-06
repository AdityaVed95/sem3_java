package java_sem3_assignments_OOPM.lab6;

import java.util.Vector;

public class ServiceStaff extends HospitalEmployee
{
    Vector<Room> allottedRooms;

    public ServiceStaff(String employeeName, String employeeId, double salary)
    {
        super(employeeName, employeeId, salary);

    }

    public int CleanRoom(Room room)
    {
        return 0;
    }

}
