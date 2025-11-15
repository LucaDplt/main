package DnD1.Historics;

public class Criminal extends Historic
{
    //Constructor
    public Criminal()
    {
        super("You are cunning, agile, and always three steps ahead. Your sharp instincts let you survive where others fall.");
    }

    //main
    public static void main(String[] args)
    {
        Criminal criminal = new Criminal();
        System.out.println(criminal);
    }
}
