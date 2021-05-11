package menufact.plats;

import menufact.Observer;
import java.util.ArrayList;
import inventaire.Inventaire;

public class PlatChoisi {
    private Plat plat;
    private int quantite;
    private PlatChoisiEtat etat;
    private ChefObserver chef;

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

    @Override
    public String toString() {
        return "menufact.plats.PlatChoisi{" +
                "quantite=" + quantite +
                ", plat=" + plat +
                '}';
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Plat getPlat() {
        return plat;
    }


    public void notifyAllObserver() {

            chef.update();

    }

    public void attach(ChefObserver chef ){
            this.chef = chef;
        }

    public void setEtat(PlatChoisiEtat platChoisiEtat){
        this.etat = platChoisiEtat;
    }

    public PlatChoisiEtat getEtat(){ return etat;}

    public ChefObserver getChef(){ return chef;}
}
