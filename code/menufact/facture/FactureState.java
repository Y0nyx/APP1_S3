package menufact.facture;

import menufact.facture.Facture;
import menufact.Client;
import menufact.plats.PlatChoisi;
/**
 * class abstraite de l'etat de la facture
 * rassemble les etats de la facture
 * @author Charles Veillette
 * @version 1.0
 */

public abstract class FactureState {
    Facture facture;

    public abstract void associerClientFacture(Client client);

    public abstract double totalFacture();

    public abstract void ajouterPlatFacture(PlatChoisi p);

    public abstract void setState(FactureEtat factureEtat);

    public abstract void next();

    public abstract void prev();
}
