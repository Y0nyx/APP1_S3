package menufact.plats;

public class PlatAuMenuFactory {
    public PlatAuMenuFactory(){};

    public Plat buildPlatAuMenu(int code, String description, double prix){
        return new PlatAuMenu(code,description,prix);
    }

    public PlatEnfant buildPlatEnfant(int code, String description, double prix, double proportion){
        return new PlatEnfant(code,description,prix,proportion);
    }

    public PlatSante buildPlatSante(int code, String description, double prix, double kcal, double chol, double gras){
        return new PlatSante(code,description,prix,kcal,chol,gras);
    }

    public PlatChoisi buildPlatChoisi(Plat plat, int quantite){
        return new PlatChoisi(plat,quantite);
    }

}
