package menufact.plats;

public class PlatChoisiCommande extends PlatChoisiEtat {

    public void next(PlatChoisi platChoisi){
        platChoisi.setEtat(new PlatChoisiPreparation());
    }

    public void prev(PlatChoisi platChoisi){
        System.out.println("La commande est deja a ca source");
    }

    public String toString(){
        return "Le plat choisi a ete commande";
    }
}
