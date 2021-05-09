package ingredients;

public class Epice extends Ingredients{
    public Epice() {
        setTypeIngredient(TypeIngredient.EPICE);
    }

    public Epice(String nom,String description,TypeIngredient typeIngredient){
        setTypeIngredient(TypeIngredient.EPICE);
        setNom(nom);
        setDescription(description);
    }
}
