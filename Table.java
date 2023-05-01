package r.drestaurant;
import javax.swing.*;  
import java.awt.*; 
/**
 *
 * @author deemalsuoilme
 */
public class Table extends JPanel
{
    private JLabel label;
    private JRadioButton indoor;
    private JRadioButton outdoor;
    private ButtonGroup bg;
    
    public Table()
    {
        setLayout(new GridLayout(3, 1));
        //setBorder(BorderFactory.createTitledBorder("Choose a table"));
        setBorder(BorderFactory.createLineBorder(Color.PINK, 3));
        
        label = new JLabel("Choose a table");
        indoor = new JRadioButton("Indoor                         ", true);
        outdoor = new JRadioButton("Outdoor");
        
        bg = new ButtonGroup();
        bg.add(indoor);
        bg.add(outdoor);
        
        setBackground(Color.WHITE);
        label.setBackground(Color.WHITE);
        indoor.setBackground(Color.WHITE);
        outdoor.setBackground(Color.WHITE);
        label.setForeground(Color.ORANGE);
        indoor.setForeground(Color.ORANGE);
        outdoor.setForeground(Color.ORANGE);
        
        add(label);
        add(indoor);
        add(outdoor);
    }
    public String getTable() 
    {
        String t = " "; 
        
        if(indoor.isSelected())
        {
            t = "Indoor table";
        }
        else if(outdoor.isSelected())
        {
            t = "Outdoor table";
        }
        return t;
    }
}
