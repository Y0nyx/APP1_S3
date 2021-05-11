package menufact.facture;

import menufact.Client;
import menufact.plats.PlatChoisi;
/**
 * class Facture Ouverte
 * fait partie des etats de la facture
 * @author Charles Veillette
 * @version 1.0
 */
public class FactureOuverte extends FactureState{
    /**
     * Construeteur de facture ouverte
     * @param facture
     */
    public FactureOuverte(Facture facture){
        this.facture = facture;
        this.facture.setEtat(FactureEtat.OUVERTE);
    }

    /**
     * association d'un client avec une facture selon l'etat
     * @param client
     */
    public void associerClientFacture(Client client){
        facture.associerClient(client);
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
        facture.ajouterPlat(p);
    }

    /**
     * Permet de set le state
     * @param factureEtat
     */
    public void setState( FactureEtat factureEtat){
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
        facture.changeState(new FacturePayee(facture));
    }

    /**
     * Permet d'acceder a l'etat precedent
     */
    public void prev(){
        System.out.println("Le systeme est deja a ca racine");
    }
}
