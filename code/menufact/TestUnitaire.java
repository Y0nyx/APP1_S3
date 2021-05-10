package menufact;

import ingredients.IngredientFactory;
import ingredients.Ingredients;
import ingredients.TypeIngredient;
import inventaire.Exception.InventaireException;
import inventaire.Inventaire;
import menufact.exceptions.MenuException;

public class TestUnitaire {
    public static void main(String[] args) {
    TestUnitaire test = new TestUnitaire();
        try {
            test.TestIngredient();
        }catch(InventaireException e){
                System.out.println(e.getMessage());

        }

    }

    public void TestIngredient() throws InventaireException {
        IngredientFactory iFactory = new IngredientFactory();
        System.out.println("===Test de la creation d'ingredient"+'\n');
        Ingredients i1 = iFactory.buildIngredient("paprika","epice", TypeIngredient.EPICE);
        Ingredients i2 = iFactory.buildIngredient("Fromage suisse","laitier", TypeIngredient.LAITIER);
        Ingredients i3 = iFactory.buildIngredient("Jambon","viande", TypeIngredient.VIANDE);
        Ingredients i4 = iFactory.buildIngredient("Carrotte","legume", TypeIngredient.LEGUME);
        Ingredients i5 = iFactory.buildIngredient("Pomme","fruit", TypeIngredient.FRUIT);

        System.out.println("===Test de l'ajout d'ingredient dans l'inventaire"+'\n');
        Inventaire.getInstance().ajouter(i1,10,"Kg");
        Inventaire.getInstance().ajouter(i2,20,"Kg");
        Inventaire.getInstance().ajouter(i3,30,"Kg");
        Inventaire.getInstance().ajouter(i4,40,"Kg");
        Inventaire.getInstance().ajouter(i5,50,"Kg");
        Inventaire.getInstance().viewInventaire();

        System.out.println("===Test de l'ajout  de quantite d'ingredient dans l'inventaire"+'\n');
        Inventaire.getInstance().ajouterQuantite(10,i1);
        Inventaire.getInstance().ajouterQuantite(10,i2);
        Inventaire.getInstance().ajouterQuantite(10,i3);
        Inventaire.getInstance().ajouterQuantite(10,i4);
        Inventaire.getInstance().ajouterQuantite(10,i5);
        Inventaire.getInstance().viewInventaire();

        System.out.println("===Test de l'ajout negative d'ingredient dans l'inventaire"+'\n');
        Inventaire.getInstance().ajouterQuantite(-10,i1);
        Inventaire.getInstance().ajouterQuantite(-20,i2);
        Inventaire.getInstance().ajouterQuantite(-30,i3);
        Inventaire.getInstance().ajouterQuantite(-40,i4);
        Inventaire.getInstance().ajouterQuantite(-50,i5);
        Inventaire.getInstance().viewInventaire();

    }

    public void testPlat(){

    }
}
