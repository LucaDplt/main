package DnD1.Races;

import DnD1.Entities.Size;

public class Dwarf extends Race
{
    //Constructor
    public Dwarf()
    {
        super("Dwarves are sturdy, hardworking, and proud. Skilled craftsmen and resilient warriors, they often make their homes underground.", Size.S, 2, 0, 2, 0, 1, 0);
    }

    //Main
    public static void main(String[] args)
    {
        Dwarf dwarf = new Dwarf();
        System.out.println(dwarf);
    }
}
