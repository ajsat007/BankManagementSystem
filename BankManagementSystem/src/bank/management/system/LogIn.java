package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class LogIn extends JFrame implements ActionListener {

    JLabel label1,label2,label3;
    JTextField textField1;
    JPasswordField passwordField2;
    JButton button1,button2,button3;
    LogIn(){
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon im1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image im2 = im1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon im3 = new ImageIcon(im2);
        JLabel images = new JLabel(im3);
        images.setBounds(630,380,100,100);
        add(images);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Railway",Font.BOLD,28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150,190,375,30);
        add(label2);

        textField1 = new JTextField(15);
        textField1.setBounds(325,190,230,30);
        textField1.setFont(new Font("Arial",Font.BOLD,14));
        add(textField1);


        label3 = new JLabel("PIN:");
        label3.setFont(new Font("Railway",Font.BOLD,28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150,250,375,30);
        add(label3);

        passwordField2 = new JPasswordField(15);
        passwordField2.setBounds(325,250,230,30);
        passwordField2.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField2);

        button1 = new JButton("Sign in");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(330,300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("Clear");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(450,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("Sign Up");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(330,350,220,30);
        button3.addActionListener(this);
        add(button3);


        ImageIcon bg = new ImageIcon(ClassLoader.getSystemResource("icon/bgImg.jpg"));
        Image bg2 = bg.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon bg3 = new ImageIcon(bg2);
        JLabel imageBg = new JLabel(bg3);
        imageBg.setBounds(0,0,850,480);
        add(imageBg);

        setLayout(null);
        setSize(850,480);
        setUndecorated(true);
        setLocation(250,100);
        setVisible(true);

    }
    public static void main(String[] args) {
        new LogIn();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
           if (e.getSource() == button1){
               Connn c = new Connn();
               String cardno = textField1.getText();
               String pin = passwordField2.getText();
               String q ="select * from login where card_number ='"+cardno+"' and pin = '"+pin+"'";
               ResultSet resultSet = c.statement.executeQuery(q);
               if (resultSet.next()){
                   setVisible(false);
                   new Main_Class(pin);
               }else {
                   JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
               }

           } else if (e.getSource() == button2) {
               textField1.setText("");
               passwordField2.setText("");
           }else if (e.getSource() == button3){
               new SignUp();
               setVisible(false);
           }
        }catch (Exception E){
            E.printStackTrace();
        }
    }
}
