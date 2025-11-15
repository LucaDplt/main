package DnD1.Historics;

public class Acolyte extends Historic
{
    //Constructor
    public Acolyte()
    {
        super("You are guided by unwavering faith and inner strength. Your serenity and insight command respect, even in the darkest of times.");
    }

    //main
    public static void main(String[] args)
    {
        Acolyte acolyte = new Acolyte();
        System.out.println(acolyte);
    }
}
