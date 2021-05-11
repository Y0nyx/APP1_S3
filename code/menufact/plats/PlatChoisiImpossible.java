package menufact.plats;
/**
 * class plat choisi a l'etat impossible
 * @author Charles Veillette
 * @version 1.0
 */
public class PlatChoisiImpossible extends PlatChoisiEtat{
    /**
     * Permet d'acceder au prochain etat du plat choisi
     * @param platChoisi
     */
    public void next(PlatChoisi platChoisi){
        System.out.println("Il n'y a pas assez d'ingredient pour effectuer ce plat");
    }

    /**
     * Permet d'acceder au precedent etat du plat choisi
     * @param platChoisi
     */
    public void prev(PlatChoisi platChoisi){
        System.out.println("Il n'y a pas assez d'ingredient pour effectuer ce plat");
    }

    /**
     * Overload de la methode toString
     * @return String message
     */
    public String toString(){
        return "Il n'y a pas assez d'ingredient pour effectuer ce plat";
    }
}
