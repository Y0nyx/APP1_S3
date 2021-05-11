package menufact.plats;

import java.util.ArrayList;
import ingredients.Ingredients;

/**
 * classe Plat au menu
 * @author Charles Veillette
 * @version 1.0
 */

class PlatAuMenu implements Plat{
    private int code;
    private String description;
    private double prix;
    private int courant;
    private ArrayList<Ingredients> ingredient= new ArrayList<Ingredients>();
    private ArrayList<Double> quantite = new ArrayList<Double>();
    private ArrayList<String> unit = new ArrayList<String>();

    /**
     * Constructeur overload de plat au menu
     * @param code
     * @param description
     * @param prix
     */
    public PlatAuMenu(int code, String description, double prix) {
        this.code = code;
        this.description = description;
        this.prix = prix;
    }

    /**
     * Constructeur de plat au menu
     */
    public PlatAuMenu() {}

    /**
     * overload de la methode toString
     * @return
     */
    @Override
    public String toString() {
        return "menufact.plats.PlatAuMenu{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                "}\n";
    }

    /**
     * get le code du plat au menu
     * le code permet d'acceder plus facilement au plat desirer dans le menu
     * @return int code
     */
    public int getCode() {
        return code;
    }

    /**
     * set le code du plat au menu
     * @param code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * get la description du plat au menu
     * @return String description
     */
    public String getDescription() {
        return description;
    }

    /**
     * set la description du plat au menu
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get le prix du plat au menu
     * @return
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Set le prix du plat au menu
     * @param prix
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

    /**
     * Ajoute un ingredient a la recette du plat au menu
     * @param ingredient
     * @param quantite
     * @param unit
     */
    public void ajouterIngredient(Ingredients ingredient, double quantite, String unit) {
        this.ingredient.add(ingredient);
        this.quantite.add(quantite);
        this.unit.add(unit);
    }

    /**
     * View la recette complete d'ingredient
     */
    public void viewRecette(){
        System.out.println("plats.PlatAuMenu{");
        for (int i = 0; i < ingredient.size(); i++) {
            System.out.println("ingredient=" + ingredient.get(i)+
                    ", quantite=" + quantite.get(i) +
                    ", unit=" + unit.get(i));
        }
        System.out.println('}');
    }

    /**
     * get la recette du plat au menu
     * @return ArrayList<Ingredients> ingredient
     */
    public ArrayList<Ingredients> getIngredients(){
        return ingredient;
    }

    /**
     * get la liste de quantite d'ingredients
     * @return ArrayList<Double> quantite;
     */
    public ArrayList<Double> getQuantite(){
        return quantite;
    }
}
