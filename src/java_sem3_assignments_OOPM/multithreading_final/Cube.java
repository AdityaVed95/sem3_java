package java_sem3_assignments_OOPM.multithreading_final;


public class Cube  implements Runnable
{
    public Cube()
    {
        new Thread(this,"cu").start();
    }

    @Override
    public void run()
    {
        while(true)
        {
            synchronized (Resource.vector1) // in this block we are making
            // sure that if the vector1 is blocked by this block then other thread cannot modify vector1

            // this acutally solves our problem :
            // the problem was that although vectors are synchronised : meaning one thread can
            // access that vector at a time , the problem is that we cannot decide which thread
            // is locking it and using it at that time
            /*
                thus now we create a synchronised block,
             */

            {
                if(Resource.is_full == 1)
                {
                    int num = Resource.vector1.get(0);
                    if(num % 2 != 0)
                    {

                        System.out.println("Odd number found : "+num);
                        System.out.println("Cube is : "+num*num*num+"\n\n");
                        Resource.vector1.remove(0);
                        // it is not necessary that the below line will get executed just after
                        // the above line
                        /*
                            it can happen that the above line gets executed and then the scheduler
                            schedules another thread's execution ,
                            but os will make sure that another thread will not work on the vector1 :
                            why will os make sure this ?
                            because we have put this block inside : synchronized (Resource.vector1)
                            since the block is synchronised , thus no other thread can work on vector1
                            since os has locked that resource
                            thus when the os schedules this thread again then this thread can
                            continue its execution and then come out of the sychronised block
                            after coming out of the synchronised block if os schedules another
                            thread then that thread can similarly access and lock the vector
                            thus preventing other threads from accessing the vector



                            now if we wouldnt have kept this block of code
                            inside : synchronized (Resource.vector1)

                            then it may happen that the above line might get executed and then
                            os schedules another thread and that thread can access the vector
                            thus in this case : the element is removed from the vector but the
                            is_full status is not made 0, thus is_full = 1
                            now if the Square thread is scheduled then it will check that the is_full = 0
                            thus it will go inside the block and try this :
                            int num = Resource.vector1.get(0);
                            this will cause an exception..

                            to prevent such exceptions to occur, we put a lock on the resource itself :
                            synchronized (Resource.vector1)

                            thus when we dont put lock then this block : if(Resource.is_full == 1){  }
                            is not atomic

                            concept of atomicity of block

                            if above line executes and after that below line executes ,
                            between those 2 lines if os schedules another thread then that thread
                            cannot access the resource that has been synchronised
                            this is called atomicity of block

                            the block is atomic : it cannot be broken into more pieces

                            whereas if we do not put the if(Resource.is_full == 1){  } block in
                            synchronised block then the if(Resource.is_full == 1) block is not atomic
                            which means that another thread can be scheduled between any two lines of
                            this block and can access a resource that was getting accessed by this
                            thread, this is not good since the current thread has not completed its operation on
                            the current vector and the new thread is also trying to work on the same thread

                         */
                        Resource.is_full = 0;
                    }
                    sleep();
                }

                else
                {
                    sleep();
                }

            }




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
