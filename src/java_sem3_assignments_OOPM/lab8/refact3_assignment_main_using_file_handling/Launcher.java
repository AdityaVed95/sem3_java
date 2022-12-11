package java_sem3_assignments_OOPM.lab8.refact3_assignment_main_using_file_handling;

public class Launcher
{
    public static void main(String[] args) {
        new RandomGenerator();
//        new Reader();
        new Square();
        new Cube();
    }
}

    // this program is about asynchronous communication between the square and cube threads
    // the real world is asynchronous
    // we think that the square and cube threads are reading the file simultaneously
    // but if the threads are of the same process and sharing the same shared resource
    // managed by the os then os will put a lock on that resource when one of them is
    // accessing it. although that lock will be for a very short period of time (thus
    // this would become synchronous communication between square and cube threads at
    // that given point of time).
    //

    // but here we are assuming that the consumer is consuming at the same rate as the producer
    // is producing it , but this is not true in the real world. now in our example is producer
    // is producing faster than consumer can take and the producer is constantly overwriting the
    // file then there will be a data loss as the consumer wont be able to read at the speed
    // the producer is giving

    // this is why we use queue , the producer can put the produced numbers in the queue (enqueue the queue)
    // the consumer will take a number from que and then deque that queue.
    // put the things is that multiple threads cannot access the que at the same time.
    // since square or cube thread might deque the que but both will be reading at the same time
    // and then one of them will deque it at the same time.
    // while dequing only one thread will lock the resource and dequeue it.

    // try :
    // two threads writing to the file at the same time

    // read operation is non mutating : wont change the state of the file.
    // write operation is mutating : it will change the state of the file.


