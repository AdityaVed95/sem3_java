package test_concepts.collection_frameworks.q2;

public class Student
{
    int rollno;
    String name;

    public Student(int rollno, String name)
    {
        this.rollno = rollno;
        this.name = name;
    }

    // Object is the base class
    // Student is the derived class
    // every class by default extends the Object class
    // thus if we define the toString() method in Student class then
    // we are doing
    // method overriding, thus the toString method inside the String class
    // will not be called

    public String toString()
    {
        return this.rollno+" : "+this.name;
    }

}
