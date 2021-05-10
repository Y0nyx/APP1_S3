package ingredients;
/**
 * Legume d'ingredients
 * @author Charles Veillette
 * @version 1.0
 */

public class Legume extends Ingredients{
    /**
     * Constructeur de legume
     */
    public Legume() {
        setTypeIngredient(TypeIngredient.LEGUME);
    }

    /**
     * Constructeur overload de legume
     * @param nom
     * @param description
     * @param typeIngredient
     */
    public Legume(String nom,String description,TypeIngredient typeIngredient){
        setTypeIngredient(TypeIngredient.LEGUME);
        setNom(nom);
        setDescription(description);
    }
}

