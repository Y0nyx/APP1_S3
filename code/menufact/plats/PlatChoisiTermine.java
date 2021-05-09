package menufact.plats;

public class PlatChoisiTermine extends PlatChoisiEtat{
    public void next(PlatChoisi platChoisi){
        System.out.println("Le plat choisi est termine");
    }

    public void prev(PlatChoisi platChoisi){
        platChoisi.setEtat(new PlatChoisiServi());
    }

    public String toString(){
        return "Le plat choisi a est termine";
    }
}
