package menufact.facture;

import menufact.Client;
import menufact.plats.PlatChoisi;

public class FacturePayee extends FactureState{

    public FacturePayee(Facture facture){
        this.facture = facture;
        this.facture.setEtat(FactureEtat.PAYEE);
    }

    public void associerClientFacture(Client client){
        System.out.println("Vous ne pouvez pas associer un client a ce stade");
    }

    public double totalFacture(){
        return facture.total();
    }

    public void ajouterPlatFacture(PlatChoisi p){
        System.out.println("Vous ne pouvez pas changer la facture a ce stade");
    }

    public void setState(FactureEtat factureEtat){
        if(factureEtat == FactureEtat.OUVERTE){
            facture.changeState(new FactureOuverte(facture));
        }else if(factureEtat == FactureEtat.PAYEE){
            facture.changeState(new FacturePayee(facture));
        }else if(factureEtat == FactureEtat.FERMEE){
            facture.changeState(new FactureFermee(facture));
        }
    }

    public void next(){
        facture.changeState(new FactureFermee(facture));
    }

    public void prev(){
        facture.changeState(new FactureOuverte(facture));
    }
}
