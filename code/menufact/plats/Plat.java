package menufact.plats;

import ingredients.Ingredients;
import java.util.ArrayList;
/**
 * interface plat
 * Permet de faire le lien entre les plats et la factory
 * @author Charles Veillette
 * @version 1.0
 */

public interface Plat{

    @Override
    public String toString();
    public int getCode();

    public void setCode(int code);

    public String getDescription();

    public void setDescription(String description);

    public double getPrix();

    public void setPrix(double prix);

    public void ajouterIngredient(Ingredients ingredients, double quantite, String unit);

    public void viewRecette();

    public ArrayList<Ingredients> getIngredients();
    public ArrayList<Double> getQuantite();


}
