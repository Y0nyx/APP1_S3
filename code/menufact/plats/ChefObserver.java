package menufact.plats;

import menufact.Observer;

public class ChefObserver extends Observer {

    public ChefObserver(PlatChoisi platChoisi){
        this.platChoisi = platChoisi;
        this.platChoisi.attach(this);
    }
    public void update(){
        System.out.println("Le plat est commande !");
    }
}
