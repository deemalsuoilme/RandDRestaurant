package r.drestaurant;
import javax.swing.*;  
import java.awt.*;
/**
 *
 * @author rahafalghamdi
 */
public class Dessert extends JFrame
{
    private JLabel label;
    private JRadioButton checkbox1;
    private JRadioButton checkbox2;
    private JRadioButton checkbox3;
    private JRadioButton checkbox4;
    private ButtonGroup bg;
    private JButton button;

    public Dessert()
    {
        setTitle("Celebration Dessert");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6,1));
        //setBorder(BorderFactory.createLineBorder(Color.PINK, 3));

        label= new JLabel("Choose a dessert:");
        
        checkbox1 = new JRadioButton("Donut" , true);
        
        checkbox2 = new JRadioButton("Chocolate truffle balls");
        
        checkbox3 = new JRadioButton("Ice creem");
        
        checkbox4 = new JRadioButton("Cake");
        
        JPanel panel = new JPanel();
        button = new JButton ("Done");
        
        bg = new ButtonGroup();
        bg.add(checkbox1);
        bg.add(checkbox2);
        bg.add(checkbox3);
        bg.add(checkbox4);
        
        
        setBackground(Color.WHITE);
        label.setBackground(Color.WHITE);
        checkbox1.setBackground(Color.WHITE);
        checkbox2.setBackground(Color.WHITE);
        checkbox3.setBackground(Color.WHITE);
        checkbox4.setBackground(Color.WHITE);
        button.setBackground(Color.PINK);
        label.setForeground(Color.ORANGE);
        checkbox1.setForeground(Color.ORANGE);
        checkbox2.setForeground(Color.ORANGE);
        checkbox3.setForeground(Color.ORANGE);
        checkbox4.setForeground(Color.ORANGE);
        panel.setBackground(Color.WHITE);
        
      
        add(label);
        add(checkbox1);
        add(checkbox2);
        add(checkbox3);
        add(checkbox4);
        panel.add(button, BorderLayout.CENTER);
        add(panel);
        setVisible(true);
    }
}

