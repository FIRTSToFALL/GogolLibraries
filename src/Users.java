import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public abstract class Users extends JFrame {


    private JTextField status = new JTextField("",5);
    private JTextField name = new JTextField("",5);
    private JTextField sname = new JTextField("", 5);
    private JTextField address = new JTextField("", 5);
    private JTextField phone = new JTextField("", 5);
    private JLabel lab0 = new JLabel("Status: ");
    private JLabel lab1 = new JLabel("Name:");
    private JLabel lab2 = new JLabel("Surname:");
    private JLabel lab3 = new JLabel("Adress:");
    private JLabel lab4 = new JLabel("Phone number:");
    private JButton button = new JButton("Ok");

    Users(){
        super("GLib");
        this.setBounds(100,100, 640,420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane(); //field for buttons;
        container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));

        container.add(lab0);
        container.add(status);

        container.add(lab1);
        container.add(name);

        container.add(lab2);
        container.add(sname);

        container.add(lab3);
        container.add(address);

        container.add(lab4);
        container.add(phone);

        button.addActionListener(new Event());
        container.add(button);

    }
    protected class Event implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "Status: " + status.getText() + "\n";
            message += "Name: " + name.getText() + "\n";
            message += "Surname: " + sname.getText() + "\n";
            message += "Address: " + address.getText() + "\n";
            message += "Phone: " + phone.getText();
            JOptionPane.showMessageDialog(null, message,"User Card", JOptionPane.PLAIN_MESSAGE);

        }
    }

}
