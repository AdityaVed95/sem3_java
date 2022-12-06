package java_sem3_assignments_OOPM.lab9.Engineering;
import java_sem3_assignments_OOPM.lab5.Employee;

import java.util.*;
// import Engineering.*;

public class Marks
{
    Vector<Student> studentVector;

    Marks()
    {
        studentVector = new Vector<>();
    }

    public void displayMarksOfAllStudents()
    {
        System.out.println("All the Students Marks : ");
        for(Student studentObject : studentVector)
        {
            System.out.println(studentObject.getStudent_name()+ "  :  "+studentObject.getTotal_marks());
        }
    }

    public void sortAllStudentsByTotalMarks()
    {
        studentVector.sort(Comparator.comparing(Student::getTotal_marks));
    }

    public void displayDetailsOfAllStudents()
    {
        for(Student object : studentVector)
        {
            object.displayStudentDetails();
            System.out.println("\n");

        }
    }



}
