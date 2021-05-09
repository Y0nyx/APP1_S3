package menufact.facture;

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

    public void next(Facture facture){
        facture.changeState(new FactureFermee(facture));
    }

    public void prev(Facture facture){
        facture.changeState(new FactureOuverte(facture));
    }
}
