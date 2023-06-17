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





    }




    public static void main (String [] args) {
        new MyRestaurant();
    }
}
