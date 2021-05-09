package ingredients;

public class Legume extends Ingredients{

    public Legume() {
        setTypeIngredient(TypeIngredient.LEGUME);
    }

    public Legume(String nom,String description,TypeIngredient typeIngredient){
        setTypeIngredient(TypeIngredient.LEGUME);
        setNom(nom);
        setDescription(description);
    }
}

