package DnD1.Entities.Players;

import java.io.Console;

import DnD1.Entities.Entity;
import DnD1.Classes.*;
import DnD1.Races.*;
import DnD1.Historics.*;

public class Player extends Entity
{
    //attributes
    private int gold;
    private int experience;
    private int experienceCap;

    //Getters setters
    public int getGold()
    {
        return this.gold;
    }
    public void setGold(int gold)
    {
        this.gold = gold;
    }

    public int getExperience()
    {
        return this.experience;
    }
    public void setExperience(int experience)
    {
        this.experience = experience;
        refreshLevel();
    }

    public int getExperienceCap()
    {
        return this.experienceCap;
    }
    public void setExperienceCap(int experienceCap)
    {
        this.experienceCap = experienceCap;
    }

    //methodes
    public void addExperience(int experience)
    {
        this.experience += experience;
        refreshLevel();
    }

    public void refreshLevel()
    {
        //1
        if(this.experience < 300)
        {
            this.setLevel(1);
            this.setExperienceCap(300); 
        }
        //2
        if(this.experience >= 300 && this.experience < 900)
        {
            this.setLevel(2);
            this.setExperienceCap(900); 
        }
        //3
        if(this.experience >= 900 && this.experience < 2700)
        {
            this.setLevel(3);
            this.setExperienceCap(2700); 
        }
        //4
        if(this.experience >= 2700 && this.experience < 6500)
        {
            this.setLevel(4);
            this.setExperienceCap(6500); 
        }
        //5
        if(this.experience >= 6500 && this.experience < 14000)
        {
            this.setLevel(5);
            this.setExperienceCap(14000); 
        }
        //6
        if(this.experience >= 14000 && this.experience < 23000)
        {
            this.setLevel(6);
            this.setExperienceCap(23000); 
        }
        //7
        if(this.experience >= 34000 && this.experience < 34000)
        {
            this.setLevel(7);
            this.setExperienceCap(34000); 
        }
        //8
        if(this.experience >= 48000 && this.experience < 48000)
        {
            this.setLevel(8);
            this.setExperienceCap(48000); 
        }
        //9
        if(this.experience >= 48000 && this.experience < 64000)
        {
            this.setLevel(9);
            this.setExperienceCap(64000); 
        }
        //10
        if(this.experience >= 64000 && this.experience < 85000)
        {
            this.setLevel(10);
            this.setExperienceCap(85000); 
        }
        //11
        if(this.experience >= 85000 && this.experience < 100000)
        {
            this.setLevel(11);
            this.setExperienceCap(100000); 
        }
        //12
        if(this.experience >= 100000 && this.experience < 120000)
        {
            this.setLevel(12);
            this.setExperienceCap(120000); 
        }
        //13
        if(this.experience >= 120000 && this.experience < 140000)
        {
            this.setLevel(13);
            this.setExperienceCap(140000); 
        }
        //14
        if(this.experience >= 140000 && this.experience < 165000)
        {
            this.setLevel(14);
            this.setExperienceCap(165000); 
        }
        //15
        if(this.experience >= 165000 && this.experience < 195000)
        {
            this.setLevel(15);
            this.setExperienceCap(195000); 
        }
        //16
        if(this.experience >= 195000 && this.experience < 225000)
        {
            this.setLevel(16);
            this.setExperienceCap(225000); 
        }
        //17
        if(this.experience >= 225000 && this.experience < 265000)
        {
            this.setLevel(17);
            this.setExperienceCap(265000); 
        }
        //18
        if(this.experience >= 265000 && this.experience < 305000)
        {
            this.setLevel(18);
            this.setExperienceCap(305000); 
        }
        //19
        if(this.experience >= 305000 && this.experience < 355000)
        {
            this.setLevel(19);
            this.setExperienceCap(355000); 
        }
        //20
        if(this.experience >= 355000)
        {
            this.setLevel(20);
            this.setExperienceCap(0);
        }
    }

    //Constructor
    public Player(String name, int maxLife, int life, Classe classe, Race race, Historic historic, int gold)
    {
        super(name, maxLife, life, 0, classe, race, historic);
        Console c = System.console();
        while(name.length() > 15 || name == "")
        {
            System.out.print("Your name can't exceed 15 letters !\n\nType your new name : ");
            name = c.readLine();
        }
        this.experience = 0;
        this.gold = gold;
        this.name = name;
        this.refreshLevel();
    }

    //ToString
    @Override
    public String toString()
    {
        String nom = this.getName();  
        String level = "[" + this.getLevel() + "] " + this.getExperience() + "/" + this.getExperienceCap();
        String attributes = "(" + this.getClasse().getClass().getSimpleName() + "/" + this.getRace().getClass().getSimpleName() + "/" + this.getHistoric().getClass().getSimpleName() + ") [" + this.getSize() + "]";
        String life = "Life : " + this.getLife() + "/" + this.getMaxLife();
        String gold = "Gold : " + this.getGold();
        return String.format("%-16s%-25s\n%-5s\n%-15s\n%-15s", nom, attributes, level, life, gold);
    }

    //main
    public static void main(String[] args)
    {
        Player player = new Player("Luca", 100, 48, new Wizzard(), new Elf(), new Sage(), 1500);
        System.out.println(player);
        player.addExperience(1500);
        System.out.println(player);
        player.addExperience(150000);
        System.out.println(player);
        player.addExperience(3000000);
        System.out.println(player);
    }
}