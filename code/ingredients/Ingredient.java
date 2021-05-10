package ingredients;
/**
 * Interface d'Ingredient
 * @author Charles Veillette
 * @version 1.0
 */
interface Ingredient{
    /**
     * get le nom
     * @return String nom
     */
    public String getNom();

    /**
     * set le nom
     * @param nom
     */
    public void setNom(String nom);

    /**
     * get la description
     * @return String description
     */
    public String getDescription();

    /**
     * set la description
     * @param description
     */
    public void setDescription(String description);

    /**
     * get le type d'ingredient
     * @return TypeIngredient typeIngredient
     */
    public TypeIngredient getTypeIngredient();

    /**
     * set le type d'ingredient
     * @param typeIngredient
     */
    public void setTypeIngredient(TypeIngredient typeIngredient);

}

