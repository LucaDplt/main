package DnD1.Races;

import DnD1.Entities.Size;

public class Race
{
    //Atributes
    private final String description;
    private Size size;
    private int bonusStrength;
    private int bonusDexterity;
    private int bonusConstitution;
    private int bonusIntelligence;
    private int bonusWisdom;
    private int bonusCharisma;

    //Constructors
    public Race(String description, Size size, int bonusStrength, int bonusDexterity, int bonusConstitution, int bonusIntelligence, int bonusWisdom, int bonusCharisma)
    {
        this.description = description;
        this.size = size;
        this.bonusStrength = bonusStrength;
        this.bonusDexterity = bonusDexterity;
        this.bonusConstitution = bonusConstitution;
        this.bonusIntelligence = bonusIntelligence;
        this.bonusWisdom = bonusWisdom;
        this.bonusCharisma = bonusCharisma;
    }

    //Getters setters
    public String getDescription()
    {
        return this.description;
    }

    public Size getSize()
    {
        return this.size;
    }

    public int getBonusStrength()
    {
        return this.bonusStrength;
    }

    public int getBonusDexterity()
    {
        return this.bonusDexterity;
    }

    public int getBonusConstitution()
    {
        return this.bonusConstitution;
    }

    public int getBonusIntelligence()
    {
        return this.bonusIntelligence;
    }

    public int getBonusWisdom()
    {
        return this.bonusWisdom;
    }

    public int getBonusCharisma()
    {
        return this.bonusCharisma;
    }

    //ToString
    @Override
    public String toString()
    {
        return this.getClass().getSimpleName() + "(" + this.getSize() + ") :\n - STR : " + this.bonusStrength + "\n - DEX : " + this.bonusDexterity + "\n - CON : " + this.bonusConstitution + "\n - INT : " + this.bonusIntelligence + "\n - WIS : " + this.bonusWisdom + "\n - CHA : " + this.bonusCharisma;
    }

    //Main
    public static void main(String[] args)
    {
        Dwarf dwarf = new Dwarf();
        Elf elf = new Elf();
        Halfling halfling = new Halfling();
        Human human = new Human();
        System.out.println(dwarf);
        System.out.println(elf);
        System.out.println(halfling);
        System.out.println(human);
    }
}
