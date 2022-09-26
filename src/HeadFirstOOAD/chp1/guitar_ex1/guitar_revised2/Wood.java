package HeadFirstOOAD.chp1.guitar_ex1.guitar_revised2;

public enum Wood
{
    INDIAN_ROSEWOOD,
    BRAZALIAN_ROSEWOOD,
    MAHOGANY,
    MAPLE,
    COCOBOLO,
    CEDAR,
    ALDER,
    SITKA,
    ADIRONDACK;

    public String toString()
    {
        switch (this)
        {
            case INDIAN_ROSEWOOD : return "INDIAN_ROSEWOOD";
            case BRAZALIAN_ROSEWOOD : return "BRAZALIAN_ROSEWOOD";
            default: return "DEFAULT_";
        }
    }
}
