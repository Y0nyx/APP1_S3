package menufact.plats;
/**
 * class plat choisi a l'etat Preparation
 * @author Charles Veillette
 * @version 1.0
 */
public class PlatChoisiPreparation extends PlatChoisiEtat {
    /**
     * Permet d'acceder au prochain etat du plat choisi
     * @param platChoisi
     */
    public void next(PlatChoisi platChoisi){
        platChoisi.setEtat(new PlatChoisiServi());
    }

    /**
     * Permet d'acceder au precedent etat du plat choisi
     * @param platChoisi
     */
    public void prev(PlatChoisi platChoisi){
        platChoisi.setEtat(new PlatChoisiCommande());
    }

    /**
     * overload de la methode toString
     * @return String Message
     */
    public String toString(){
        return "Le plat choisi est en preparation";
    }
}
