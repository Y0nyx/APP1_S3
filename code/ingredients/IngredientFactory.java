package ingredients;
/**
 * ingredient factory d'ingredients
 * @author Charles Veillette
 * @version 1.0
 */
public class IngredientFactory {
    /**
     * Constructeur d'IngredientFactory
     */
    public IngredientFactory(){}

    /**
     * Builder des ingredients
     * @param nom
     * @param description
     * @param typeIngredient
     * @return Ingredient
     */
    public Ingredients buildIngredient(String nom, String description, TypeIngredient typeIngredient ){
        if(typeIngredient == TypeIngredient.VIANDE)
            return new Viande(nom,description,typeIngredient);
        else if(typeIngredient == TypeIngredient.LEGUME)
            return  new Legume(nom,description,typeIngredient);
        else if(typeIngredient == TypeIngredient.FRUIT)
            return  new Fruit(nom,description,typeIngredient);
        else if(typeIngredient == TypeIngredient.LAITIER)
            return  new Laitier(nom,description,typeIngredient);
        else if(typeIngredient == TypeIngredient.EPICE)
            return  new Epice(nom,description,typeIngredient);

            return null;
    }
}
