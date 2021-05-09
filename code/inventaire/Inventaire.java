package inventaire;

import ingredients.Ingredients;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Inventaire {
    private static Inventaire Instance;
    private ArrayList<Ingredients> lesIngredients = new ArrayList<Ingredients>();
    private ArrayList<Double> lesQuantites = new ArrayList<Double>();
    private ArrayList<String> Lunit = new ArrayList<String>();

    private Inventaire(){}

    public static synchronized Inventaire getInstance(){
        if(Instance == null)
            Instance = new Inventaire();
        return Instance;
    }

    public void ajouter (Ingredients ingredient,double quantite, String unite)
    {
        this.lesIngredients.add(ingredient);
        this.lesQuantites.add(quantite);
        this.Lunit.add(unite);
    }




}
