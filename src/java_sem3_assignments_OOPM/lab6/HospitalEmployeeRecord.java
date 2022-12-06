package java_sem3_assignments_OOPM.lab6;

import java.util.Vector;

public class HospitalEmployeeRecord
{
//    public void allotPatient(@NotNull Patient P1 , @NotNull Doctor D1)
//    {
//        (D1.getAllottedPatientsId()).add(P1.patientId);
//    }
//
//    public void deAllotPatient(@NotNull Patient P1, @NotNull Doctor D1)
//    {
//        (D1.getAllottedPatientsId()).remove(P1.patientId);
//    }

    Vector<Doctor> doctorsRecord;
    Vector<Nurse> nursesRecord;
    Vector<Receptionist> receptionistsRecord;
    Vector<ServiceStaff> serviceStaffsRecord;

    HospitalEmployeeRecord()
    {
        doctorsRecord = new Vector<>();
        nursesRecord= new Vector<>();
        receptionistsRecord = new Vector<>();
        serviceStaffsRecord = new Vector<>();

    }

    private Doctor searchDoctor(String id)
    {
        // if doctor with given id exists : returns that doctor,
        // else returns null

        for (Doctor doctorObject : doctorsRecord)
        {
            if((doctorObject.getEmployeeId()).equals(id))
            {
                return doctorObject;
            }
        }

        return null;
    }

    private Nurse searchNurse(String id)
    {
        // if doctor with given id exists : returns that doctor,
        // else returns null

        for (Nurse nurseObject : nursesRecord)
        {
            if((nurseObject.getEmployeeId()).equals(id))
            {
                return nurseObject;
            }
        }

        return null;
    }

    private Receptionist searchReceptionist(String id)
    {
        // if doctor with given id exists : returns that doctor,
        // else returns null

        for (Receptionist receptionistObject : receptionistsRecord)
        {
            if((receptionistObject.getEmployeeId()).equals(id))
            {
                return receptionistObject;
            }
        }

        return null;
    }

    private ServiceStaff searchServiceStaff(String id)
    {
        // if doctor with given id exists : returns that doctor,
        // else returns null

        for (ServiceStaff ServiceStaffObject : serviceStaffsRecord)
        {
            if((ServiceStaffObject.getEmployeeId()).equals(id))
            {
                return ServiceStaffObject;
            }
        }

        return null;
    }

    public HospitalEmployee searchEmployee(String id)
    {

        HospitalEmployee hospitalEmployeeObject1 = searchDoctor(id);
        if(hospitalEmployeeObject1 != null)
        {
            return hospitalEmployeeObject1;
        }

        HospitalEmployee hospitalEmployeeObject2 = searchNurse(id);
        if(hospitalEmployeeObject2 != null)
        {
            return hospitalEmployeeObject2;
        }

        HospitalEmployee hospitalEmployeeObject3 = searchReceptionist(id);
        if(hospitalEmployeeObject3 != null)
        {
            return hospitalEmployeeObject3;
        }

        HospitalEmployee hospitalEmployeeObject4 = searchServiceStaff(id);
        if(hospitalEmployeeObject4 != null)
        {
            return hospitalEmployeeObject4;
        }

        return null;

    }

    public void addHospitalEmployeeToRecord(HospitalEmployee hospitalEmployee)
    {
        // check which class is the hospitalEmployee object of
        // accordingly add it in the respective vector
    }

    public void deleteHospitalEmployeeFromRecord(HospitalEmployee hospitalEmployee)
    {
        
    }

}

