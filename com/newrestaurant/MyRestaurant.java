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
    JTextField tfFood;
    JTextField tfDrink;
    JTextField tfType;
    JButton reset;
    JButton print;
    JButton receipt;

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
        tfDrink = new JTextField();
        tfType = new JTextField();

        customer.setBounds(20, 50, 120, 30);
        tfNumber.setBounds(120, 50, 150, 30);

        name.setBounds(20, 80, 50, 30);
        tfName.setBounds(120, 80 , 150, 30);

        contact.setBounds(20, 110, 100, 30);
        tfContact.setBounds(120, 110, 150, 30);

        food.setBounds(20, 200, 120, 30);
        //tfFood.setBounds(0, 140, 150, 30);

        drink.setBounds(20, 250, 120, 30);
        //tfDrink.setBounds(120, 170, );

        type.setBounds(20, 300, 120, 30);
        //tfType.setBounds(120, 200, 30);

        reset = new JButton("Reset");
        reset.setBounds(400, 100, 80, 40);


        getContentPane().add(customer);
        getContentPane().add(tfNumber);

        getContentPane().add(name);
        getContentPane().add(tfName);

        getContentPane().add(contact);
        getContentPane().add(tfContact);

        getContentPane().add(food);
        //getContentPane().add(tfFood);

        getContentPane().add(drink);
        getContentPane().add(tfDrink);

        getContentPane().add(type);
        getContentPane().add(tfType);

        getContentPane().add(reset);

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
