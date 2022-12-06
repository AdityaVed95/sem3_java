package test_concepts.DoctorProject.doc;

import java.util.ArrayList;
import java.util.Scanner;

class AP
{

    ArrayList<String> patientname=new ArrayList<String>();
    ArrayList<String> patientage=new ArrayList<String>();
    ArrayList<String> patientpassword=new ArrayList<String>();
    ArrayList<Long> patientphonenumber=new ArrayList<Long>();
    void validate(long pn)throws PhoneNoEx
    {
        long r,s;
        int lennum=0;
        while(pn>0)
        {
            r=pn%10;
            lennum++;
            pn=pn/10;
        }
        if(lennum!=10)
        {
            throw new PhoneNoEx("Invalid Phone No");
        }

    }

    void patientcheck()
    {
        Scanner sc=new Scanner(System.in);
        int k=0;

        do{
            System.out.println("                 1. Login     2. Registration");
            System.out.println("--------------------------------------------------------------------------------");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    if(patientphonenumber.isEmpty())
                    {
                        System.out.println("No Patients Register then Login");
                        k=1;
                        break;
                    }
                    else
                    {
                        int lo=login();
                        if(lo==1)
                        {
                            System.out.print('\u000C');
                            System.out.println("Login Successfull");
                            k=0;
                        }
                    }
                    break;
                case 2:
                    System.out.println("\t\t | WELCOME TO PATIENT REGISTRATION |");
                    System.out.println("\n");
                    System.out.println("Enter your name");
                    String nam=sc.next();
                    patientname.add(nam);
                    System.out.println("Enter your age");
                    String agee=sc.next();
                    patientage.add(agee);

                    System.out.println("Enter your phone number");
                    long phonenumber=sc.nextLong();
                    try
                    {
                        validate(phonenumber);
                    }
                    catch(PhoneNoEx ex)
                    {
                        System.out.println("Caught the Exception");
                        System.out.println("Exception is:"+ex);
                        k=1;
                        break;
                    }
                    long mno;
                    int k11=1;
                    if(patientphonenumber.isEmpty())
                    {
                        patientphonenumber.add(phonenumber);
                        System.out.println("Enter Password");
                        String pas=sc.next();
                        patientpassword.add(pas);
                        System.out.print('\u000C');
                        System.out.println("Registration Successfull");
                        k=1;
                    }
                    else
                    {
                        for(int i=0;i<=patientphonenumber.size()-1;i++)
                        {
                            mno=patientphonenumber.get(i);
                            if(mno==phonenumber)
                            {
                                System.out.print('\u000C');
                                System.out.println("Registration UnSuccessfull");
                                System.out.println("Same mobile number not allowed");
                                k=1;
                                k11=0;
                            }
                        }
                        if(k11==1)
                        {
                            patientphonenumber.add(phonenumber);
                            System.out.println("Enter Password");
                            String pas=sc.next();
                            patientpassword.add(pas);
                            System.out.print('\u000C');
                            System.out.println("Registration Successfull");
                            k=1;
                        }
                    }
                    break;

                default:
                    System.out.println("Wrong Input, Pls Re-Enter");
                    k=1;
                    break;

            }
        }while(k==1);
    }

    void validate(int check)throws WIEx
    {
        if(check !=patientphonenumber.size()&&check!=patientphonenumber.size())
        {
            throw new WIEx("Wrong Username or Password, Pls Re-Enter");

        }
    }

    int login()
    {
        Scanner in=new Scanner(System.in);
        int x=0;
        int x1=0;
        do
        {
            System.out.println("Enter Id (Phone Number): ");
            long no=in.nextLong();
            int k31=0;
            System.out.println("Enter Password ");
            String pass=in.next();
            for(int j=0;j<=patientphonenumber.size()-1;j++)
            {
                if((patientphonenumber.get(j)).equals(no)&&(patientpassword.get(j)).equals(pass))
                {
                    x=1;
                    x1=1;
                    break;
                }
                else if((patientphonenumber.get(j)).equals(no)==false&&(patientpassword.get(j)).equals(pass)==false)
                {
                    k31++;

                }

            }
            try
            {
                validate(k31);
            }
            catch(WIEx e)
            {
                System.out.println("Caught the Exception");
                System.out.println("Exception is:"+e);
                x1=0;
                break;
            }
        }while(x1==0);
        return(x);
    }

}