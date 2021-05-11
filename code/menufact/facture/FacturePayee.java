package menufact.facture;

import menufact.Client;
import menufact.plats.PlatChoisi;
/**
 * class Facture Payee
 * fait partie des etats de la facture
 * @author Charles Veillette
 * @version 1.0
 */
public class FacturePayee extends FactureState{
    /**
     * Constructeur de facture payee
     * @param facture
     */
    public FacturePayee(Facture facture){
        this.facture = facture;
        this.facture.setEtat(FactureEtat.PAYEE);
    }

    /**
     * Association d'un client avec une facture selon l'etat
     * @param client
     */
    public void associerClientFacture(Client client){
        System.out.println("Vous ne pouvez pas associer un client a ce stade");
    }

    /**
     * total de la facture selon l'etat
     * @return double total
     */
    public double totalFacture(){
        return facture.total();
    }

    /**
     * Permet d'ajouter un plat a la facture selon l'etat
     * @param p
     */
    public void ajouterPlatFacture(PlatChoisi p){
        System.out.println("Vous ne pouvez pas changer la facture a ce stade");
    }

    /**
     * Permet de set le state
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
     * Permet d'acceder a l'etat suivant
     */
    public void next(){
        facture.changeState(new FactureFermee(facture));
    }

    /**
     * Permet d'acceder a l'etat precedent
     */
    public void prev(){
        facture.changeState(new FactureOuverte(facture));
    }
}
