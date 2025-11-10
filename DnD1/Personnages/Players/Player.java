package DnD1.Personnages.Players;

public class Player
{
    //Attributes
    private int life;
    private int level;
    private Classe classe;
    private Race race;
    private Historic historic;

    //Getters setters
    public int getLife()
    {
        return this.life;
    }
    public void setLife(int life)
    {
        this.life = life;
    }

    public int getNiveau()
    {
        return this.level;
    }
    public void setNiveau(int level)
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
}