package menufact;

import menufact.facture.Facture;
import menufact.facture.FactureState;
import menufact.facture.FactureEtat;
import menufact.plats.Plat;
import menufact.plats.PlatAuMenuFactory;
import menufact.plats.PlatChoisi;


public class TestMenuFact01 {
    public static void main(String[] args) {

        try {
            PlatAuMenuFactory pFactory = new PlatAuMenuFactory();

            System.out.println("===menufact.plats.PlatAuMenu Constructeur 3 arguments");
            Plat p1 = pFactory.buildPlatAuMenu(0, "Frites sauce", 11.50);

            System.out.println("===menufact.plats.PlatAuMenu Constructeur 3 arguments");
            Plat p2 = pFactory.buildPlatAuMenu(1, "Frites", 10.25);
            System.out.println(p2);

            System.out.println("===menufact.plats.PlatSante Constructeur 5 arguments");
            Plat ps1 = pFactory.buildPlatSante(2,"Salade", 5.25, 100, 10, 1);
            System.out.println(ps1);

            System.out.println("===menufact.plats.PlatSante Constructeur 5 arguments");
            Plat ps2 = pFactory.buildPlatSante(3, "Salade Cesar", 8.25, 100, 10, 1);
            System.out.println(ps2);

            System.out.println("===menufact.Menu ajout avec 4 plats");
            Menu menu = new Menu();
            menu.ajoute(p1);
            menu.ajoute(p2);
            menu.ajoute(ps1);
            menu.ajoute(ps2);
            System.out.println(menu);

            System.out.println("===menufact.Menu position 1, plat à la position 0");
            menu.position(0);

            System.out.println("===menufact.Menu position 1, plat à la position suivante 1");
            menu.positionSuivante();
            System.out.println(menu.platCourant());

            System.out.println("== Plat choisi");
            PlatChoisi pch1 = pFactory.buildPlatChoisi(p1, 5);
            System.out.println(pch1);

            System.out.println("== New menufact.facture.Facture");

            System.out.println("== New menufact.facture.Facture");
            Facture facture = new Facture("Ma facture");
            System.out.println(facture);

            System.out.println("== Ajout d'un plat choisie à la facture");
            facture.ajouterPlat(pch1);
            System.out.println(facture);
            System.out.println(facture.sousTotal());

            System.out.println("== Ajout d'un plat choisie à la facture");
            PlatChoisi pch2 = pFactory.buildPlatChoisi(p2, 10);
            facture.ajouterPlat(pch2);
            System.out.println(facture);
            System.out.println(facture.sousTotal());

            System.out.println(facture.total());
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());

            facture.getState().setState(FactureEtat.FERMEE);
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());

            facture.getState().setState(FactureEtat.OUVERTE);
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());

            facture.getState().next(facture);
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());

            facture.getState().prev(facture);
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());
        }
        catch (Exception fe)
        {
            System.out.println(fe.getMessage());
        }



        }
    }

