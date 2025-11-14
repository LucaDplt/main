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
        String strengthToString = "";
        String dexterityToString = "";
        String constitutionToString = "";
        String intelligenceToString = "";
        String wisdomToString = "";
        String charismaToString = "";

        if(this.getBonusStrength() < 0)
        {
            strengthToString = String.format("%-1i",this.getBonusStrength());
        }
        if(this.getBonusStrength() >= 0)
        {
            strengthToString = "+" + this.getBonusStrength();
        }

        if(this.getBonusDexterity() < 0)
        {
            strengthToString = String.format("%-1i",this.getBonusDexterity());
        }
        if(this.getBonusDexterity() >= 0)
        {
            strengthToString = "+" + this.getBonusDexterity();
        }

        if(this.getBonusConstitution() < 0)
        {
            strengthToString = String.format("%-1i",this.getBonusConstitution());
        }
        if(this.getBonusConstitution() >= 0)
        {
            strengthToString = "+" + this.getBonusConstitution();
        }

        if(this.getBonusIntelligence() < 0)
        {
            strengthToString = String.format("%-1i",this.getBonusIntelligence());
        }
        if(this.getBonusIntelligence() >= 0)
        {
            strengthToString = "+" + this.getBonusIntelligence();
        }

        if(this.getBonusWisdom() < 0)
        {
            strengthToString = String.format("%-1i",this.getBonusWisdom());
        }
        if(this.getBonusWisdom() >= 0)
        {
            strengthToString = "+" + this.getBonusWisdom();
        }

        if(this.getBonusCharisma() < 0)
        {
            strengthToString = String.format("%-1i",this.getBonusCharisma());
        }
        if(this.getBonusCharisma() >= 0)
        {
            strengthToString = "+" + this.getBonusCharisma();
        }

        return this.getClass().getSimpleName() + "(" + this.getSize() + ") :\n - STR : " + strengthToString + "\n - DEX : " + dexterityToString + "\n - CON : " + constitutionToString + "\n - INT : " + intelligenceToString + "\n - WIS : " + wisdomToString + "\n - CHA : " + charismaToString;
    }
}
