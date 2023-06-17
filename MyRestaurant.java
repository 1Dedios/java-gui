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
        Contact = new JLabel("Contact");

        tfNumber = new JTextField();
        tfName = new JTextField();
        tfContact = new JTextField();

        Customer.setBounds();
        tfNumber.setBounds();
        Name.setBounds();
        tfName.setBounds();
        Contact.setBounds();
        tfContact.setBounds();

        getContentPane().add(Customer);
        getContentPane().add(tfNumber);
        getContentPane().add(Name);
        getContentPane().add(tfName);
        getContentPane().add(Contact);
        getContentPane().add(tfContact);






    }




    public static void main (String [] args) {
        new MyRestaurant();
    }
}
