package java_sem3_assignments_OOPM.lab8.assignment_main_using_vectors;

public class Square implements Runnable
{
    public Square()
    {
        new Thread(this,"sq").start();
    }

    @Override
    public void run()
    {
        while(true)
        {
            if(Resource.is_full == 1)
            {
                int num = Resource.vector1.get(0);
                if (num % 2 == 0)
                {
                    System.out.println("Even number found : " + num);
                    System.out.println("square is : " + num * num +"\n\n");
                    Resource.vector1.remove(0);
                    Resource.is_full = 0;
                }
                sleep();

            }


            else
            {
                sleep();
            }

                // this is necessary to do because if we dont do this then this
                // thread will not sleep and will continue to have control over the program
                // and it will continue to check if the resource is empty , thus if it doesnt
                // allow other threads to access the vector and thus other threads are not able
                // to check if the value in vector is even or odd and do the removal of item from
                // vector accordingly


            }


        }



    static void sleep()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


// need for synchronisation is that we dont know which thread works faster if all
// threads dont have the sleep method
// even if we create thread1 before thread2  , it is possible that the start method
// of thread2 might get executed 1st
// due to this uncertainty : we have introduced the concept of thread synchronisation
// so that only 1 thread can access a resource (say a vector or a method or a set of statements)
// at a given point in time

// the property of vectors is that they are synchronised : that is only 1 thread can access the
// thread at a time
// but this property never states in which order the threads will access the vector
// the order may not necessarily be the same order in which you have written in your code

/*
    thus if we create a thread1 to add an element to the vector and another thread2 to remove
    the element from that same vector then although you might call the start method of
    thread1 before thread2 but it is not necessary that the threads will be executed in that order

    the sole meaning of threads is that they have to work simultaneously

    thus if the start method of thread2 gets called 1st then it will show an error that we
    cannot delete an element from the empty vector.

    thus although vectors are synchronised : the order in which the threads access is them
    is not under our control

    this is why we have to create mechanisms to make sure that only one thread is
    accessing a resource at a time




    this is why if we are accessing the vector



 */
