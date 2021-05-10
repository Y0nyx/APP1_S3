package menufact;

import ingredients.IngredientFactory;
import ingredients.Ingredients;
import ingredients.TypeIngredient;
import inventaire.Inventaire;

public class TestUnitaire {
    public static void main(String[] args) {
    TestUnitaire test = new TestUnitaire();

        test.TestIngredient();

    }

    public void TestIngredient(){
        IngredientFactory iFactory = new IngredientFactory();

        Ingredients i1 = iFactory.buildIngredient("paprika","epice", TypeIngredient.EPICE);
        Ingredients i2 = iFactory.buildIngredient("Fromage suisse","laitier", TypeIngredient.LAITIER);
        Ingredients i3 = iFactory.buildIngredient("Jambon","viande", TypeIngredient.VIANDE);
        Ingredients i4 = iFactory.buildIngredient("Carrotte","legume", TypeIngredient.LEGUME);
        Ingredients i5 = iFactory.buildIngredient("Pomme","fruit", TypeIngredient.FRUIT);

        
        System.out.println(i1);
    }
}
