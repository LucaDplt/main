package DnD1.Personnages.Players;

public enum Classe
{
    //Enum
    Barde("Artiste et aventurier polyvalent, le barde manie la magie à travers la musique, la parole ou la poésie. Il inspire ses alliés, charme ses ennemis et s’adapte à toutes les situations grâce à son savoir encyclopédique et son charisme exceptionnel."),
    Clerc("Serviteur dévoué d’une divinité, le clerc canalise l’énergie divine pour soigner, protéger ou punir au nom de sa foi. C’est un pilier du groupe, capable de lancer de puissants sorts sacrés tout en se battant honorablement au corps à corps."),
    Guerrier("Maître des armes et du combat, le guerrier excelle dans la force brute, la stratégie et l’endurance. Il peut manier presque toutes les armes et armures, et s’adapte à tous les styles de combat — du tank solide à l’archer agile."),
    Roublard("Rapide, rusé et discret, le roublard privilégie la finesse et la ruse à la force. Expert en furtivité, en crochetage et en attaques précises, il frappe là où ça fait mal et reste rarement là quand les choses tournent mal."),
    Magicien("Érudit de la magie arcanique, le magicien puise son pouvoir dans l’étude et la connaissance. Faible physiquement mais redoutable en puissance mystique, il peut lancer des sorts capables de bouleverser la réalité… s’il survit jusque-là.");

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
        Classe classe = Classe.Barde;
        System.out.println(classe);
    }
}