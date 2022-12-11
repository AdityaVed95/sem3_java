package java_sem3_assignments_OOPM.multithreading_final;



public class Launcher
{
    public static void main(String[] args)
    {
        new RandomGenerator();
        new Square();
        new Cube();
    }
}


/*

upcoming tasks :

the sender should put at its own speed and the reciever can recieve at its own speed
creating two maps : even and odd
square thread checks the even map
cube thread checks the odd map

so sender may put many numbers at a time in the map ,
check the number 1st : if it is even then put number in even map or put it in odd map


when the turn of square thread comes : it will take all the numbers in the even map : print it and finish

similaryly cube thread will do same with odd map

when the square thread is taking all the numbers from the even map then that block in which it takes :
that block is synchronised(Resource.evenMap) so that in between while executing the square thread ,
 if randomeGenerate thread gets schduled then randomeGenerate thread cannot modify the contents
 of even map but it can modify contents of odd map
 when the synchronised block of square thread ends : after that randomeGenerate thread
 can modify contents of even map

 similarly for the case of cube thread

 advantage of this set up is that it is truly efficient parallel processing system
 using vectors in previous case makes it parallel processing but not efficient since resource is only 1
 if there are 2 resources then it can improve the performance of the system which is the case if
 we use two maps even and odd
 all threads dont have to be dependant on the execution of a single slowest thread



suppose if we make the example working using a vector (when one no is put and then other no is
removed and next no is not put untill the 1st no is removed), then the problem is that
say randomeGenerate and cube thread are sleeping very less outside the synchronised block
but the square is sleeping a lot outside the synchronised block

then when the vector contains an even element and if the square thread is sleeping then meanwhile
randomeGenerate thread will lock the access to vector and see that vector is not
empty(current value has not been removed)
thus randomeGenerate thread will sleep for short time

meanwhile cube thread will lock the access to vector and see that vector has an element
then it will check if it is odd , since it is not odd, it will come out of synchronised block and then
randomeGenerate thread will check again and this will go on and on untill the square threads gets up and
locks the vector then check if it has element then check if it is even , yes it is and then remove it

thus here the slowest thread actually slowed down the performance of the entire system
such a design of system should be avoided

there is no point in slowing down the threads that can work faster....
so we create a structure that each thread can work on their own speed and no thread
 should effectively slow down the system


mean while



 note :
 never use Thread.sleep() mehtod inside a synchronised block : its idiotic to this
 its like you have already hung up to a resource and now you are sleeping and thus not
  allowing other to acess that resource which is not a good practice







 */