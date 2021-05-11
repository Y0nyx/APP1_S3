package menufact.facture;

import menufact.Client;
import menufact.plats.PlatChoisi;
/**
 * class Facture fermee
 * fait partie des etats de la facture
 * @author Charles Veillette
 * @version 1.0
 */
public class FactureFermee extends FactureState{
    /**
     * Constructeur de Facture fermee
     * @param facture
     */
    public FactureFermee(Facture facture){
        this.facture = facture;
        this.facture.setEtat(FactureEtat.FERMEE);
    }

    /**
     * Association d'un client avec une facture selon l'etat fermee
     * @param client
     */
    public void associerClientFacture(Client client){
        System.out.println("Vous ne pouvez pas associer un client a ce stade");
    }

    /**
     * total de la facture selon la l'etat fermee
     * @return double total
     */
    public double totalFacture(){
        return facture.total();
    }

    /**
     * ajout d'un plat a la facture selon l'etat fermee
     * @param p
     */
    public void ajouterPlatFacture(PlatChoisi p){
        System.out.println("Vous ne pouvez pas ajouter un plat a ce stade");
    }

    /**
     * set la state a un nouvel etat
     * @param factureEtat
     */
    public void setState(FactureEtat factureEtat){
        if(factureEtat == FactureEtat.OUVERTE){
            facture.changeState(new FactureOuverte(facture));
        }else if(factureEtat == FactureEtat.PAYEE){
            facture.changeState(new FacturePayee(facture));
        }else if(factureEtat == FactureEtat.FERMEE){
            facture.changeState(new FactureFermee(facture));
        }
    }

    /**
     * permet d'acceder au prochain etat
     */
    public void next(){ System.out.println("La facture est fermee"); };

    /**
     * permet d'acceder au precedent etat
     */
    public void prev(){
        System.out.println("La facture est fermee");
    }
}
