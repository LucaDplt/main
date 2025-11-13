package DnD1.Entities;

import DnD1.Entities.Players.*;

public abstract class Entity
{
    //Attributes
    protected String name;
    private int life;
    private int maxLife;
    private int level;
    private Classe classe;
    private Race race;
    private Historic historic;
    private int strength = 0;
    private int dexterity = 0;
    private int constitution = 0;
    private int intelligence = 0;
    private int wisdom = 0;
    private int charisma = 0;
    
    //Getters setters
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public int getLife()
    {
        return this.life;
    }
    public void setLife(int life)
    {
        this.life = life;
    }

    public int getMaxLife()
    {
        return this.maxLife;
    }
    public void setMaxLife(int maxLife)
    {
        this.maxLife = maxLife;
    }

    public int getLevel()
    {
        return this.level;
    }
    public void setLevel(int level)
    {
        this.level = level;
    }

    public Classe getClasse()
    {
        return this.classe;
    }

    public Race getRace()
    {
        return this.race;
    }

    public Historic getHistoric()
    {
        return this.historic;
    }

    public int getStregnth()
    {
        return this.strength;
    }
    public void setStrength(int strength)
    {
        this.strength = strength;
    }

    public int getDexterity()
    {
        return this.dexterity;
    }
    public void setDexterity(int dexterity)
    {
        this.dexterity = dexterity;
    }

    public int getConstitution()
    {
        return this.constitution;
    }
    public void setConstitution(int constitution)
    {
        this.constitution = constitution;
    }

    public int getIntelligence()
    {
        return this.intelligence;
    }
    public void setIntelligence(int intelligence)
    {
        this.intelligence = intelligence;
    }

    public int getWisdom()
    {
        return this.wisdom;
    }
    public void setWisdom(int wisdom)
    {
        this.wisdom = wisdom;
    }

    public int getCharisma()
    {
        return this.charisma;
    }
    public void setCharisma(int charisma)
    {
        this.charisma = charisma;
    }

    //Constructor
     public Entity(int maxLife, int life, int level, Classe classe, Race race, Historic historic)
    {
        this.maxLife = maxLife;
        this.life = life;
        this.level = level;
        this.classe = classe;
        this.race = race;
        this.historic = historic;
    }

    //ToString
    @Override
    public abstract String toString();
}
