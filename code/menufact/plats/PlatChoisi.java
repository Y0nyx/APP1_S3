package menufact.plats;

import menufact.Observer;
import java.util.ArrayList;
import inventaire.Inventaire;
/**
 * classe Plat choisi
 * @author Charles Veillette
 * @version 1.0
 */
public class PlatChoisi {
    private Plat plat;
    private int quantite;
    private PlatChoisiEtat etat;
    private ChefObserver chef;

    /**
     * Constructeur overload de Plat choisi
     * @param plat
     * @param quantite
     */
    public PlatChoisi(Plat plat, int quantite) {
        this.plat = plat;
        this.quantite = quantite;
        new ChefObserver(this);
        for(int i = 0; i < plat.getIngredients().size(); i++){
            for (int j = 0; j < Inventaire.getInstance().getLesIngredients().size(); j++){
                if(plat.getIngredients().get(i) == Inventaire.getInstance().getLesIngredients().get(j)){
                    if((plat.getQuantite().get(i)*quantite) > Inventaire.getInstance().getLesQuantites().get(j))
                        this.etat = new PlatChoisiImpossible();
                    else
                        this.etat = new PlatChoisiCommande();


                }
            }
        }
        if(this.etat == null){
            this.etat = new PlatChoisiCommande();
        }
    }

    /**
     * Overload de la methode toString
     * @return String message
     */
    @Override
    public String toString() {
        return "menufact.plats.PlatChoisi{" +
                "quantite=" + quantite +
                ", plat=" + plat +
                '}';
    }

    /**
     * get la quantite du plat choisi
     * @return int quantite
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * set la quantite du plat choisi
     * @param quantite
     */
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    /**
     * get le plat choisi
     * @return PlatChoisi plat
     */
    public Plat getPlat() {
        return plat;
    }

    /**
     * Notify l'observer
     * il est possible d'expendre la methode a plusieur observer
     */
    public void notifyAllObserver() {

            chef.update();

    }

    /**
     * attach un observer au plat
     * @param chef
     */
    public void attach(ChefObserver chef ){
            this.chef = chef;
        }

    /**
     * set l'etat du plat choisi grace a la methode de conception State
     * @param platChoisiEtat
     */
    public void setEtat(PlatChoisiEtat platChoisiEtat){
        this.etat = platChoisiEtat;
    }

    /**
     * get l'etat du plat choisi grace a la methode de conception State
     * @return PlatChoisiEtat etat
     */
    public PlatChoisiEtat getEtat(){ return etat;}

    /**
     * get le chef relier au Plat choisi
     * @return
     */
    public ChefObserver getChef(){ return chef;}
}
