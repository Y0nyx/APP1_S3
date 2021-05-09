package menufact.facture;

public class FactureFermee extends FactureState{

    public FactureFermee(Facture facture){
        facture.setEtat(FactureEtat.FERMEE);
    }
    public void associerClientFacture(Client client, Facture facture){
        System.out.println("Vous ne pouvez pas associer un client a ce stade");
    }

    public double totalFacture(Facture facture){
        return facture.total();
    }

    public void ajouterPlatFacture(PlatChoisi p, Facture facture){
        System.out.println("Vous ne pouvez pas ajouter un plat a ce stade");
    }

    public void next(Facture facture){
      System.out.println("La facture est fermee");
    };

    public void prev(Facture facture){
        System.out.println("La facture est fermee");
    }
}
