package DnD1.Personnages.Joueurs;

public enum Historic
{
    //Enum
    Acolyte("Tu es animé par une foi profonde et une discipline spirituelle. Ta sagesse et ton calme inspirent le respect, même dans les moments les plus sombres."),
    Criminel("Tu es rusé, agile et toujours trois coups d’avance. Ton instinct affûté te permet de survivre là où d’autres échouent."),
    Artiste("Tu possèdes une créativité flamboyante et un charisme naturel. Ton art captive, émeut et influence ceux qui t’écoutent ou te regardent."),
    Sage("Ton esprit est affûté comme une lame. Tu maîtrises les savoirs anciens, les langues oubliées et les secrets que même les mages redoutent."),
    Soldat("Tu es un roc en pleine tempête. Courageux, discipliné et stratégique, tu inspires confiance sur le champ de bataille et ne recules jamais devant l’adversité.");

    //Attributes
    private final String description;

    //constructors
    private Historic(String description)
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
        Historic historique = Historic.Acolyte;
        System.out.println(historique);
    }
}
