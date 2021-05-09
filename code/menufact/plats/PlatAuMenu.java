package menufact.plats;

import java.util.ArrayList;
import ingredients.Ingredients;


public class PlatAuMenu implements Plat{
    private int code;
    private String description;
    private double prix;
    private int courant;
    private Observer chef;
    private ArrayList<Ingredients> ingredient= new ArrayList<Ingredients>();
    private ArrayList<Double> quantite = new ArrayList<Double>();
    private ArrayList<String> unit = new ArrayList<String>();

    public PlatAuMenu(int code, String description, double prix) {
        this.code = code;
        this.description = description;
        this.prix = prix;
    }

    public PlatAuMenu() {}

    @Override
    public String toString() {
        return "menufact.plats.PlatAuMenu{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                "}\n";
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void ajouterIngredient(Ingredients ingredient, double quantite, String unit) {
        this.ingredient.add(ingredient);
        this.quantite.add(quantite);
        this.unit.add(unit);
    }

    public void notifyObserver(){
        chef.update();
    }
}
