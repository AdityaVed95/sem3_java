package java_sem3_assignments_OOPM.lab9.Engineering;

// import Engineering.*;

public class Student
{
    int roll_no;
    String student_name;
    int total_marks;

    int subject1_marks,subject2_marks,subject3_marks,subject4_marks;

    public Student(int roll_no, String student_name, int subject1_marks, int subject2_marks, int subject3_marks, int subject4_marks)
    {
        this.roll_no = roll_no;
        this.student_name = student_name;
        this.subject1_marks = subject1_marks;
        this.subject2_marks = subject2_marks;
        this.subject3_marks = subject3_marks;
        this.subject4_marks = subject4_marks;
        total_marks = subject1_marks+subject2_marks+subject3_marks+subject4_marks;
    }

    public void displayStudentDetails()
    {
        System.out.println("Student details : ");
        System.out.println("Name : "+student_name);
        System.out.println("Roll No : "+roll_no);
        System.out.println("Total Marks : "+total_marks);
        System.out.println("Subject 1 marks : "+subject1_marks);
        System.out.println("Subject 2 marks : "+subject2_marks);
        System.out.println("Subject 3 marks : "+subject3_marks);
        System.out.println("Subject 4 marks : "+subject4_marks);

    }

    public int getTotal_marks() {
        return total_marks;
    }

    public String getStudent_name() {
        return student_name;
    }

}
