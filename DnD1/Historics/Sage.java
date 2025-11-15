package DnD1.Historics;

public class Sage extends Historic
{
    //Constructor
    public Sage()
    {
        super("Your mind is as sharp as a blade. You command ancient knowledge, forgotten tongues, and secrets even the mages fear.");
    }
    
    //main
    public static void main(String[] args)
    {
        Sage sage = new Sage();
        System.out.println(sage);
    }
}
