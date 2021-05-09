package ingredients;

public class Viande extends Ingredients{
    public Viande() {
        setTypeIngredient(TypeIngredient.VIANDE);
    }

    public Viande(String nom,String description,TypeIngredient typeIngredient){
        setTypeIngredient(TypeIngredient.VIANDE);
        setNom(nom);
        setDescription(description);
    }

}

