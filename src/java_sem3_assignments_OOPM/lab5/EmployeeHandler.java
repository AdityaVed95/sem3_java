package java_sem3_assignments_OOPM.lab5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Vector;

// this program assumes that the employee name for each employee has to be unique

// unique id is ensured by the program and will give error if we try to insert another
// employee with the same id


public class EmployeeHandler
{
    Vector<Employee> employeeVector;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    EmployeeHandler()
    {
        employeeVector = new Vector<>();
    }


    public void create() throws IOException
    {
        while (true)
        {
            System.out.println("Enter 1 to insert element in the Vector");
            System.out.println("Enter 2 to exit the creation of Vector");
            String response = br.readLine();
            if(response.equals("1"))
            {
                Employee employee = takeEmployeeInput();
                int ans = verifyExistenceOfEmployeeIdInVector(employee.getId());
                if (ans == 0)
                {
                    employeeVector.add(employee);
                }
                else
                {
                    System.out.println("Sorry this ID is already taken, please try again later");
                }
            }
            else if(response.equals("2"))
            {
                break;
            }
            else
            {
                System.out.println("Invalid input, Please try again");
            }
        }

        sortEmployeeVectorOnTheBasisOfSalary();

    }

    public void insert() throws IOException
    {
        System.out.println("Enter the details of the Employee to be inserted in the Vector");
        Employee employee = takeEmployeeInput();

        int ans = verifyExistenceOfEmployeeIdInVector(employee.getId());
        if (ans == 0)
        {
            employeeVector.add(employee);
            sortEmployeeVectorOnTheBasisOfSalary();
        }
        else
        {
            System.out.println("Sorry this ID is already taken, please try again later");
        }

    }

    public void deleteByEName(String name_to_be_deleted)
    {
        int flag = 0;
        for(Employee employeeObject : employeeVector)
        {
            if(employeeObject.getName().equals(name_to_be_deleted))
            {
                employeeVector.remove(employeeObject);
                System.out.println("Successfully deleted Employee Object with name : "+name_to_be_deleted);
                flag = 1;
                break;
            }
        }

        if(flag == 0)
        {
            System.out.println("No Employee with the given name was found in the vector");
            System.out.println("Please try again later");
        }
    }

        public void deleteByEID(String id_to_be_deleted)
    {
        int flag = 0;
        for(Employee employeeObject : employeeVector)
        {
            if(employeeObject.getId().equals(id_to_be_deleted))
            {
                flag = 1;
                employeeVector.remove(employeeObject);
                System.out.println("Successfully deleted Employee Object with id : "+id_to_be_deleted);
                break;

            }
        }

        if(flag == 0)
        {
            System.out.println("No Employee with the given ID was found in the vector");
            System.out.println("Please try again later");
        }

    }

    public void displayVector()
    {
        System.out.println("The details are : ");
        for (Employee employeeObject : employeeVector)
        {
            System.out.println(employeeObject.getId()+"  :  "+employeeObject.getName()+"  :  "+employeeObject.getSalary());

        }
    }

    private Employee takeEmployeeInput() throws IOException
    {
        System.out.println("Enter the name of the employee");
        String name = br.readLine();
        System.out.println("Enter the ID of the employee");
        String id = br.readLine();
        System.out.println("Enter the salary of the employee");
        String sal = br.readLine();
        double salary = Double.parseDouble(sal);

        return new Employee(name,id,salary);
    }

    private void sortEmployeeVectorOnTheBasisOfSalary()
    {
        employeeVector.sort(Comparator.comparing(Employee::getSalary));
    }


    // the below method is useful when we are allowing more than one employees with the same name
    // in this case we can ask which employee to delete


//    private void verifyExistenceOfEmployeeNameInVector()
//    {
//
//    }

    private int verifyExistenceOfEmployeeIdInVector(String id_input)
    {
        for(Employee employeeObject: employeeVector)
        {
            if(employeeObject.getId().equals(id_input))
            {
                return 1;
            }
        }

        return 0;
    }


}
