package menufact;

import menufact.plats.PlatChoisi;

public abstract class Observer {
    protected PlatChoisi platChoisi;
    public abstract void update();
}
