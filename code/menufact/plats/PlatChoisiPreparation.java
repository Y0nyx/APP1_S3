package menufact.plats;

public class PlatChoisiPreparation extends PlatChoisiEtat {
    public void next(PlatChoisi platChoisi){
        platChoisi.setEtat(new PlatChoisiServi());
    }

    public void prev(PlatChoisi platChoisi){
        platChoisi.setEtat(new PlatChoisiCommande());
    }

    public String toString(){
        return "Le plat choisi est en preparation";
    }
}
