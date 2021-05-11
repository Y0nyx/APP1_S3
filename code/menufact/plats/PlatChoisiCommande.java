package menufact.plats;
/**
 * classe plat choisi a l'etat commande
 * @author Charles Veillette
 * @version 1.0
 */
public class PlatChoisiCommande extends PlatChoisiEtat {
    /**
     * Permet d'acceder au prochain etat du plat choisi
     * @param platChoisi
     */
    public void next(PlatChoisi platChoisi){
        platChoisi.setEtat(new PlatChoisiPreparation());
    }

    /**
     * Permet d'acceder au precedent etat du plat choisi
     * @param platChoisi
     */
    public void prev(PlatChoisi platChoisi){
        System.out.println("La commande est deja a ca source");
    }

    /**
     * overloard de la methode toString
     * @return String message
     */
    public String toString(){
        return "Le plat choisi a ete commande";
    }
}
