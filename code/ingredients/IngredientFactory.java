package ingredients;

public class IngredientFactory {
    public IngredientFactory(){}

    public Ingredient buildIngredient(String nom, String description, TypeIngredient typeIngredient ){
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
