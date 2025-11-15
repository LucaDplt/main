package DnD1.Historics;

public class Soldier extends Historic
{
    //Constructor
    public Soldier()
    {
        super("You are a rock in the heart of the storm. Courageous, disciplined, and strategic, you inspire confidence on the battlefield and never falter in the face of adversity.");
    }

    //main
    public static void main(String[] args)
    {
        Soldier soldier = new Soldier();
        System.out.println(soldier);
    }
}
