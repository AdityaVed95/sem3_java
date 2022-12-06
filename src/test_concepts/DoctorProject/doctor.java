package test_concepts.DoctorProject;

import java.util.*;

public class doctor
{
    String did, dname, specilist, doc_qual;
    int droom;

    ArrayList<String> appo=new ArrayList<String>();
    void getdata()
    {
        appo.add("10:00");
        appo.add("10:20");
        appo.add("10:40");
        appo.add("11:00");
    }

    void app()
    {
        Scanner ob = new Scanner(System.in);
        int k8=0;
        String n;
        do
        {
            System.out.println("Choose  ur app");

            for(int i=0;i<=appo.size()-1;i++)
            {
                System.out.println(appo.get(i));
            }

            n=ob.nextLine();

            for(int i=0;i<=appo.size()-1;i++)
            {
                if((appo.get(i)).equals(n))
                {
                    System.out.println("Appointment set for "+appo.get(i));
                    appo.remove(i);
                    k8=1;
                    break;
                }
                else if((appo.get(i)).equals(n)==false)
                {
                    System.out.println("Wrong Input, Pls Re-Enter");
                    k8=0;
                }
            }
        }while(k8==0);

    }

    void doctor_info()
    {
        System.out.println( dname + "  \t" + specilist + "     \t" + doc_qual);
        System.out.println("All Timings available");
        for(int i=0;i<=appo.size()-1;i++)
        {
            System.out.println(appo.get(i));
        }
        System.out.println("\n");
    }

}
