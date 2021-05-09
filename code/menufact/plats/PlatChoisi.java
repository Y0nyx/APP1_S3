package menufact.plats;

import menufact.Observer;

import java.util.ArrayList;

public class PlatChoisi {
    private PlatAuMenu plat;
    private int quantite;
    private PlatChoisiEtat etat;
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public PlatChoisi(PlatAuMenu plat, int quantite) {
        this.plat = plat;
        this.quantite = quantite;
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

    public PlatAuMenu getPlat() {
        return plat;
    }


    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void attach(Observer observer ){
            observers.add(observer);
        }

    public void setEtat(PlatChoisiEtat platChoisiEtat){
        this.etat = platChoisiEtat;
    }


}
