package menufact;
/**
 * class client
 * represente le client dans ce scenario
 * @author Charles Veillette
 * @version 1.0
 */
public class Client {
    private int idClient;
    private String nom;
    private String numeroCarteCredit;

    /**
     * Constructeur overload du client
     * @param idClient
     * @param nom
     * @param numeroCarteCredit
     */
    public Client(int idClient, String nom, String numeroCarteCredit) {
        this.idClient = idClient;
        this.nom = nom;
        this.numeroCarteCredit = numeroCarteCredit;
    }

    /**
     * get le ID du client
     * utile pour faire une base de donne des clients
     * @return int IdClient
     */
    public int getIdClient() {
        return idClient;
    }

    /**
     * set le ID du client
     * @param idClient
     */
    public void setIdClient(int idClient) { this.idClient = idClient; }

    /**
     * get le nom du client
     * @return String nom
     */
    public String getNom() { return nom; }

    /**
     * set le nom du client
     * @param nom
     */
    public void setNom(String nom) { this.nom = nom; }

    /**
     * get le numero de carte de credit
     * @return String numeroCarteCredit
     */
    public String getNumeroCarteCredit() { return numeroCarteCredit; }

    /**
     * set le numero de carte de credit
     * @param numeroCarteCredit
     */
    public void setNumeroCarteCredit(String numeroCarteCredit) { this.numeroCarteCredit = numeroCarteCredit; }

    /**
     * overload de la methode toString
     * @return String message
     */
    @Override
    public String toString() {
        return "menufact.Client{" +
                "idClient=" + idClient +
                ", nom='" + nom + '\'' +
                ", numeroCarteCredit='" + numeroCarteCredit + '\'' +
                '}';
    }
}
