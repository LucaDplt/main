package DnD1.Entities.Players;

public enum Historic
{
    //Enum
    Acolyte("You are guided by unwavering faith and inner strength. Your serenity and insight command respect, even in the darkest of times."),
    Criminal("You are cunning, agile, and always three steps ahead. Your sharp instincts let you survive where others fall."),
    Artist("You have a vibrant creativity and a natural charisma. Your art captivates, moves, and leaves a lasting impression on everyone who experiences it."),
    Sage("Your mind is as sharp as a blade. You command ancient knowledge, forgotten tongues, and secrets even the mages fear."),
    Soldier("You are a rock in the heart of the storm. Courageous, disciplined, and strategic, you inspire confidence on the battlefield and never falter in the face of adversity."),
    None("Nothing special... you are just a normal person with a normal life...");

    //Attributes
    private final String description;

    //constructors
    private Historic(String description)
    {
        this.description = description;
    }

    //Getters setters
    public String getDescription()
    {
        return this.description;
    }

    //ToString
    @Override
    public String toString()
    {
        return this.name() + " : " + this.description;
    }

    //Main
    public static void main(String[] args)
    {
        Historic historique = Historic.Acolyte;
        System.out.println(historique);
    }
}
