package ingredients;
/**
 * Epice d'ingredients
 * @author Charles Veillette
 * @version 1.0
 */
public class Epice extends Ingredients{
    /**
     * Constructeur d'Epice
     */
    public Epice() {
        setTypeIngredient(TypeIngredient.EPICE);
    }

    /**
     * Constructeur overload d'Epice
     * @param nom
     * @param description
     * @param typeIngredient
     */
    public Epice(String nom,String description,TypeIngredient typeIngredient){
        setTypeIngredient(TypeIngredient.EPICE);
        setNom(nom);
        setDescription(description);
    }
}
