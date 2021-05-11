package menufact;


import menufact.exceptions.MenuException;
import menufact.plats.Plat;
import java.util.ArrayList;
/**
 * class menu
 * rassemble tout les plats sur les menus
 * @author Charles Veillette
 * @version 1.0
 */
public class Menu {
    private String description;
    private int courant;
    private ArrayList<Plat> plat = new ArrayList<Plat>();

    /**
     * Constructeur overload menu
     * @param description
     */
    public Menu(String description){this.description = description;}

    /**
     * Constructeur menu
     */
    public Menu(){}

    /**
     * ajoute un plat au menu
     * @param p
     */

    void ajoute (Plat p) throws MenuException
    {
        if(p.getPrix() < 0)
            throw new MenuException("Vous ne pouvez pas ajouté un plat au prix négatif");
        else
            plat.add(p);
    }

    /**
     * permet de set le courant
     * cela permet d'acceder a un certain element de la liste
     * @param i
     */
    public void position(int i)
    {
        courant = i;
    }

    /**
     * Permet de get le plat au courant correspondant
     * @return Plat plat
     */
    public Plat platCourant()
    {
        return plat.get(courant);
    }

    /**
     * Permet d'acceder a la prochaine position
     * a un effet sur le courant
     * @throws MenuException
     */
    public void positionSuivante() throws MenuException
    {
        if (courant+1 >= plat.size())
            throw new MenuException("On depasse le nombre maximale de plats.");
        else
            courant++;
    }

    /**
     * Permet d'acceder a la position precedente
     * @throws MenuException
     */
    public void positionPrecedente() throws MenuException
    {
        if (courant-1 < 0)
            throw new MenuException("On depasse le nombre minimale de plats");
        else
            courant--;
    }

    /**
     * overload de la methode toString
     * @return
     */
    @Override
    public String toString() {
        return "menufact.Menu{" +
                "description='" + description + '\'' +
                ", courant=" + courant +
                ", plat=" + "\n" + plat +
                '}';
    }
}
