package DnD1.Historics;

public class Historic
{
    //Attributes
    private String description;

    //constructors
    public Historic(String description)
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
        return this.getClass().getSimpleName() + " :\n" + this.getDescription();
    }

    //Main
    public static void main(String[] args)
    {
        Acolyte acolyte = new Acolyte();
        System.out.println(acolyte);
    }
}
