package ProgrammingInJavaOxford.understanding_enums.eg2;

// creating descriptions for each enum value
// Defining an Enumerated Type with Attributes and Methods
// description is an attribute and getDescription is a method


public enum GamePlayer
{
    CRICKET("Sachin"),
    CHESS("Vishwanathan"),
    TENNIS("Sania");

    private String description;
    private GamePlayer(String description)
    {
        this.description = description;
    }

    // Note The constructor for an enumerated type should be private
    // to prevent it from being invoked directly.

    public String getDescription()
    {
        return description;
    }

}


