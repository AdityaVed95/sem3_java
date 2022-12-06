package java_sem3_assignments_OOPM.lab9.Engineering;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Launcher
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException
    {
        Marks m1 = new Marks();
        while (true)
        {
            System.out.println("Enter 1 to Create new student entry");
            System.out.println("Enter 2 to display a student entry");
            System.out.println("Enter 3 to display all students entry");
            System.out.println("Enter 4 to sort all student entries by total marks");
            System.out.println("Enter 5 to exit");

            String response;
            response = br.readLine();
            if(response.equals("1"))
            {
                System.out.println("Enter student name: ");
                String name;
                name = br.readLine();

                System.out.println("Enter student Roll no");
                int roll_no = Integer.parseInt(br.readLine());

                System.out.println("Enter Subject 1 marks :");
                int s1 = Integer.parseInt(br.readLine());

                System.out.println("Enter Subject 2 marks :");
                int s2 = Integer.parseInt(br.readLine());

                System.out.println("Enter Subject 3 marks :");
                int s3 = Integer.parseInt(br.readLine());

                System.out.println("Enter Subject 4 marks :");
                int s4 = Integer.parseInt(br.readLine());


                m1.studentVector.add(new Student(roll_no,name,s1,s2,s3,s4));

            }

            else if(response.equals("2"))
            {
                System.out.println("Enter roll no of student :");
                int r = Integer.parseInt(br.readLine());
                int flag = 0;
                for(Student obj : m1.studentVector)
                {
                    if(obj.roll_no == r)
                    {
                        obj.displayStudentDetails();
                        flag = 1;
                    }
                }

                if(flag == 0)
                {
                    System.out.println("Student with given roll no not found");
                }
            }

            else if(response.equals("3"))
            {
               m1.displayDetailsOfAllStudents();
            }

            else if(response.equals("4"))
            {
                m1.sortAllStudentsByTotalMarks();
            }

            else if(response.equals("5"))
            {
                break;
            }

            else
            {
                System.out.println("Invalid input : please try again !!!");
            }

        }

    }
}
