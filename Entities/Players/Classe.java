package DnD1.Entities.Players;

public enum Classe
{
    //Enum
    Bard("A versatile artist and adventurer, the bard channels magic through music, words, and poetry. They inspire allies, charm foes, and adapt to any situation with their vast knowledge and remarkable charisma."),
    Cleric("A devoted servant of a deity, the cleric channels divine energy to heal, protect, or punish in the name of their faith. A cornerstone of any group, they can cast powerful sacred spells while fighting honorably in close combat."),
    Warrior("A master of weapons and combat, the warrior excels in raw strength, strategy, and endurance. They can wield nearly any weapon or armor and adapt to any fighting style, from a sturdy tank to a nimble archer."),
    Rogue("Fast, clever, and stealthy, the rogue relies on skill and cunning rather than brute strength. An expert in stealth, lockpicking, and precise strikes, they hit where it hurts and are rarely around when trouble arises."),
    Wizzard("A scholar of arcane magic, the wizard draws their power from study and knowledge. Physically weak but formidable in mystical strength, they can cast spells that can alter reality, if they survive long enough.");

    //Atributes
    private final String description;

    //Constructors
    private Classe(String description)
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
        Classe classe = Classe.Bard;
        System.out.println(classe);
    }
}