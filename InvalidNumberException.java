package r.drestaurant;
import javax.swing.JOptionPane;
/**
 *
 * @author deemalsuoilme
 */
public class InvalidNumberException extends Exception 
{
    public InvalidNumberException()
    {
        super("Incorrect contact information input.");
    }
    public InvalidNumberException(String message) 
    {
        super(message);
    }
}
