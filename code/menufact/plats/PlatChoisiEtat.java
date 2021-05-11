package menufact.plats;
/**
 * classe abstraite Plat choisi etat
 * ensemble des etats d'un plat choisi
 * @author Charles Veillette
 * @version 1.0
 */
public abstract class PlatChoisiEtat {
    PlatChoisi platChoisi;

    public abstract void next(PlatChoisi platChoisi);

    public abstract void prev(PlatChoisi platChoisi);

}
