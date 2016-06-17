import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter implements ActionListener {
    private int cookie = 0;
    private int cookiePer = 0;
    private JLabel cookieLabel;
    private JLabel cookieLPer;
    Counter(JLabel cookieLabel, JLabel cookieLPer){
        this.cookieLabel=cookieLabel;
        this.cookieLPer=cookieLPer;
    }

    void addCokie(){
        cookie++;
    }
    void attCookie(){
        cookieLabel.setText(""+cookie);
        cookieLPer.setText(""+cookieLPer);
    }
    void attCookiePer(int multi){
        cookiePer=cookiePer+multi;
    }


    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();
        if (cmd.equals("ADD")){
            addCokie();
        }
        attCookie();
    }
}


