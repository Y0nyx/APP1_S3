package menufact.plats;

public class PlatSante extends PlatAuMenu {
    private double kcal;
    private double chol;
    private double gras;

    /**
     * Constructeur overload du plat sante
     * @param code
     * @param description
     * @param prix
     * @param kcal
     * @param chol
     * @param gras
     */
    public PlatSante(int code, String description, double prix, double kcal, double chol, double gras) {
        super(code, description, prix);
        this.kcal = kcal;
        this.chol = chol;
        this.gras = gras;
    }

    /**
     * Constructeur plat sante
     */
    public PlatSante() {
    }

    /**
     * overload de la methode toString
     * @return
     */
    @Override
    public String toString() {
        return "menufact.plats.PlatSante{" +
                "kcal=" + kcal +
                ", chol=" + chol +
                ", gras=" + gras +
                "} " + super.toString();
    }

    /**
     * get la Kcal du plat sante
     * @return double kcal
     */
    public double getKcal() {
        return kcal;
    }

    /**
     * get la chol du plat sante
     * @return  double chol
     */
    public double getChol() {
        return chol;
    }

    /**
     * get le gras du plat sante
     * @return double gras
     */
    public double getGras() {
        return gras;
    }
}
