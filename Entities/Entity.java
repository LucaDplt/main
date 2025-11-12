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
