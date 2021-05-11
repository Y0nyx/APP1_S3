package menufact;

import menufact.plats.PlatChoisi;
/**
 * classe abstraite observer
 * Permet de faire le lien entre les observer et le plat choisi
 * @author Charles Veillette
 * @version 1.0
 */
public abstract class Observer {
    protected PlatChoisi platChoisi;
    public abstract void update();
    public abstract void next();
    public abstract void prev();
}
