import javax.swing.*;

public class MyRestaurant extends JFrame {
    JLabel Customer, Name, Contact;
    JTextField tfNumber, tfName, tfContact;

    public MyRestaurant() {
        setTitle("My Sophisticated Restaurant");
        setSize(600, 500);
        setLayout(null);

        Customer = new JLabel("Customer No:");
        Name = new JLabel("Name:");
        Contact = new JLabel("Contact:");

        tfNumber = new JTextField();
        tfName = new JTextField();
        tfContact = new JTextField();

        Customer.setBounds(20, 50, 120, 30);
        tfNumber.setBounds(120, 50, 150, 30);
        Name.setBounds(20, 80, 50, 30);
        tfName.setBounds(120, 80 , 150, 30);
        Contact.setBounds(20, 110, 100, 30);
        tfContact.setBounds(120, 110, 150, 30);

        getContentPane().add(Customer);
        getContentPane().add(tfNumber);
        getContentPane().add(Name);
        getContentPane().add(tfName);
        getContentPane().add(Contact);
        getContentPane().add(tfContact);

        setVisible(true);
        setVisible(true);
        setVisible(true);
        setVisible(true);
        setVisible(true);
        setVisible(true);







    }




    public static void main (String [] args) {
        new MyRestaurant();
    }
}
