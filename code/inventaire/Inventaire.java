package inventaire;

import ingredients.Ingredients;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Inventaire {
    private static Inventaire Instance;
    private ArrayList<Ingredients> lesIngredients = new ArrayList<Ingredients>();

    private Inventaire(){}

    public static synchronized Inventaire getInstance(){
        if(Instance == null)
            Instance = new Inventaire();
        return Instance;
    }

    public void ajouter (Ingredients ingredient,)
    {
        lesIngredients.add(ingredient);
    }

}
