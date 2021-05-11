package menufact.facture;

import menufact.facture.Facture;
import menufact.Client;
import menufact.plats.PlatChoisi;

public abstract class FactureState {
    Facture facture;

    public abstract void associerClientFacture(Client client);

    public abstract double totalFacture();

    public abstract void ajouterPlatFacture(PlatChoisi p);

    public abstract void setState(FactureEtat factureEtat);

    public abstract void next();

    public abstract void prev();
}
