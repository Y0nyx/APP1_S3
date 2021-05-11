package menufact.plats;
/**
 * Factory de plat
 * @author Charles Veillette
 * @version 1.0
 */
public class PlatAuMenuFactory {
    /**
     * Constructeur de la factory
     */
    public PlatAuMenuFactory(){};

    /**
     * build un plat au menu
     * @param code
     * @param description
     * @param prix
     * @return  PlatAuMenu
     */
    public Plat buildPlatAuMenu(int code, String description, double prix){
        return new PlatAuMenu(code,description,prix);
    }

    /**
     * build un plat enfant
     * @param code
     * @param description
     * @param prix
     * @param proportion
     * @return PlatEnfant
     */
    public PlatEnfant buildPlatEnfant(int code, String description, double prix, double proportion){
        return new PlatEnfant(code,description,prix,proportion);
    }

    /**
     * Permet de build un plat sante
     * @param code
     * @param description
     * @param prix
     * @param kcal
     * @param chol
     * @param gras
     * @return  PlatSante
     */
    public PlatSante buildPlatSante(int code, String description, double prix, double kcal, double chol, double gras){
        return new PlatSante(code,description,prix,kcal,chol,gras);
    }

    /**
     * Permet de build un plat choisi
     * @param plat
     * @param quantite
     * @return PlatChoisi
     */
    public PlatChoisi buildPlatChoisi(Plat plat, int quantite){
        return new PlatChoisi(plat,quantite);
    }

}
