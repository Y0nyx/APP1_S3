package menufact.plats;

public class PlatChoisiImpossible extends PlatChoisiEtat{
    public void next(PlatChoisi platChoisi){
        System.out.println("Il n'y a pas assez d'ingredient pour effectuer ce plat");
    }

    public void prev(PlatChoisi platChoisi){
        System.out.println("Il n'y a pas assez d'ingredient pour effectuer ce plat");
    }

    public String toString(){
        return "Il n'y a pas assez d'ingredient pour effectuer ce plat";
    }
}
