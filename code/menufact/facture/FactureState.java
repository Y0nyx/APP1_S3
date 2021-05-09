package menufact.facture;

import menufact.facture.Facture;
public abstract class FactureState {
    Facture facture;

    public abstract void associerClientFacture(Client client, Facture facture);

    public abstract double totalFacture(Facture facture);

    public abstract void ajouterPlatFacture(PlatChoisi p, Facture facture);

    public abstract void next(Facture facture);

    public abstract void prev(Facture facture);
}
