package menufact.plats;
/**
 * class plat choisi a l'etat servi
 * @author Charles Veillette
 * @version 1.0
 */
public class PlatChoisiServi extends PlatChoisiEtat{
    /**
     * Permet d'acceder au prochain etat du plat choisi
     * @param platChoisi
     */
    public void next(PlatChoisi platChoisi){
        platChoisi.setEtat(new PlatChoisiTermine());
    }

    /**
     * Permet d'acceder au precedent etat du plat choisi
     * @param platChoisi
     */
    public void prev(PlatChoisi platChoisi){
        platChoisi.setEtat(new PlatChoisiPreparation());
    }

    /**
     * Overload de la methode toString
     * @return  String message
     */
    public String toString(){
        return "Le plat choisi a ete Servi";
    }
}
