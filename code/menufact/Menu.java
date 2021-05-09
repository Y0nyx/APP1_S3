package menufact;

import inventaire.Inventaire;
import menufact.exceptions.MenuException;
import menufact.plats.PlatAuMenu;

import java.util.ArrayList;

public class Menu {
    private static Menu Instance;
    private String description;
    private int courant;
    private ArrayList<PlatAuMenu> plat = new ArrayList<PlatAuMenu>();

    public Menu(String description) {
        this.description = description;
    }

   /* private Menu(){} */

    /*public static synchronized Menu getInstance(){
        if(Instance == null)
            Instance = new Menu();
        return Instance;
    }*/

    void ajoute (PlatAuMenu p)
    {
        plat.add(p);
    }

    public void position(int i)
    {
        courant = i;
    }

    public PlatAuMenu platCourant()
    {
        return plat.get(courant);
    }

    public void positionSuivante() throws MenuException
    {
        if (courant+1 >= plat.size())
            throw new MenuException("On depasse le nombre maximale de plats.");
        else
            courant++;
    }

    public void positionPrecedente() throws MenuException
    {
        if (courant-1 < 0)
            throw new MenuException("On depasse le nombre minimale de plats");
        else
            courant--;
    }


    @Override
    public String toString() {
        return "menufact.Menu{" +
                "description='" + description + '\'' +
                ", courant=" + courant +
                ", plat=" + "\n" + plat +
                '}';
    }
}
