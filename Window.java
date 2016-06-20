import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class Window extends JFrame {
    Window() {
        setTitle("Cookie Clicker");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel cookie = new JLabel("0 Cookies");
        cookie.setFont(new Font("Monospace", Font.BOLD, 16));
        JLabel cookieLPer = new JLabel("0 Cookies/s");
        cookieLPer.setFont(new Font("Monospace", Font.BOLD, 12));

        Counter counter = new Counter(cookie,cookieLPer);

        setLayout(new BorderLayout());
        JPanel q1 = new JPanel();
        q1.setLayout(new FlowLayout(FlowLayout.CENTER));
        add(q1,BorderLayout.NORTH);
        q1.add(cookie);
        q1.setBackground(Color.white);

        //panel do cookie grande
        JPanel q2 = new JPanel();
        q2.setLayout(new FlowLayout(FlowLayout.CENTER));
        add(q2,BorderLayout.CENTER);
        ImageIcon imgCookie = new ImageIcon("/home/macelai/IdeaProjects/Cookie-Clicker/src/cookie.jpg");
        JButton b = new JButton();
        b.setIcon(imgCookie);
        b.setBorder(null);
        q2.add(b);
        b.addActionListener(counter);
        b.setActionCommand("ADD");
        q2.setBackground(Color.white);

        JPanel q3 = new JPanel();
        q3.setLayout(new GridLayout(9,0));
        add(q3, BorderLayout.AFTER_LINE_ENDS);
        q3.setBackground(Color.white);

        //configuração dos botões de compra
        JButton b1 = new JButton();
        ImageIcon imgCursor = new ImageIcon("/home/macelai/IdeaProjects/Cookie-Clicker/src/CursorIcon.png");
        b1.setIcon(imgCursor);
        b1.setBorder(null);
        q3.add(b1);
        b1.addActionListener(counter);
        b1.setActionCommand("CURSOR");

        JButton b2 = new JButton();
        ImageIcon imgGrandma = new ImageIcon("/home/macelai/IdeaProjects/Cookie-Clicker/src/GrandmaIcon.png");
        b2.setIcon(imgGrandma);
        b2.setBorder(null);
        q3.add(b2);
        b2.addActionListener(counter);
        b2.setActionCommand("GRANDMA");

        JButton b3 = new JButton();
        ImageIcon imgFarm = new ImageIcon("/home/macelai/IdeaProjects/Cookie-Clicker/src/FarmIcon.png");
        b3.setIcon(imgFarm);
        b3.setBorder(null);
        q3.add(b3);
        b3.addActionListener(counter);
        b3.setActionCommand("FARM");

        JButton b4 = new JButton();
        ImageIcon imgMine = new ImageIcon("/home/macelai/IdeaProjects/Cookie-Clicker/src/MineIcon.png");
        b4.setIcon(imgMine);
        b4.setBorder(null);
        q3.add(b4);
        b4.addActionListener(counter);
        b4.setActionCommand("MINE");

        JButton b7 = new JButton();
        ImageIcon imgFactory = new ImageIcon("/home/macelai/IdeaProjects/Cookie-Clicker/src/FactoryIcon.png");
        b7.setIcon(imgFactory);
        b7.setBorder(null);
        q3.add(b7);
        b7.addActionListener(counter);
        b7.setActionCommand("FACTORY");

        JButton b5 = new JButton();
        ImageIcon imgBank = new ImageIcon("/home/macelai/IdeaProjects/Cookie-Clicker/src/BankIcon.png");
        b5.setIcon(imgBank);
        b5.setBorder(null);
        q3.add(b5);
        b5.addActionListener(counter);
        b5.setActionCommand("BANK");

        JButton b6 = new JButton();
        ImageIcon imgTemple = new ImageIcon("/home/macelai/IdeaProjects/Cookie-Clicker/src/Temple.png");
        b6.setIcon(imgTemple);
        b6.setBorder(null);
        q3.add(b6);
        b6.addActionListener(counter);
        b6.setActionCommand("TEMPLE");

        JButton b8 = new JButton();
        ImageIcon imgShipment = new ImageIcon("/home/macelai/IdeaProjects/Cookie-Clicker/src/Shipment.png");
        b8.setIcon(imgShipment);
        b8.setBorder(null);
        q3.add(b8);
        b8.addActionListener(counter);
        b8.setActionCommand("SHIPMENT");

        JButton b9 = new JButton();
        ImageIcon imgTimeMachine = new ImageIcon("/home/macelai/IdeaProjects/Cookie-Clicker/src/TimeMachine.png");
        b9.setIcon(imgTimeMachine);
        b9.setBorder(null);
        q3.add(b9);
        b9.addActionListener(counter);
        b9.setActionCommand("TIMEMACHINE");

        JPanel q4 = new JPanel();
        q4.setLayout(new FlowLayout(FlowLayout.TRAILING));
        add(q4,BorderLayout.SOUTH);
        q4.add(cookieLPer);
        q4.setBackground(Color.white);

        //atualização label e cookies
        counter.att();
        counter.att1();
    }

}

