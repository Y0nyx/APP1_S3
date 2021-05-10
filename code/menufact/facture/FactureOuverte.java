package menufact.facture;

import menufact.Client;
import menufact.plats.PlatChoisi;

public class FactureOuverte extends FactureState{

    public FactureOuverte(Facture facture){
        facture.setEtat(FactureEtat.OUVERTE);
    }

    public void associerClientFacture(Client client, Facture facture){
        facture.associerClient(client);
    }

    public double totalFacture(Facture facture){
        return facture.total();
    }

    public void ajouterPlatFacture(PlatChoisi p, Facture facture){
        facture.ajouterPlat(p);
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
        facture.changeState(new FacturePayee(facture));
    }

    public void prev(Facture facture){
        System.out.println("Le systeme est deja a ca racine");
    }
}
