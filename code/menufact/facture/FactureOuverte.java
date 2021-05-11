package menufact.facture;

import menufact.Client;
import menufact.plats.PlatChoisi;

public class FactureOuverte extends FactureState{

    public FactureOuverte(Facture facture){
        this.facture = facture;
        this.facture.setEtat(FactureEtat.OUVERTE);
    }

    public void associerClientFacture(Client client){
        facture.associerClient(client);
    }

    public double totalFacture(){
        return facture.total();
    }

    public void ajouterPlatFacture(PlatChoisi p){
        facture.ajouterPlat(p);
    }

    public void setState( FactureEtat factureEtat){
        if(factureEtat == FactureEtat.OUVERTE){
            facture.changeState(new FactureOuverte(facture));
        }else if(factureEtat == FactureEtat.PAYEE){
            facture.changeState(new FacturePayee(facture));
        }else if(factureEtat == FactureEtat.FERMEE){
            facture.changeState(new FactureFermee(facture));
        }
    }

    public void next(){
        facture.changeState(new FacturePayee(facture));
    }

    public void prev(){
        System.out.println("Le systeme est deja a ca racine");
    }
}
