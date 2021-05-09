package menufact.plats;

public class PlatChoisiServi extends PlatChoisiEtat{
    public void next(PlatChoisi platChoisi){
        platChoisi.setEtat(new PlatChoisiTermine());
    }

    public void prev(PlatChoisi platChoisi){
        platChoisi.setEtat(new PlatChoisiPreparation());
    }

    public String toString(){
        return "Le plat choisi a ete Servi";
    }
}
