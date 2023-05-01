package r.drestaurant;
import javax.swing.*;  
import java.awt.*; 
import javax.swing.JOptionPane;
/**
 *
 * @author deemalsuoilme
 */
public class ContactInfo extends JPanel 
{
    JLabel label;
    JLabel name; 
    JLabel phoneNumber;
    JLabel email; 
    JTextField nameEntry;
    JTextField phoneNumberEntry;
    JTextField emailEntry;
    
    public ContactInfo()
    {
        setLayout(new GridLayout(7, 1));
        setBorder(BorderFactory.createLineBorder(Color.PINK, 3));
        
        label = new JLabel("Fill in contact information:");
        name = new JLabel("Name: ");
        phoneNumber = new JLabel("Phone Number: ");
        email = new JLabel("Email: ");
        nameEntry = new JTextField(50);
        phoneNumberEntry = new JTextField(10);
        emailEntry = new JTextField(50);
        
        setBackground(Color.WHITE);
        label.setBackground(Color.WHITE);
        name.setBackground(Color.WHITE);
        phoneNumber.setBackground(Color.WHITE);
        email.setBackground(Color.WHITE);
        label.setForeground(Color.ORANGE);
        name.setForeground(Color.ORANGE);
        nameEntry.setBackground(Color.WHITE);
        phoneNumber.setForeground(Color.ORANGE);
        phoneNumberEntry.setBackground(Color.WHITE);
        email.setForeground(Color.ORANGE);
        emailEntry.setBackground(Color.WHITE);
        
        add(label);
        add(name);
        add(nameEntry);
        add(phoneNumber);
        add(phoneNumberEntry);
        add(email);
        add(emailEntry);
    }
    public String getContactInfo()
    {
        String ci = " ";
        String n = " ";
        String ph = " ";
        String e = " ";
        
        n = JOptionPane.showInputDialog(nameEntry);
        ph = JOptionPane.showInputDialog(phoneNumberEntry);
        e = JOptionPane.showInputDialog(emailEntry);
        ci =  JOptionPane.showInputDialog("Name: " + n + "\nPhone number: " + ph + "\nEmail: " + e);
        return ci;
    }
    public String getCIException()
    {
        try
        {
            if(phoneNumberEntry.getText().length()!= 10)
            {
                throw new InvalidNumberException(); 
            }
        }
        catch(InvalidNumberException ine)
        {
            JOptionPane.showMessageDialog(null, ine);
        }
        return getCIException();
    }
}
