package ingredients;

public class Fruit extends Ingredients{
    private String nom;
    private String description;
    private TypeIngredient typeIngredient;

    public Fruit() {
        setTypeIngredient(TypeIngredient.FRUIT);
    }

    public Fruit(String nom,String description,TypeIngredient typeIngredient){
        setTypeIngredient(TypeIngredient.FRUIT);
        setNom(nom);
        setDescription(description);
    }
}

