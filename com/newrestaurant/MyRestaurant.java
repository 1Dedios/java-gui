package com.newrestaurant;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;

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

    public MyRestaurant() {
        setTitle("My Sophisticated Restaurant");
        setSize(700, 650);
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
        String[] drinks = {"Lemonade", "Raspberry Iced Tea", "Pink Lemonade", "Signature House Drink"};
        cb2 = new JComboBox(drinks);
        cb2.setBounds(100, 250, 160, 30);


        type.setBounds(20, 300, 120, 30);
        r1 = new JRadioButton("Diet");
        r2 = new JRadioButton("Regular");
        r1.setBounds(100, 300, 60, 30);
        r2.setBounds(170, 300,100, 30);
        // ButtonGroup class to avoid two radio button selections
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);



        reset.setBounds(395, 100, 80, 40);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfNumber.setText("");
                tfContact.setText("");
                tfName.setText("");
                area1.setText("");
            }
        });

        receipt.setBounds(470, 100, 80, 40);
        receipt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area1.setText("My Sophisticated Restaurant\n");
                area1.setText(area1.getText() + "\n" + "Customer No: " +
                        tfNumber.getText() + "\n" + "Name: " +
                        tfName.getText() + "\n" + "Contact: " +
                        tfContact.getText());
                area1.setText(area1.getText() + "\n" + "\nFood: " + cb1.getSelectedItem() + "\nDrink: " + cb2.getSelectedItem() + "\nType: " + bg.toString());
            }
        });

        print.setBounds(545, 100, 80, 40);
        print.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    area1.print();
                } catch (PrinterException example) {
                    System.out.println(example.getMessage());
                }
            }
        });

        area1 = new JTextArea();
        area1.setBounds(395, 150, 240, 300);


        getContentPane().add(customer);
        getContentPane().add(tfNumber);

        getContentPane().add(name);
        getContentPane().add(tfName);

        getContentPane().add(contact);
        getContentPane().add(tfContact);

        getContentPane().add(food);
        getContentPane().add(cb1);

        getContentPane().add(drink);
        getContentPane().add(cb2);

        getContentPane().add(type);
        getContentPane().add(r1);
        getContentPane().add(r2);


        getContentPane().add(reset);
        getContentPane().add(print);
        getContentPane().add(receipt);
        getContentPane().add(area1);

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
        setVisible(true);
        setVisible(true);







    }
    public static void main (String [] args) {
        new MyRestaurant();
    }
}
