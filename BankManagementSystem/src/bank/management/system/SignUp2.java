package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SignUp2 extends JFrame implements ActionListener {
    String formno;
    JComboBox comboBox,  comboBox2, comboBox3, comboBox4,  comboBox5;
    JTextField textPan,textAadhar;
    JRadioButton r1,r2,e1,e2;
    JButton next;

    SignUp2(String formno){
        super("Application Form");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);
        this.formno = formno;


        JLabel l1 = new JLabel("Page 2: ");
        l1.setFont(new Font("Railway",Font.BOLD,22));
        l1.setForeground(Color.WHITE);
        l1.setBounds(330,40,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Railway",Font.BOLD,22));
        l2.setForeground(Color.WHITE);
        l2.setBounds(270,70,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion: ");
        l3.setFont(new Font("Railway",Font.BOLD,18));
        l3.setForeground(Color.WHITE);
        l3.setBounds(100,150,100,30);
        add(l3);

        String religion[] ={" ","Hindu","Muslim","Sikh","Cristian","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setFont(new Font("Railway",Font.BOLD,14));
        comboBox.setBounds(270,150,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Raleway", Font.BOLD,18));
        l4.setBounds(100,190,100,30);
        l4.setForeground(Color.WHITE);
        add(l4);

        String Category [] = {" ","General","OBC","SC", "ST", "Other"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(270,190,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Raleway", Font.BOLD,18));
        l5.setForeground(Color.WHITE);
        l5.setBounds(100,240,100,30);
        add(l5);

        String income [] = {" ","<1,50,000","<2,50,000", "5,00,000", "Upto 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(270,240,320,30);

        add(comboBox3);

        JLabel l6 = new JLabel("Educational : ");
        l6.setFont(new Font("Raleway", Font.BOLD,18));
        l6.setBounds(100,280,150,30);
        l6.setForeground(Color.WHITE);
        add(l6);

        String educational [] = {" ","Non-Graduate","Graduate","Post-Graduate", "Doctrate", "Others"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(270,280,320,30);
        add(comboBox4);


        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway", Font.BOLD,18));
        l7.setBounds(100,320,150,30);
        l7.setForeground(Color.WHITE);
        add(l7);

        String Occupation [] = {" ","Salaried","Self-Employed","Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(270,320,320,30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN Number : ");
        l8.setFont(new Font("Railway", Font.BOLD,18));
        l8.setBounds(100,360,150,30);
        l8.setForeground(Color.WHITE);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Railway", Font.BOLD,18));
        textPan.setBounds(270,360,320,30);
        add(textPan);

        JLabel l9 = new JLabel("Aadhar Number : ");
        l9.setFont(new Font("Railway", Font.BOLD,18));
        l9.setBounds(100,400,180,30);
        l9.setForeground(Color.WHITE);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Railway", Font.BOLD,18));
        textAadhar.setBounds(270,400,320,30);
        add(textAadhar);


        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Railway", Font.BOLD,18));
        l10.setBounds(100,440,180,30);
        l10.setForeground(Color.WHITE);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Railway", Font.BOLD,14));
        r1.setFont(new Font("Railway",Font.BOLD,16));
        r1.setOpaque(false);
        r1.setBounds(270,440,100,30);
        r1.setForeground(Color.WHITE);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Railway",Font.BOLD,16));
        r2.setOpaque(false);
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(360,440,100,30);
        r2.setForeground(Color.WHITE);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Railway", Font.BOLD,18));
        l11.setBounds(100,480,180,30);
        l11.setForeground(Color.WHITE);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Railway", Font.BOLD,16));
        e1.setOpaque(false);
        e1.setForeground(Color.WHITE);
        e1.setBounds(270,480,100,30);
        add(e1);
        e2 = new JRadioButton("No");
        e2.setFont(new Font("Railway", Font.BOLD,16));
       e2.setOpaque(false);
       e2.setForeground(Color.WHITE);
        e2.setBounds(360,480,100,30);
        add(e2);



        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(e1);
        buttonGroup1.add(e2);


        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Railway", Font.BOLD,14));
        l12.setBounds(600,3,100,30);
        l12.setForeground(Color.WHITE);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Railway", Font.BOLD,14));
        l13.setBounds(670,3,60,30);
        l13.setForeground(Color.WHITE);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Railway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(570,540,100,30);
        next.addActionListener(this);
        add(next);

        ImageIcon bg = new ImageIcon(ClassLoader.getSystemResource("icon/signup2.jpg"));
        Image bg2 = bg.getImage().getScaledInstance(850,700, Image.SCALE_DEFAULT);
        ImageIcon bg3 = new ImageIcon(bg2);
        JLabel imageBg = new JLabel(bg3);
        imageBg.setBounds(0,0,850,700);
        add(imageBg);

        setLayout(null);
        setSize(750,1200);
        setLocation(250,5);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignUp2(" ");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String aadhar = textAadhar.getText();

        String citizen = " ";
        if ((r1.isSelected())){
            citizen = "Yes";
        } else if (r2.isSelected()) {
            citizen ="No";
        }
        String eAccount = " ";
        if ((r1.isSelected())){
            eAccount = "Yes";
        } else if (r2.isSelected()) {
            eAccount ="No";
        }

        try{
            if (textPan.getText().equals("") || textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Connn c = new Connn();
                String q = "insert into Signuptwo values('"+formno+"', '"+rel+"', '"+cate+"','"+inc+"','"+edu+"','"+occ+"','"
                        +pan+"','"+aadhar+"','"+citizen+"','"+eAccount+"')";
                c.statement.executeUpdate(q);
                new SignUp3(formno);
                setVisible(false);
            }


        }catch (Exception E){
            E.printStackTrace();
        }

    }
}
