package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp3 extends JFrame implements ActionListener {
    String formno;
    JRadioButton r1, r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;

     SignUp3(String formno) {
         this.formno = formno;
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
         Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(25,10,100,100);
         add(image);

         JLabel l1= new JLabel("Page 3: ");
         l1.setFont(new Font("Railway",Font.BOLD,22));
         l1.setForeground(Color.WHITE);
         l1.setBounds(330,40,400,40);
         add(l1);

         JLabel l2= new JLabel("Account Details: ");
         l2.setFont(new Font("Railway",Font.BOLD,22));
         l2.setForeground(Color.WHITE);
         l2.setBounds(280,70,400,40);
         add(l2);

         JLabel l3= new JLabel("Account Type: ");
         l3.setFont(new Font("Railway",Font.BOLD,18));
         l3.setForeground(Color.WHITE);
         l3.setBounds(100,120,400,40);
         add(l3);

         r1 = new JRadioButton("Saving Account");
         r1.setFont(new Font("Railway",Font.BOLD,16));
         r1.setBounds(100,150,250,30);
         r1.setOpaque(false);
         r1.setForeground(Color.WHITE);
         add(r1);

         r2 = new JRadioButton("Current Account");
         r2.setFont(new Font("Railway",Font.BOLD,16));
         r2.setBounds(350,150,250,30);
         r2.setOpaque(false);
         r2.setForeground(Color.WHITE);
         add(r2);

         r3 = new JRadioButton("Fixed Deposit Account");
         r3.setFont(new Font("Railway",Font.BOLD,16));
         r3.setBounds(100,180,250,30);
         r3.setOpaque(false);
         r3.setForeground(Color.WHITE);
         add(r3);

         r4 = new JRadioButton("Recurring Deposit Account");
         r4.setFont(new Font("Railway",Font.BOLD,16));
         r4.setBounds(350,180,300,30);
         r4.setOpaque(false);
         r4.setForeground(Color.WHITE);
         add(r4);

         ButtonGroup buttonGroup = new ButtonGroup();
         buttonGroup.add(r1);
         buttonGroup.add(r2);
         buttonGroup.add(r3);
         buttonGroup.add(r4);

         JLabel l4 = new JLabel("Card Number: ");
         l4.setFont(new Font("Railway",Font.BOLD,18));
         l4.setBounds(100,220,400,40);
         l4.setForeground(Color.WHITE);
         add(l4);

         JLabel l5 = new JLabel("(Your 16-digit Card Number)");
         l5.setFont(new Font("Railway",Font.BOLD,12));
         l5.setBounds(100,250,200,20);
         l5.setForeground(Color.WHITE);
         add(l5);

         JLabel l6 = new JLabel("XXXX-XXXX-XXXX-6168 ");
         l6.setFont(new Font("Railway",Font.BOLD,18));
         l6.setBounds(330,220,400,40);
         l6.setForeground(Color.WHITE);
         add(l6);

         JLabel l7 = new JLabel("It would appear on atm card/cheque Book and Statements.");
         l7.setFont(new Font("Railway",Font.BOLD,12));
         l7.setBounds(330,250,400,20);
         l7.setForeground(Color.WHITE);
         add(l7);

         JLabel l8= new JLabel("PIN: ");
         l8.setFont(new Font("Railway",Font.BOLD,18));
         l8.setBounds(100,280,400,40);
         l8.setForeground(Color.WHITE);
         add(l8);

         JLabel l9= new JLabel("XXXX");
         l9.setFont(new Font("Railway",Font.BOLD,18));
         l9.setBounds(330,280,200,40);
         l9.setForeground(Color.WHITE);
         add(l9);

         JLabel l10 = new JLabel("(4-digit Password)");
         l10.setFont(new Font("Railway",Font.BOLD,12));
         l10.setBounds(100,310,200,20);
         l10.setForeground(Color.WHITE);
         add(l10);

         JLabel l11= new JLabel("Services Required: ");
         l11.setFont(new Font("Railway",Font.BOLD,18));
         l11.setBounds(100,350,400,40);
         l11.setForeground(Color.WHITE);
         add(l11);

         c1= new JCheckBox("ATM Card");
         c1.setFont(new Font("Railway",Font.BOLD,14));
         c1.setBackground(new Color(222, 255, 228));
         c1.setBounds(100,380,200,30);
         c1.setOpaque(false);
         c1.setForeground(Color.WHITE);
         add(c1);

         c2 = new JCheckBox("Net Banking");
         c2.setFont(new Font("Railway",Font.BOLD,14));
         c2.setBounds(300,380,200,30);
         c2.setBackground(new Color(222,255,228));
         c2.setOpaque(false);
         c2.setForeground(Color.WHITE);
         add(c2);

         c3 = new JCheckBox("Email Alert");
         c3.setFont(new Font("Railway",Font.BOLD,14));
         c3.setBounds(100, 420,200,30);
         c3.setBackground(new Color(222,255,228));
         c3.setOpaque(false);
         c3.setForeground(Color.WHITE);
         add(c3);

         c4 =new JCheckBox("Mobile Banking");
         c4.setFont(new Font("Railway",Font.BOLD,14));
         c4.setBounds(300,420,200,30);
         c4.setBackground(new Color(222,255,228));
         c4.setOpaque(false);
         c4.setForeground(Color.WHITE);
         add(c4);

         c5 = new JCheckBox("Cheque Book");
         c5.setFont(new Font("Railway",Font.BOLD,14));
         c5.setBounds(100,460,200,30);
         c5.setBackground(new Color(222,255,228));
         c5.setOpaque(false);
         c5.setForeground(Color.WHITE);
         add(c5);

         c6 = new JCheckBox("E-Statement");
         c6.setFont(new Font("Railway",Font.BOLD,14));
         c6.setBounds(300,460,200,30);
         c6.setBackground(new Color(222,255,228));
         c6.setOpaque(false);
         c6.setForeground(Color.WHITE);
         add(c6);

         JCheckBox c7 = new JCheckBox("I here by declare that the above details are correct to the best of my knowledge.",true);
         c7.setFont(new Font("Railway",Font.BOLD,12));
         c7.setBounds(100,500,600,30);
         c7.setOpaque(false);
         c7.setForeground(Color.WHITE);
         add(c7);


         JLabel l12 = new JLabel("Form No.:");
         l12.setFont(new Font("Railway",Font.BOLD,14));
         l12.setBounds(570,10,100,30);
         l12.setForeground(Color.WHITE);
         add(l12);
         JLabel l13 = new JLabel(formno);
         l13.setFont(new Font("Railway",Font.BOLD,14));
         l13.setBounds(650,10,60,30);
         l13.setForeground(Color.WHITE);
         add(l13);

         s= new JButton("Submit");
         s.setFont(new Font("Railway",Font.BOLD,14));
         s.setBackground(Color.GREEN);
         s.setForeground(Color.WHITE);
         s.setBounds(260,550,100,30);
         s.addActionListener(this);
         add(s);

         c= new JButton("Cancel");
         c.setFont(new Font("Railway",Font.BOLD,14));
         c.setBounds(370,550,100,30);
         c.setBackground(Color.RED);
         c.setForeground(Color.WHITE);
         c.addActionListener(this);
         add(c);


         getContentPane().setBackground(new Color(0,0,0));
         setLayout(null);
         setSize(750,1200);
         setLocation(250,5);
         setUndecorated(true);
         setVisible(true);
    }

    public static void main(String[] args) {

        new SignUp3(" ");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         String atype =null;
         if (r1.isSelected()){
             atype ="Saving Account";
         } else if (r2.isSelected()) {
             atype="Current Account";
         } else if (r3.isSelected()) {
             atype ="Fixed Deposit Account";
         }else {
             atype="Recurring Deposit Account";
         }
        Random ran = new Random();
         long first7 = (ran.nextLong()% 90000000L)+1409963000000000L;
         String cardno =" "+Math.abs(first7);

         long first3 =  (ran.nextLong()%9000L)+1000L;
         String pin = " "+Math.abs(first3);

        String fac ="";
        if(c1.isSelected()){
            fac +="ATM Card";
        } else if (c2.isSelected()) {
           fac+=  "Net Banking";
        } else if (c3.isSelected()) {
            fac += "Email Alert";
        } else if (c4.isSelected()) {
            fac+= "Mobile Banking";
        } else if (c5.isSelected()) {
            fac += "Cheque Book";
        }else {
            fac+= "E-Statement";
        }
        try {
            if (e.getSource()==s){
                if (atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }else {
                    Connn c1 = new Connn();
                    String q1 = "insert into signupthree values('"+formno+"', '"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin );
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==c) {
                System.exit(0);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }
}
