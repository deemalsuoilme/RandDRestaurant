package r.drestaurant;
import javax.swing.*;  
import java.awt.*;
/**
 *
 * @author deemalsuoilme
 */
public class Greeting extends JPanel
{
    private JLabel greeting; 
    
    public Greeting()
    {
        greeting = new JLabel("Welcome to R&D Restaurant!"); 
        setBorder(BorderFactory.createLineBorder(Color.PINK, 3));
        setBackground(Color.WHITE);
        greeting.setForeground(Color.ORANGE);
        add(greeting);
    }
}
