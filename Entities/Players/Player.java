package DnD1.Entities.Players;

import java.io.Console;

import DnD1.Entities.Entity;
import DnD1.Classes.*;
import DnD1.Races.*;

public class Player extends Entity
{
    //attributes
    private int gold;

    //Getters setters
    public int getGold()
    {
        return this.gold;
    }
    public void setGold(int gold)
    {
        this.gold = gold;
    }

    //methodes

    //Constructor
    public Player(String name, int maxLife, int life, int level, Classe classe, Race race, Historic historic, int gold)
    {
        super(maxLife, life, level, classe, race, historic);
        Console c = System.console();
        while(name.length() > 15 || name == "")
        {
            System.out.print("Your name can't exceed 15 letters !\n\nType your new name : ");
            name = c.readLine();
        }
        this.gold = gold;
        this.name = name;
    }

    //ToString
    @Override
    public String toString()
    {
        String nom = this.getName();
        String level = "[" + this.getLevel() + "]";
        String attributes = "(" + this.getClasse().getClass().getSimpleName() + "/" + this.getRace().getClass().getSimpleName() + "/" + this.getHistoric().name() + ")";
        String life = "Life : " + this.getLife() + "/" + this.getMaxLife();
        String gold = "Gold : " + this.getGold();
        return String.format("%-5s%-16s%-25s\n\t%-15s\n\t%-15s", level, nom, attributes, life, gold);
    }

    //main
    public static void main(String[] args)
    {
        Player player = new Player("Luca", 100, 48, 12, new Wizzard(), new Elf(), Historic.Sage, 1500);
        System.out.println(player);
    }
}