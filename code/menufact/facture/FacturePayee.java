package menufact.facture;

import menufact.Client;
import menufact.plats.PlatChoisi;

public class FacturePayee extends FactureState{

    public FacturePayee(Facture facture){
        facture.setEtat(FactureEtat.PAYEE);
    }

    public void associerClientFacture(Client client, Facture facture){
        System.out.println("Vous ne pouvez pas associer un client a ce stade");
    }

    public double totalFacture(Facture facture){
        return facture.total();
    }

    public void ajouterPlatFacture(PlatChoisi p, Facture facture){
        System.out.println("Vous ne pouvez pas changer la facture a ce stade");
    }

    public void setState(Facture facture, FactureEtat factureEtat){
        if(factureEtat == FactureEtat.OUVERTE){
            facture.changeState(new FactureOuverte(facture));
        }else if(factureEtat == FactureEtat.PAYEE){
            facture.changeState(new FacturePayee(facture));
        }else if(factureEtat == FactureEtat.FERMEE){
            facture.changeState(new FactureFermee(facture));
        }
    }

    public void next(Facture facture){
        facture.changeState(new FactureFermee(facture));
    }

    public void prev(Facture facture){
        facture.changeState(new FactureOuverte(facture));
    }
}
