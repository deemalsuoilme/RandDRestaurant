package r.drestaurant;
import javax.swing.*;  
import java.awt.*;
/**
 *
 * @author deemalsuoilme
 */
public class Menu extends JPanel
{
    private JLabel label;
    private JRadioButton breakfastMenu;
    private JRadioButton lunchMenu;
    private JRadioButton dinnerMenu;
    private ButtonGroup bg;
    
    public Menu()
    {
        setLayout(new GridLayout(5, 1));
        //setBorder(BorderFactory.createTitledBorder("Choose a menu"));
        setBorder(BorderFactory.createLineBorder(Color.PINK, 3));
        
        label = new JLabel("Choose a menu:");
        breakfastMenu = new JRadioButton("Breakfast Menu", true);
        lunchMenu = new JRadioButton("Lunch Menu");
        dinnerMenu = new JRadioButton("Dinner Menu");  
        
        bg = new ButtonGroup();
        bg.add(breakfastMenu);
        bg.add(lunchMenu);
        bg.add(dinnerMenu);
        
        setBackground(Color.WHITE);
        label.setBackground(Color.WHITE);
        breakfastMenu.setBackground(Color.WHITE);
        lunchMenu.setBackground(Color.WHITE);
        dinnerMenu.setBackground(Color.WHITE);
        label.setForeground(Color.ORANGE);
        breakfastMenu.setForeground(Color.ORANGE);
        lunchMenu.setForeground(Color.ORANGE);
        dinnerMenu.setForeground(Color.ORANGE);
        
        add(label);
        add(breakfastMenu);
        add(lunchMenu);
        add(dinnerMenu);
    }
    public String getMenu() 
    {
        String m = " "; 
        
        if(breakfastMenu.isSelected())
        {
            m = "Menu: Breakfast";
        }
        else if(lunchMenu.isSelected())
        {
            m = "Menu: Lunch";
        }
        else if(dinnerMenu.isSelected())
        {
            m = "Menu: Dinner";
        }
        return m;
    }
}
