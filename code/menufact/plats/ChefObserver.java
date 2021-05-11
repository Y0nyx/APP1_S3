package menufact.plats;

import menufact.Observer;

public class ChefObserver extends Observer {

    public ChefObserver(PlatChoisi platChoisi){
        this.platChoisi = platChoisi;
        this.platChoisi.attach(this);
    }
    public void update(){
        System.out.println("Le chef a ete notifier");
    }

    public void next(){
        platChoisi.getEtat().next(platChoisi);
    }
    public void prev(){
        platChoisi.getEtat().prev(platChoisi);
    }

}
