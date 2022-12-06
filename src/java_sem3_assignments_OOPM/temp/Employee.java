package java_sem3_assignments_OOPM.temp;
import java.util.*;

class Employee
{
    public static void main(String[] args)
    {
        double emp_id;
        double emp_contact_number;
        double emp_salary;
        String department;
        String emp_name;
        Scanner sc = new Scanner(System.in);
        Vector<Employee1> emp = new Vector<Employee1>();
        int x;
        do{
            System.out.println("***Main Menu***");
            System.out.println("1)Add an Employee");
            System.out.println("2)Search for Employee details");
            System.out.println("3)Exit");
            System.out.println("Enter the valid option");
            x = sc.nextInt();
            switch(x){
                case 1:
                    System.out.println("Enter the name of the employee:");
                    emp_name = sc.next();
                    System.out.println("Enter the Department in which the employee will be working:");
                    department = sc.next();
                    System.out.println("Enter the salary of the employee");
                    emp_salary = sc.nextDouble();
                    System.out.println("Enter the employee contact number");
                    emp_contact_number = sc.nextDouble();
                    emp_id = emp_contact_number + 100;
                    emp.addElement(new Employee1(emp_id, emp_name, emp_salary, emp_contact_number, department));
                    break;

                case 2:
                    System.out.println("Enter Employee ID for details");
                    emp_id=sc.nextDouble();
                    for(int i=0;i<emp.size();i++)
                    {
                        if(emp_id == (emp.get(i).id))
                        {
                            System.out.println("The salary details of the employee are:");
                            System.out.println("\n");
                            Salary.salary_details(emp.get(i).salary);
                            System.out.println("The Project Details of the employee are:");
                            System.out.println("\n");
                            Project.project(emp.get(i).Department);

                        }
                    }

                    break;

            }
        }while(x != 3);

    }
    class Salary
    {
        static void salary_details(double abc){
            if(abc<1000000){
                System.out.println("The employee gets 50000 as bonus");
                System.out.println("The Employee gets 10% tax cut");
                System.out.println("The Employee gets free transport from the company");

            } else if(2400000>abc && abc>1000000){
                System.out.println("The employee gets 100000 as bonus");
                System.out.println("The Employee gets 30% tax cut");
                System.out.println("The Employee gets free transport and a device from the company");
            } else{
                System.out.println("The employee gets 500000 as bonus");
                System.out.println("The Employee gets 30% tax cut");
                System.out.println("The Employee gets a vehicle and a device from the company");
            }
        }
    }

}

class Project{


    static void project(String Dep){
        String str1 = "Computer";
        String str2 = "HR";
        String str3 = "Leadership";
        if(Dep.equals(str1) == true){
            System.out.println("The Employee has been assigned Software Managment");
            System.out.println("Currently working on inetegration of the software pipeline");

        } else if(Dep.equals(str2) == true){
            System.out.println("The Employee works in the HR Department and is currently working on Strategy management");
            System.out.println("The Employee is also responsible for companies campus hiring policies");
        } else if(Dep.equals(str3) == true){
            System.out.println("The Employee is at a leadership role");
            System.out.println("The Empolyee is responsible for strategic roles");
        }
    }
}