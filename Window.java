import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    Window() {
        setTitle("Cookie Clicker");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel screen = new JPanel();

        //setContentPane(screen);

        JLabel cookie = new JLabel("0");
        JLabel cookieLPer = new JLabel("0");

        ActionListener listener = new Counter(cookie,cookieLPer);

        setLayout(new BorderLayout());
        JPanel q = new JPanel();
        q.setLayout(new FlowLayout(FlowLayout.CENTER));
        add(q,BorderLayout.NORTH);
        q.add(cookie);

        q = new JPanel();
        q.setLayout(new FlowLayout(FlowLayout.CENTER));
        add(q,BorderLayout.CENTER);

        ImageIcon imgCookie = new ImageIcon("/home/macelai/IdeaProjects/Cookie-Clicker/src/cookie.jpg");
        JButton b = new JButton();
        b.setIcon(imgCookie);
        b.setBorder(null);
        q.add(b);
        b.addActionListener(listener);
        b.setActionCommand("ADD");

        q = new JPanel();
        q.setLayout(new FlowLayout(FlowLayout.TRAILING));
        add(q,BorderLayout.SOUTH);
        q.add(cookieLPer);


    }

}

