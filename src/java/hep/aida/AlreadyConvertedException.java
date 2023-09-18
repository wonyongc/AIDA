package hep.aida;

/**
 * Exception thrown if an ICloud has already been converted and the user tries to access
 * an entry information.
 * @author Pavel Binko, Dino Ferrero Merlino, Wolfgang Hoschek
 * @author Tony Johnson, Andreas Pfeiffer, Mark Donszelmann, Guy Barrand
 */
public class AlreadyConvertedException extends RuntimeException {
    
    public AlreadyConvertedException(String msg) {
        super(msg);
    }
    
    public AlreadyConvertedException() {
        super();
    }

}
