package DnD1.Entities.Players;

public enum Race
{
    //Enum
    Elf("Elves are graceful, intelligent, and deeply connected to nature. They have long lifespans and excel in both magic and archery."),
    Dwarf("Dwarves are sturdy, hardworking, and proud. Skilled craftsmen and resilient warriors, they often make their homes underground."),
    Halfling("Small and discreet, halflings are cheerful, resourceful, and remarkably lucky. They prefer peace and quiet to adventure but can handle even the toughest situations."),
    Human("Humans are versatile, ambitious, and adaptable. Their diversity and curiosity enable them to achieve anything they set their minds to.");

    //Attributes
    private final String description;

    //Constructors
    private Race(String description)
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
        Race race = Race.Elf;
        System.out.println(race);
    }
}
