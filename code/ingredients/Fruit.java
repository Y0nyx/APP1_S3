package ingredients;
/**
 * Fruit d'ingredients
 * @author Charles Veillette
 * @version 1.0
 */
public class Fruit extends Ingredients{
    private String nom;
    private String description;
    private TypeIngredient typeIngredient;

    /**
     * Constructeur de Fruit
     */
    public Fruit() {
        setTypeIngredient(TypeIngredient.FRUIT);
    }

    /**
     * Constructeur overload de Fruit
     * @param nom
     * @param description
     * @param typeIngredient
     */
    public Fruit(String nom,String description,TypeIngredient typeIngredient){
        setTypeIngredient(TypeIngredient.FRUIT);
        setNom(nom);
        setDescription(description);
    }
}

