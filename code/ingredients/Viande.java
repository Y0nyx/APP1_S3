package ingredients;
/**
 * Viande d'ingredients
 * @author Charles Veillette
 * @version 1.0
 */

public class Viande extends Ingredients{
    /**
     * Constructeur de viande
     */
    public Viande() {
        setTypeIngredient(TypeIngredient.VIANDE);
    }

    /**
     * Constructeur overload de viande
     * @param nom
     * @param description
     * @param typeIngredient
     */
    public Viande(String nom,String description,TypeIngredient typeIngredient){
        setTypeIngredient(TypeIngredient.VIANDE);
        setNom(nom);
        setDescription(description);
    }

}

