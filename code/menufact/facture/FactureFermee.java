package menufact.facture;

import menufact.Client;
import menufact.plats.PlatChoisi;

public class FactureFermee extends FactureState{

    public FactureFermee(Facture facture){
        this.facture = facture;
        this.facture.setEtat(FactureEtat.FERMEE);
    }
    public void associerClientFacture(Client client){
        System.out.println("Vous ne pouvez pas associer un client a ce stade");
    }

    public double totalFacture(){
        return facture.total();
    }

    public void ajouterPlatFacture(PlatChoisi p){
        System.out.println("Vous ne pouvez pas ajouter un plat a ce stade");
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

    public void next(){ System.out.println("La facture est fermee"); };

    public void prev(){
        System.out.println("La facture est fermee");
    }
}
