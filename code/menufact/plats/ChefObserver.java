package menufact.plats;

import menufact.Observer;
/**
 * class du observer denomme chef
 * @author Charles Veillette
 * @version 1.0
 */
public class ChefObserver extends Observer {
    /**
     * Constructeur overload de chef observer
     * @param platChoisi
     */
    public ChefObserver(PlatChoisi platChoisi){
        this.platChoisi = platChoisi;
        this.platChoisi.attach(this);
    }

    /**
     * Permet de notifier le chef
     */
    public void update(){
        System.out.println("Le chef a ete notifier");
    }

    /**
     * Permet d'acceder au prochain etat du plat choisi
     */
    public void next(){
        platChoisi.getEtat().next(platChoisi);
    }

    /**
     * Permet d'acceder a l'etat precedent du plat choisi
     */
    public void prev(){
        platChoisi.getEtat().prev(platChoisi);
    }

}
