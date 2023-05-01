package r.drestaurant;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author deemalsuoilme and rahafalghamdi
 */
public class RDRestaurant extends JFrame
{
    private Greeting g;
    private ContactInfo ci;
    private Table t;
    private CelebrationTable ct;
    private Menu m;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    FileWriter filewriter;
    
    public RDRestaurant()
    {
        setLayout(new BorderLayout()); 
        setTitle("R&D Restaurant");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel1 = new JPanel(); 
        panel2 = new JPanel(); 
        panel3 = new JPanel(); 
        g = new Greeting();
        ci = new ContactInfo();
        t = new Table();
        ct = new CelebrationTable();
        m = new Menu();
        button1 = new JButton("Proceed");
        button2 = new JButton("View Booking");
        button3 = new JButton("Exit");
        
        panel1.setBackground(Color.WHITE);
        panel2.setBackground(Color.WHITE);
        panel3.setBackground(Color.WHITE);
        button1.setBackground(Color.PINK);
        button2.setBackground(Color.PINK);
        button3.setBackground(Color.PINK);
        
        panel1.add(g, BorderLayout.WEST);
        panel1.add(ci, BorderLayout.CENTER);
        panel2.add(t, BorderLayout.WEST);
        panel2.add(m, BorderLayout.CENTER);
        panel2.add(ct, BorderLayout.EAST);
        panel3.add(button1, BorderLayout.WEST);
        panel3.add(button2, BorderLayout.CENTER);
        panel3.add(button3, BorderLayout.EAST);
        
        button1.addActionListener(new Button1Listener());
        button3.addActionListener(new Button3Listener());
        
        
        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
        add(panel3, BorderLayout.SOUTH);
        
        pack();
        setVisible(true);
    }
    private class Button1Listener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            try 
            {
                ContactInfo ci = new ContactInfo();
                ci.getCIException();
                dispose();
                Reservation r = new Reservation();
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(RDRestaurant.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    private class Button3Listener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
          System.exit(0);  
        }
    }
    
    public static void main(String[] args)
    {
        new RDRestaurant();
    }
}
