package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;


public class Login_Page implements ActionListener {
    HashMap<String,String> logininfo = new HashMap<String,String>();

    JFrame frame = new JFrame("Kulja Sim Sim");


    JButton b1 = new JButton("Login");
    JButton b2= new JButton("Reset");
    JTextField t1 = new JTextField();
    JPasswordField p1 = new JPasswordField();
    JLabel l1= new JLabel("User Id :");
    JLabel l2 = new JLabel("Password :");
    JLabel l3 = new JLabel();
    Login_Page(HashMap<String,String> loginInfoOriginal){

        logininfo = loginInfoOriginal;
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(480,450);


        l1.setBounds(50,100,75,25);
        l2.setBounds(50,150,75,25);
        l3.setBounds(125,250,340,40);
        l3.setFont(new Font(null,Font.BOLD,25));
        t1.setBounds(125,100,200,25);
        p1.setBounds(125,150,200,25);

        b1.setBounds(125,200,100,25);
        b1.setFocusPainted(false);
        b1.addActionListener(this);

        b1.setBackground(Color.GRAY);

        b2.setBounds(225,200,100,25);
        b2.setFocusable(false);
        b2.addActionListener(this);

       b2.setBackground(Color.pink);


        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(t1);
        frame.add(p1);
        frame.add(b1);
        frame.add(b2);


        frame.setLayout(null);
        frame.setVisible(true);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource()==b2){
           t1.setText("");
           p1.setText("");
           Wellcome_Page wellcomePage = new Wellcome_Page();
       }
      if (e.getSource()==b1){
          String UserId= t1.getText();
          String password = String.valueOf(p1.getPassword());


          if (logininfo.containsKey(UserId)){
              if (logininfo.get(UserId).equals(password)){
                  l3.setForeground(Color.ORANGE);
                  l3.setText("Login Successful");
                  TikTakTo tikTakTo = new TikTakTo();
              }
              else{
                  l3.setForeground(Color.red);
                  l3.setText("Wrong Password Try Again");
              }
          }
          else {
              l3.setForeground(Color.red);
              l3.setText("UserName Not Found");
          }


       }

    }

}

