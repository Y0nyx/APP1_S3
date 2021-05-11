package menufact.plats;
/**
 * class plat enfant
 * @author Charles Veillette
 * @version 1.0
 */
public class PlatEnfant extends PlatAuMenu{
    private double proportion;

    /**
     * Constructeur du plat enfant
     */
    public PlatEnfant() {
    }

    /**
     * Constructeur overload du plat enfant
     * @param code
     * @param description
     * @param prix
     * @param proportion
     */
    public PlatEnfant(int code, String description, double prix, double proportion) {
        setCode(code);
        setDescription(description);
        setPrix(prix);
        this.proportion = proportion;
    }

    /**
     * get la proportion du plat enfant
     * proportion est egal a la fraction d'un plat reguliere
     * @return
     */
    public double getProportion() {
        return proportion;
    }

    /**
     * overload de la methode toString
     * @return String message
     */
    @Override
    public String toString() {
        return "PlatEnfant{" +
                "proportion=" + proportion +
                "} " + super.toString();
    }

}
