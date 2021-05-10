package ingredients;
/**
 * Laitier d'ingredients
 * @author Charles Veillette
 * @version 1.0
 */

public class Laitier extends Ingredients{
    /**
     * Constructeur de laitier
     */
    public Laitier() {
        setTypeIngredient(TypeIngredient.LAITIER);
    }

    /**
     * Constructeur overload de laitier
     * @param nom
     * @param description
     * @param typeIngredient
     */
    public Laitier(String nom,String description,TypeIngredient typeIngredient){
        setTypeIngredient(TypeIngredient.LAITIER);
        setNom(nom);
        setDescription(description);
    }
}

