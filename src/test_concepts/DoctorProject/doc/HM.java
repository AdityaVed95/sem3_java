package test_concepts.DoctorProject.doc;
import java.util.*;

public class HM
{

    public static void main(String ar[])
    {
        Scanner ob=new Scanner(System.in);
        int choice;
        AP ap=new AP();
        doctor pob=new doctor();
        doctor[] d = new doctor[25];

        for (int i = 0; i < 4; i++)
            d[i] = new doctor();

        d[0].did = "21";
        d[0].dname = "Dr.Ghanendra";
        d[0].specilist = "ENT";

        d[0].doc_qual = "MBBS,MD";
        d[0].droom = 17;

        d[1].did = "32";
        d[1].dname = "Dr.Vikram";
        d[1].specilist = "Physician";
        d[1].doc_qual = "MBBS,MD";
        d[1].droom = 45;

        d[2].did = "17";
        d[2].dname = "Dr.Rekha";
        d[2].specilist = "Surgeon";
        d[2].doc_qual = "BDM";
        d[2].droom = 8;

        d[3].did = "33";
        d[3].dname = "Dr.Pramod";
        d[3].specilist = "Artho";
        d[3].doc_qual = "MBBS,MS";
        d[3].droom = 40;
        int k69=0;
        do
        {
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("             WELCOME TO DOCTOR APPOINTMENT BOOKING");
            System.out.println("                      PATIENT LOGIN");
            int k22=0;
            int da=0;
            ap.patientcheck();
            System.out.print('\u000C');
            do
            {
                System.out.println("\n                                    MAIN MENU");
                System.out.println("\n");
                System.out.println("-----------------------------------------------------------------------------------");
                System.out.println("1.Doctors List  2. Appointment  3.Logout  4.Exit");
                System.out.println("-----------------------------------------------------------------------------------");
                int choi=ob.nextInt();

                switch(choi)
                {
                    case 1:
                        System.out.println("");
                        for(int i=0;i<4;i++)
                        {
                            d[i].doctor_info();

                        }

                        break;
                    case 2:

                        if(k22==0)
                        {
                            d[0].getdata();
                            d[1].getdata();
                            d[2].getdata();
                            d[3].getdata();
                        }
                        System.out.println("Choose ur doctor");
                        for(int i=0;i<4;i++)
                        {
                            System.out.println((i+1)+". ");
                            d[i].doctor_info();
                        }
                        int cd=ob.nextInt();
                        System.out.print('\u000C');
                        if(cd>4||cd<0)
                        {
                            System.out.println("Wrong Input, Pls Re-Enter");
                            da=15;
                        }

                        d[cd-1].app();
                        k22=1;
                        break;
                    case 3:
                        System.out.print('\u000C');
                        System.out.println("You have successfully logout");
                        da=15;
                        k69=1;
                        break;
                    case 4:
                        System.out.print('\u000C');
                        System.out.println("You have successfully exited");
                        da=15;
                        k69=2;
                        break;
                    default:
                        System.out.println("Wrong Input, Pls Re-Enter");

                }

            }while(da==0);
        }while(k69==1);
    }
}
