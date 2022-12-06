package java_sem3_assignments_OOPM.lab6;

public class Room
{
    int roomNumber;
    boolean bookedStatus; // true for booked , false for vacant

    public Room(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public void bookRoom(Room room)
    {
        room.bookedStatus = true;
    }

    public void vacateRoom(Room room)
    {
        room.bookedStatus = false;
    }

    public int getRoomNumber()
    {
        return roomNumber;
    }

    public boolean isBookedStatus()
    {
        return bookedStatus;
    }
}
