package ingredients;

/**
 * Classe ingredients d'ingredients
 * @author Charles Veillette
 * @version 1.0
 */

public class Ingredients implements Ingredient{
    private String nom;
    private String description;
    private TypeIngredient typeIngredient;

    /**
     * Constructeur d'Ingredients
     */
    public Ingredients() {
    }

    /**
     * Constructeur overload d'Ingredients
     * @param nom
     * @param description
     * @param typeIngredient
     */
    public Ingredients(String nom,String description,TypeIngredient typeIngredient){
        this.typeIngredient = typeIngredient;
        setNom(nom);
        setDescription(description);
    }

    /**
     * get le nom
     * @return String nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * set le nom
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * get la descrition
     * @return String description
     */
    public String getDescription() {
        return description;
    }

    /**
     * set la description
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get le type d'ingredient
     * @return TypeIngredient typeIngredient
     */
    public TypeIngredient getTypeIngredient() {
        return typeIngredient;
    }

    /**
     * set le Type d'ingredient
     * @param typeIngredient
     */
    public void setTypeIngredient(TypeIngredient typeIngredient){
        this.typeIngredient = typeIngredient;
    }

    /**
     * Overload de la methode toString
     * @return String string
     */
    public String toString(){
        return "ingredients.Ingredients{" +
                "nom=" + getNom() +
                ", description='" + getDescription() + '\'' +
                ", Type=" + getTypeIngredient() +
                "}";+
    }
}
