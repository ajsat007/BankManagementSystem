package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.regex.Pattern;

public class SignUp extends JFrame implements ActionListener {
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L)+1000L;
    String first = " "+Math.abs(first4);

    JTextField textName,textMName,textLName,textEmail, textAdd,textCity,textPincode,textState ;
    JDateChooser dateChooser;
    JRadioButton r1,r2,m1,m2,m3;
   JComboBox msItem1;

   JButton next;
    SignUp(){
        super("Application Form");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);


        JLabel label1 = new JLabel("Application Form No."+first4);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Railway",Font.BOLD,38));
        label1.setForeground(Color.WHITE);
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Railway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        label2.setForeground(Color.WHITE);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Railway",Font.BOLD,22));
        label3.setBounds(290,100,600,30);
        label3.setForeground(Color.WHITE);
        add(label3);

        JLabel labelName = new JLabel("First Name: ");
        labelName.setFont(new Font("Railway",Font.BOLD,20));
        labelName.setBounds(100,150,200,30);
        labelName.setForeground(Color.WHITE);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Railway",Font.BOLD,14));
        textName.setBounds(270,150,400,30);
        add(textName);

        JLabel labelMname = new JLabel("Middle Name: ");
        labelMname.setFont(new Font("Railway",Font.BOLD,20));
        labelMname.setBounds(100,190,200,30);
        labelMname.setForeground(Color.WHITE);
        add(labelMname);

        textMName = new JTextField();
        textMName.setFont(new Font("Railway",Font.BOLD,14));
        textMName.setBounds(270,190,400,30);
        add(textMName);

        JLabel labelLname = new JLabel("Last Name: ");
        labelLname.setFont(new Font("Railway",Font.BOLD,20));
        labelLname.setBounds(100,230,200,30);
        labelLname.setForeground(Color.WHITE);
        add(labelLname);

        textLName = new JTextField();
        textLName.setFont(new Font("Railway",Font.BOLD,14));
        textLName.setBounds(270,230,400,30);
        add(textLName);

        JLabel DOB = new JLabel("Date of Birth: ");
        DOB.setFont(new Font("Railway",Font.BOLD,20));
        DOB.setBounds(100,270,200,30);
        DOB.setForeground(Color.WHITE);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(206, 240, 242));
        dateChooser.setBounds(270,270,100,30);
        add(dateChooser);

        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Railway",Font.BOLD,20));
        gender.setBounds(100,310,400,30);
        gender.setForeground(Color.WHITE);
        add(gender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Railway",Font.BOLD,14));
        r1.setForeground(Color.WHITE);
        r1.setBounds(270,310,60,30);
        r1.setOpaque(false);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Railway",Font.BOLD,14));
        r2.setForeground(Color.WHITE);
        r2.setOpaque(false);
        r2.setBounds(350,310,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel email = new JLabel("Email: ");
        email.setFont(new Font("Railway",Font.BOLD,20));
        email.setBounds(100,350,200,30);
        email.setForeground(Color.WHITE);
        add(email);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Railway",Font.BOLD,14));
        textEmail.setBounds(270,350,400,30);
        add(textEmail);

        JLabel ms = new JLabel("Marital status: ");
        ms.setFont(new Font("Railway",Font.BOLD,20));
        ms.setBounds(100,390,200,30);
        ms.setForeground(Color.WHITE);
        add(ms);

//        String[] mst ={" ","Single","Married", "Divorced"};
//       msItem1 = new JComboBox(mst);
//        msItem1.setFont(new Font("Railway",Font.BOLD,20));
//        msItem1.setBackground(new Color(206, 240, 242));
//        msItem1.setBounds(270,390,200,30);
//        add(msItem1);
        m1 = new JRadioButton("Single");
        m1.setFont(new Font("Railway",Font.BOLD,14));
        m1.setOpaque(false);
        m1.setForeground(Color.WHITE);
        m1.setBounds(270,390,100,30);
        add(m1);

        m2 = new JRadioButton("Married");
        m2.setFont(new Font("Railway",Font.BOLD,14));
        m2.setForeground(Color.WHITE);
        m2.setOpaque(false);
        m2.setBounds(380,390,100,30);
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setFont(new Font("Railway",Font.BOLD,14));
        m3.setForeground(Color.WHITE);
        m3.setOpaque(false);
        m3.setBounds(500,390,100,30);
        add(m3);


        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Railway",Font.BOLD,20));
        address.setBounds(100,430,200,30);
        address.setForeground(Color.WHITE);
        add(address);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Railway",Font.BOLD,14));
        textAdd.setBounds(270,430,400,30);
        add(textAdd);

        JLabel city= new JLabel("City: ");
        city.setFont(new Font("Railway",Font.BOLD,20));
        city.setBounds(100,470,200,30);
        city.setForeground(Color.WHITE);
        add(city);

        textCity = new JTextField();
        textCity.setFont(new Font("Railway",Font.BOLD,14));
        textCity.setBounds(270,470,400,30);
        add(textCity);

        JLabel pincode= new JLabel("Pin Code: ");
        pincode.setFont(new Font("Railway",Font.BOLD,20));
        pincode.setBounds(100,510,200,30);
        pincode.setForeground(Color.WHITE);
        add(pincode);

        textPincode = new JTextField();
        textPincode.setFont(new Font("Railway", Font.BOLD, 14));
        textPincode.setBounds(270, 510, 400, 30);
        add(textPincode);

        JLabel state= new JLabel("State: ");
        state.setFont(new Font("Railway",Font.BOLD,20));
       state.setBounds(100,550,200,30);
        state.setForeground(Color.WHITE);
        add(state);

        textState = new JTextField();
        textState.setFont(new Font("Railway", Font.BOLD, 14));
        textState.setBounds(270, 550, 400, 30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Railway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,600,80,30);
        next.addActionListener(this);
        add(next);

        ImageIcon bg = new ImageIcon(ClassLoader.getSystemResource("icon/signup.jpg"));
        Image bg2 = bg.getImage().getScaledInstance(850,700, Image.SCALE_DEFAULT);
        ImageIcon bg3 = new ImageIcon(bg2);
        JLabel imageBg = new JLabel(bg3);
        imageBg.setBounds(0,0,850,700);
        add(imageBg);

//        getContentPane().setBackground(new Color(96, 124, 138));
        setLayout(null);
        setSize(750,1200);
        setLocation(250,5);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignUp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String mname = textMName.getText();
        String lname = textLName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()){
            gender ="Male";
        }else if (r2.isSelected()){
            gender ="Female";
        }
        String email= textEmail.getText();
        String marital = null;
        if (m1.isSelected()){
            marital ="Single";
        } else if (m2.isSelected()) {
            marital ="Married";
        }else {
            marital ="Divorced";
        }

        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPincode.getText();
        String state = textState.getText();

        try {
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Connn c = new Connn();
                String q = "insert into signup values('"+formno+"', '"+name+"','"+mname+"','"+lname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"', '"+address+"', '"+city+"','"+pincode+"','"+state+"' )";
                c.statement.executeUpdate(q);
                new SignUp2(formno);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }
}
