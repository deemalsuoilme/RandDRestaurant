package r.drestaurant;
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author deemalsuoilme
 */
public class CelebrationTable extends JPanel
{
    private JLabel label;
    private JRadioButton yes;
    private JRadioButton no;
    private JButton button;
    private ButtonGroup bg; 
    private JLabel notice;
    
    public CelebrationTable()
    {
        setLayout(new GridLayout(5, 1));
        setBorder(BorderFactory.createLineBorder(Color.PINK, 3));
        
        label = new JLabel("Include a celebration table:");
        yes = new JRadioButton("Yes", true);
        no = new JRadioButton("No");
        button = new JButton("Pick a dessert");
        notice = new JLabel("(celebration fees will be added to bill)");
        
        bg = new ButtonGroup();
        bg.add(yes);
        bg.add(no);
        
        setBackground(Color.WHITE);
        label.setBackground(Color.WHITE);
        yes.setBackground(Color.WHITE);
        no.setBackground(Color.WHITE);
        notice.setBackground(Color.WHITE);
        label.setForeground(Color.ORANGE);
        yes.setForeground(Color.ORANGE);
        no.setForeground(Color.ORANGE);
        notice.setForeground(Color.PINK);
        button.setBackground(Color.PINK);
        
        add(label);
        add(yes);
        add(no);
        add(button);
        add(notice);
    }
    public String getCelebrationTable() 
    {
        String ct = " ";
        if(yes.isSelected())
        {
            ct = "Celebration table: Included";
        }
        else if(no.isSelected())
        {
            ct = "Celebration table: Not included";
        }
        return ct;
    }
    private class ButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            if(yes.isSelected())
            {
                Dessert dessert = new Dessert();
            }
        } 
    }
}
