package hep.aida;

/**
 * Exception thrown if an ITuple or ICloud runs out of memory.
 * @author Pavel Binko, Dino Ferrero Merlino, Wolfgang Hoschek
 * @author Tony Johnson, Andreas Pfeiffer, Mark Donszelmann, Guy Barrand
 * @version $Id: OutOfStorageException.java,v 1.1 2002/08/02 00:09:01 duns Exp $
 */
public class OutOfStorageException extends RuntimeException {

    public OutOfStorageException(String msg) {
        super(msg);
    }
    
    public OutOfStorageException() {
        super();
    }

}
