package DnD1.Personnages.Players;

public enum Race
{
    //Enum
    Elf("Les elfes sont gracieux, intelligents et proches de la nature. Ils vivent longtemps et excellent dans la magie et l’archerie."),
    Nain("Les nains sont robustes, travailleurs et fiers. Maîtres artisans et guerriers endurants, ils vivent souvent sous terre."),
    Halfelin("Petits et discrets, les halfelins sont joyeux, débrouillards et incroyablement chanceux. Ils préfèrent la tranquillité à l’aventure, mais savent s’en sortir dans les pires situations."),
    Humain("Les humains sont polyvalents, ambitieux et adaptables. Leur diversité et leur curiosité les rendent capables de tout accomplir.");

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
