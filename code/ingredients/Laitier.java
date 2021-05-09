package ingredients;

public class Laitier extends Ingredients{

    public Laitier() {
        setTypeIngredient(TypeIngredient.LAITIER);
    }

    public Laitier(String nom,String description,TypeIngredient typeIngredient){
        setTypeIngredient(TypeIngredient.LAITIER);
        setNom(nom);
        setDescription(description);
    }
}

