package ProgrammingInJavaOxford.multithreading.one;

public class AccessMainThread
{
    public static void main(String[] args)
    {
        Thread threadObject = Thread.currentThread();
        System.out.println("Current Thread is : "+threadObject);
        threadObject.setName("MyNewThread");
        System.out.println("On renaming : "+threadObject);
        // printing the object is a call to the toString method of the object
        // the object that is printed gives the signature of the thread
        // the 1st element is the name of the thread
        // 2nd element is the thread priority and
        // 3rd element is the thread group.
        threadObject.setPriority(10);
        System.out.println("On increasing priority : "+threadObject);
        System.out.println(threadObject.getState());
        threadObject.interrupt();
        System.out.println(threadObject.getState());

        int x = 5/0; // notice the name of the thread when this exception is thrown2

    }
}
