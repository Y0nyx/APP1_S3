package menufact.facture;


public class FactureOuverte extends FactureState{

    FactureOuverte(Facture facture){
        facture.setEtat(FactureEtat.OUVERTE);
    }

    public void associerClientFacture(Client client, Facture facture){
        facture.associerClient(client);
    }

    public double totalFacture(Facture facture){
        return facture.total();
    }

    public void ajouterPlatFacture(PlatChoisi p, Facture facture){
        facture.ajoutePlat(p);
    }

    public void next(Facture facture){
        facture.changeState(new FacturePayee(facture));
    }

    public void prev(Facture facture){
        System.out.println("Le systeme est deja a ca racine");
    }
}
