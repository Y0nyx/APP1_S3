package inventaire.Exception;

import inventaire.Inventaire;

public class InventaireException extends Exception{
public InventaireException(String message){
        super("FactureException: " + message);
        }
}
