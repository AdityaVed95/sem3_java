package HeadFirstOOAD.chp1.airplane_ex2.case2;

// this program demonstrates the problem of making speed variable public
// if we want to make some modifications and then set the speed
// then it would be tricky if we keep speed as a public variable
// we may do the mistake of accessing it directly instead of using
// the getter and setter methods
// to avoid this mistake , we make the variable private

// here we also learnt the benefits of encapsulation


// encapsulation defn :
// encapsulation. The process of enclosing programming elements inside
// larger, more abstract entities. Also known as information hiding,
// or separation of concerns.

public class JetLauncher2
{
    public static void main(String[] args)
    {
        Jet2 jet2 = new Jet2();
        jet2.setSpeed(400);
        int s1 = jet2.getSpeed();
        System.out.println("Speed is "+s1);

        Jet2 jet21 = new Jet2();
        jet21.speed = 400;
        System.out.println("Speed is "+jet21.speed);

    }


}
