package r.drestaurant; 
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author rahafalghamdi
 */
public class Reservation extends JPanel
{
    private JLabel label;
    private JButton button;
    private JPanel panel;
    
    public Reservation()throws IOException
    {
        setLayout(new GridLayout(3,1));
        setBorder(BorderFactory.createLineBorder(Color.PINK, 3));
        
        ContactInfo ci = new ContactInfo();
        Menu m = new Menu();
        Table t = new Table();
        CelebrationTable ct = new CelebrationTable();
        PrintWriter pw = new PrintWriter("Reservation.txt");
        pw.print(ci.getContactInfo());
        pw.print(m.getMenu());
        pw.print(t.getTable());
        pw.print(ct.getCelebrationTable());
        pw.close();
        File f = new File("Reservation.txt");
        Scanner scan = new Scanner(f);
        while(scan.hasNext())
        {
            String str = scan.nextLine();
            label = new JLabel(str);
        }
        scan.close();

        button = new JButton("Done");
        panel = new JPanel();
        panel.add(button, BorderLayout.CENTER);
        
        setBackground(Color.WHITE);
        label.setBackground(Color.WHITE);
        label.setForeground(Color.ORANGE);
        button.setBackground(Color.PINK);
        panel.setBackground(Color.WHITE);
        
        add(panel);
    }
}

