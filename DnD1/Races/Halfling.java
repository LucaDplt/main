package DnD1.Races;

import DnD1.Entities.Size;

public class Halfling extends Race
{
    //Constructor
    public Halfling()
    {
        super("Small and discreet, halflings are cheerful, resourceful, and remarkably lucky. They prefer peace and quiet to adventure but can handle even the toughest situations.",Size.S , 0, 2, 1, 0, 0, 1);
    }

    //Main
    public static void main(String[] args)
    {
        Halfling halfling = new Halfling();
        System.out.println(halfling);
    }
}
