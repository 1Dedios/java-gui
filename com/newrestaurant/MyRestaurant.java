package com.newrestaurant;

import javax.swing.*;

public class MyRestaurant extends JFrame {
    JLabel customer;
    JLabel name;
    JLabel contact;
    JLabel food;
    JLabel drink;
    JLabel type;

    JTextField tfNumber;
    JTextField tfName;
    JTextField tfContact;

    JButton reset;
    JButton print;
    JButton receipt;

    JComboBox cb1;
    JComboBox cb2;


    JRadioButton r1;
    JRadioButton r2;

    JTextArea area1;
    JTextArea area2;

    public MyRestaurant() {
        setTitle("My Sophisticated Restaurant");
        setSize(700, 500);
        setLayout(null);

        customer = new JLabel("Customer No:");
        name = new JLabel("Name:");
        contact = new JLabel("Contact:");
        food = new JLabel("Foods:");
        drink = new JLabel("Drink:");
        type = new JLabel("Type:");

        tfNumber = new JTextField();
        tfName = new JTextField();
        tfContact = new JTextField();


        reset = new JButton("Reset");
        print = new JButton("Print");
        receipt = new JButton("Receipt");


        customer.setBounds(20, 50, 120, 30);
        tfNumber.setBounds(120, 50, 150, 30);

        name.setBounds(20, 80, 50, 30);
        tfName.setBounds(120, 80 , 150, 30);

        contact.setBounds(20, 110, 100, 30);
        tfContact.setBounds(120, 110, 150, 30);

        food.setBounds(20, 200, 120, 30);
        String[] foods = {"Pepperoni Pizza", "Salmon Roll", "Cheese Burger", "Penne a la Vodka" };
        cb1 = new JComboBox(foods);
        cb1.setBounds(100, 200, 160,30);


        drink.setBounds(20, 250, 120, 30);


        type.setBounds(20, 300, 120, 30);
        r1 = new JRadioButton("Diet");
        r2 = new JRadioButton("Regulars");
        r1.setBounds(100, 300, 60, 30);



        reset.setBounds(395, 100, 80, 40);
        print.setBounds(470, 100, 80, 40);
        receipt.setBounds(545, 100, 80, 40);


        getContentPane().add(customer);
        getContentPane().add(tfNumber);

        getContentPane().add(name);
        getContentPane().add(tfName);

        getContentPane().add(contact);
        getContentPane().add(tfContact);

        getContentPane().add(food);
        getContentPane().add(cb1);

        getContentPane().add(drink);

        getContentPane().add(type);
        getContentPane().add(r1);
        getContentPane().add(r2);


        getContentPane().add(reset);
        getContentPane().add(print);
        getContentPane().add(receipt);

        setVisible(true);
        setVisible(true);
        setVisible(true);
        setVisible(true);
        setVisible(true);
        setVisible(true);
        setVisible(true);
        setVisible(true);
        setVisible(true);
        setVisible(true);
        setVisible(true);
        setVisible(true);
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