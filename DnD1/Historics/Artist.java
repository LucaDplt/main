package DnD1.Historics;

public class Artist extends Historic
{
    //Constructor
    public Artist()
    {
        super("You have a vibrant creativity and a natural charisma. Your art captivates, moves, and leaves a lasting impression on everyone who experiences it.");
    }

    //main
    public static void main(String[] args)
    {
        Artist artist = new Artist();
        System.out.println(artist);
    }
}
