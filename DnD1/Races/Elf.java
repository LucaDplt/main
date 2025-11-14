package DnD1.Races;

import DnD1.Entities.Size;

public class Elf extends Race
{
    //Construcotr
    public Elf()
    {
        super("Elves are graceful, intelligent, and deeply connected to nature. They have long lifespans and excel in both magic and archery.", Size.M, 0, 2, 0, 1, 1, 2);
    }

    //Main
    public static void main(String[] args)
    {
        Elf elf = new Elf();
        System.out.println(elf);
    }
}
