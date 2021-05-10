package inventaire;

import ingredients.Ingredients;
import inventaire.Exception.InventaireException;

import java.lang.reflect.Array;
import java.util.ArrayList;
/**
 * Classe Inventaire d'inventaire
 * @author Charles Veillette
 * @version 1.0
 */

public class Inventaire {
    /**
     * Il s'agit d'un Singleton
     */
    private static Inventaire Instance;
    private boolean isInInventairel;
    private ArrayList<Ingredients> lesIngredients = new ArrayList<Ingredients>();
    private ArrayList<Double> lesQuantites = new ArrayList<Double>();
    private ArrayList<String> Lunit = new ArrayList<String>();

    /**
     * Constructeur privee d'inventaire
     */
    private Inventaire(){this.isInInventairel = true;}

    /**
     * getInstance d'inventaire qui permet
     * d'acceder au methode de la classe
     * @return Inventaire Instance
     */
    public static synchronized Inventaire getInstance(){
        if(Instance == null)
            Instance = new Inventaire();
        return Instance;
    }

    /**
     * Ajout d'ingredients dans l'inventaire avec leur quantite
     * @param ingredient
     * @param quantite
     * @param unite
     */
    public void ajouter (Ingredients ingredient,double quantite, String unite) throws InventaireException
    {
        for(int i = 0; i< lesIngredients.size();i++)
        {
            if(ingredient == lesIngredients.get(i))
                throw new InventaireException("l'inventaire contient deja cet ingredient");
        }
            this.lesIngredients.add(ingredient);
            this.lesQuantites.add(quantite);
            this.Lunit.add(unite);
    }

    /**
     * L'ajout de quantite dans un ingredient
     * @param quantite
     * @param ingredient
     * @throws InventaireException
     */
    public void ajouterQuantite(double quantite, Ingredients ingredient) throws InventaireException
    {
        for(int i = 0; i< lesIngredients.size();i++){
            if(ingredient == lesIngredients.get(i))
                if((quantite + lesQuantites.get(i)) < 0)
                    throw new InventaireException("La quantite ne peut pas etre negative");
                else
                    this.lesQuantites.set(i,quantite + lesQuantites.get(i));
        }
    }

    /**
     * View de l'inventaire complet
     */
    public void viewInventaire(){
            System.out.println("inventaire.Inventaire{");
        for (int i = 0; i < lesIngredients.size(); i++) {
            System.out.println("ingredient=" + lesIngredients.get(i)+
                    ", quantite=" + lesQuantites.get(i) +
                    ", unit=" + Lunit.get(i));
        }
        System.out.println('}');
    }

}





