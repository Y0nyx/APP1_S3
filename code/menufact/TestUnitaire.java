package menufact;

import ingredients.IngredientFactory;
import ingredients.Ingredients;
import ingredients.TypeIngredient;
import inventaire.Exception.InventaireException;
import inventaire.Inventaire;
import menufact.exceptions.MenuException;
import menufact.facture.Facture;
import menufact.facture.FactureEtat;
import menufact.facture.FactureState;
import menufact.facture.exceptions.FactureException;
import menufact.plats.*;

public class TestUnitaire {
    public static void main(String[] args) {
    TestUnitaire test = new TestUnitaire();
    Client paulo = null;
    Ingredients i = null;
    Menu m1 = new Menu();
    PlatAuMenuFactory pFactory = new PlatAuMenuFactory();
    Plat p1Negatif = pFactory.buildPlatAuMenu(0,"PlatAuMenu0",-10);
    /*

        try {
            test.testIngredient();
        }catch(InventaireException e){
                System.out.println(e.getMessage());

        }
    */

        try {
            test.testPlat();
        }catch(InventaireException | MenuException e1){
            System.out.println(e1.getMessage());
        }
        try {
            System.out.println("Ingrédient Déja inventaire");
            IngredientFactory iFactory = new IngredientFactory();
            Ingredients i1 = iFactory.buildIngredient("paprika","epice", TypeIngredient.EPICE);
            Inventaire.getInstance().ajouter(i1,10,"Kg");
            Inventaire.getInstance().ajouter(i1,10,"Kg");
        }catch(InventaireException e1){
            System.out.println(e1.getMessage());
        }

        try {
            System.out.println("Rajouter Quantité négative inventaire");
            IngredientFactory iFactory = new IngredientFactory();
            Ingredients i1 = iFactory.buildIngredient("paprika","epice", TypeIngredient.EPICE);
            Inventaire.getInstance().ajouterQuantite(-10, i1);
            Inventaire.getInstance().viewInventaire();
        }catch(InventaireException e1){
            System.out.println(e1.getMessage());
        }

        try {
            System.out.println("Rajouter ingrédient inconnue");
            IngredientFactory iFactory = new IngredientFactory();
            Ingredients i1 = iFactory.buildIngredient("paprika","epice", TypeIngredient.EPICE);
            System.out.println("l'ingrédient que vous voulez rajouter est null");
        }catch(Exception e1){
            System.out.println(e1.getMessage());
        }

        try
        {
          System.out.println("Test Nom vide");
          paulo = new Client(1, null, "aaa111");
          paulo.getNom();
          System.out.println("Le Client a un nom null");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        try {
            System.out.println("Ajouter plat prix négatif");
            m1.ajoute(p1Negatif);
        }catch (MenuException e){
            System.out.println(e.getMessage());
        }

    }

    public void testIngredient() throws InventaireException {
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

    public void testPlat() throws InventaireException, MenuException {
        PlatAuMenuFactory pFactory = new PlatAuMenuFactory();
        IngredientFactory iFactory = new IngredientFactory();
        Menu m = new Menu();

        Plat p1 = pFactory.buildPlatAuMenu(0,"PlatAuMenu0",10);
        Plat p2 = pFactory.buildPlatAuMenu(1,"PlatAuMenu1",20);
        Plat p3 = pFactory.buildPlatAuMenu(2,"PlatAuMenu2",30);
        Plat p4 = pFactory.buildPlatAuMenu(3,"PlatAuMenu3",40);
        Plat p5 = pFactory.buildPlatAuMenu(4,"PlatAuMenu4",50);

        Plat ps1 = pFactory.buildPlatSante(10,"PlatSante0",10,11,11,11);
        Plat ps2 = pFactory.buildPlatSante(11,"PlatSante1",20,11,11,11);
        Plat ps3 = pFactory.buildPlatSante(12,"PlatSante2",30,11,11,11);
        Plat ps4 = pFactory.buildPlatSante(13,"PlatSante3",40,11,11,11);
        Plat ps5 = pFactory.buildPlatSante(14,"PlatSante4",50,11,11,11);

        Ingredients i1 = iFactory.buildIngredient("paprika","epice", TypeIngredient.EPICE);
        Ingredients i2 = iFactory.buildIngredient("Fromage suisse","laitier", TypeIngredient.LAITIER);
        Ingredients i3 = iFactory.buildIngredient("Jambon","viande", TypeIngredient.VIANDE);
        Ingredients i4 = iFactory.buildIngredient("Carrotte","legume", TypeIngredient.LEGUME);
        Ingredients i5 = iFactory.buildIngredient("Pomme","fruit", TypeIngredient.FRUIT);

        m.ajoute(p1);
        m.ajoute(p2);
        m.ajoute(p3);
        m.ajoute(p4);
        m.ajoute(p5);

        m.ajoute(ps1);
        m.ajoute(ps2);
        m.ajoute(ps3);
        m.ajoute(ps4);
        m.ajoute(ps5);

        System.out.println('\n'+"===Test l'etat du plat"+'\n');
        PlatChoisi pc1 = pFactory.buildPlatChoisi(p1,1);
        System.out.println(pc1.getEtat());
        pc1.getEtat().next(pc1);
        System.out.println(pc1.getEtat());
        pc1.getEtat().next(pc1);
        System.out.println(pc1.getEtat());
        pc1.getEtat().next(pc1);
        System.out.println(pc1.getEtat());


        System.out.println('\n'+"===Test de l'ajout d'ingredient dans l'inventaire"+'\n');
        Inventaire.getInstance().ajouter(i1,10,"Kg");
        Inventaire.getInstance().ajouter(i2,20,"Kg");
        Inventaire.getInstance().ajouter(i3,30,"Kg");
        Inventaire.getInstance().ajouter(i4,40,"Kg");
        Inventaire.getInstance().ajouter(i5,50,"Kg");
        Inventaire.getInstance().viewInventaire();

        System.out.println("===Test de l'ajout d'ingredient dans un plat"+'\n');
        p1.ajouterIngredient(i1,3,"Kg");
        p1.ajouterIngredient(i2,4,"Kg");
        p1.ajouterIngredient(i3,5,"Kg");
        p1.viewRecette();

        ps1.ajouterIngredient(i1,4,"Kg");
        ps1.ajouterIngredient(i2,5,"Kg");
        ps1.ajouterIngredient(i3,2,"Kg");
        ps1.ajouterIngredient(i4,7,"Kg");
        ps1.viewRecette();
        System.out.println(ps1);

        System.out.println("===Test de l'inventaire"+'\n');
        PlatChoisi pc2 = pFactory.buildPlatChoisi(p1,1);
        System.out.println(pc2.getEtat());
        PlatChoisi pc3 = pFactory.buildPlatChoisi(ps1,1);
        System.out.println(pc3.getEtat());
        PlatChoisi pc4 = pFactory.buildPlatChoisi(p1,100);
        System.out.println(pc4.getEtat());

        System.out.println("===Test de l'inventaire avec la facture"+'\n');
        Inventaire.getInstance().viewInventaire();
        Facture facture = new Facture("Ma facture");
        facture.ajouterPlat(pc2);
        facture.ajouterPlat(pc3);
        Inventaire.getInstance().viewInventaire();

        System.out.println("===Test de creation d'un client"+'\n');
        Client client01 = new Client(0,"Charles","23424523424");
        System.out.println(client01);

        System.out.println("===Test de generation de facture"+'\n');
        facture.associerClient(client01);
        System.out.println(facture.genererFacture());
    }

    public void testMenu() throws MenuException{
        Menu menu = new Menu();
        PlatAuMenuFactory pFactory = new PlatAuMenuFactory();

        Plat p1 = pFactory.buildPlatAuMenu(0,"PlatAuMenu0",10);
        Plat p2 = pFactory.buildPlatAuMenu(1,"PlatAuMenu1",20);

        System.out.println("===Test d'ajout au menu"+'\n');
        menu.ajoute(p1);
        menu.ajoute(p1);

        System.out.println("===Test du courant du menu"+'\n');
        menu.positionSuivante();
        System.out.println(menu.platCourant());
        menu.positionPrecedente();
        System.out.println(menu.platCourant());
        menu.position(0);
        System.out.println(menu.platCourant());


    }

    public void testFactory() throws FactureException, MenuException{
        Menu menu = new Menu();
        PlatAuMenuFactory pFactory = new PlatAuMenuFactory();

        Plat p1 = pFactory.buildPlatAuMenu(0,"PlatAuMenu0",10);
        Plat p2 = pFactory.buildPlatAuMenu(1,"PlatAuMenu1",20);

        PlatChoisi pc2 = pFactory.buildPlatChoisi(p1,1);
        PlatChoisi pc3 = pFactory.buildPlatChoisi(p2,1);

        menu.ajoute(p1);
        menu.ajoute(p1);

        Facture facture = new Facture("Facture test");
        Client client = new Client(0,"domingo","123352431431");

        System.out.println("===Test fonctionnalite de la facture"+'\n');
        facture.associerClient(client);
        facture.ajouterPlat(pc2);
        facture.ajouterPlat(pc3);
        facture.getState().setState(FactureEtat.PAYEE);
    }
}
