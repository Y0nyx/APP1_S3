package menufact.plats;
/**
 * class plat choisi a l'etat terminer
 * @author Charles Veillette
 * @version 1.0
 */
public class PlatChoisiTermine extends PlatChoisiEtat{
    /**
     * Permet d'acceder au prochain d'etat du plat choisi
     * @param platChoisi
     */
    public void next(PlatChoisi platChoisi){
        System.out.println("Le plat choisi est termine");
    }

    /**
     * Permet d'acceder au precedent d'etat du plat choisi
     * @param platChoisi
     */
    public void prev(PlatChoisi platChoisi){
        platChoisi.setEtat(new PlatChoisiServi());
    }

    /**
     * overload de la methode toString
     * @return String message
     */
    public String toString(){
        return "Le plat choisi a est termine";
    }
}
