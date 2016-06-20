import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class Counter implements ActionListener {
    private double cookie = 0;
    private double cookiePer = 0, priceCursor = 10, priceGrandMa = 100, priceFarm = 1000, priceMine  = 10000, priceFactory = 100000;
    private double priceBank = 1000000, priceTemple = 10000000, priceShipment = 100000000, priceTimeMachine = 1000000000;
    private int numberCursor = 0, numberGrandMa = 0, numberFarm = 0, numberMine = 0, numberFactory = 0, numberBank = 0, numberTemple =0;
    private int numberShipment = 0, numberTimeMachine = 0;
    private JLabel cookieLabel;
    private JLabel cookieLPer;
    Counter(JLabel cookieLabel, JLabel cookieLPer){
        this.cookieLabel=cookieLabel;
        this.cookieLPer=cookieLPer;
    }
    Timer timer = new Timer();

    void addCokie(){
        cookie++;
    }

    void attCookie(){
        cookie=cookie+cookiePer/100;
    }
    void attLabel(){
        String cookieFormat = String.format("%.0f", cookie);
        String cookiePerFormat = String.format("%.2f", cookiePer);
        cookieLabel.setText(cookieFormat +" Cookies");
        cookieLPer.setText(cookiePerFormat+" Cookies/s");
    }

    public void att(){
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                attCookie();
            }
        },0,10);
    }
    public void att1(){
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                attLabel();
            }
        },1,1);
    }


    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();
        if (cmd.equals("ADD")){
            addCokie();
        } else
        if (cmd.equals("CURSOR")) {
            if(cookie>=priceCursor){
                cookie=cookie-priceCursor;
                priceCursor=priceCursor*(1.1);
                cookiePer=cookiePer+1;
                numberCursor++;
            }
        } else
        if (cmd.equals("GRANDMA")){
            if(cookie >= priceGrandMa){
                cookie=cookie-priceGrandMa;
                priceCursor=priceGrandMa*(1.1);
                cookiePer=cookiePer+10;
                numberGrandMa++;
            }
        } else
         if (cmd.equals("FARM")){
             if(cookie >= priceFarm){
                 cookie=cookie-priceFarm;
                 priceCursor=priceFarm*(1.1);
                 cookiePer=cookiePer+100;
                 numberFarm++;
             }
         }else
         if (cmd.equals("MINE")){
             if(cookie >= priceMine){
                 cookie=cookie-priceMine;
                 priceCursor=priceMine*(1.1);
                 cookiePer=cookiePer+1000;
                 numberMine++;
             }
         }else
         if (cmd.equals("FACTORY")){
             if(cookie >= priceFactory){
                 cookie=cookie-priceFactory;
                 priceCursor=priceFactory*(1.1);
                 cookiePer=cookiePer+10000;
                 numberFactory++;
             }
         }
         if (cmd.equals("BANK")){
             if(cookie >= priceBank){
                 cookie=cookie-priceBank;
                 priceCursor=priceBank*(1.1);
                 cookiePer=cookiePer+100000;
                 numberBank++;
             }
         }else
         if (cmd.equals("TEMPLE")){
             if(cookie >= priceTemple){
                 cookie=cookie-priceTemple;
                 priceCursor=priceTemple*(1.1);
                 cookiePer=cookiePer+1000000;
                 numberTemple++;
             }
         }else
         if (cmd.equals("SHIPMENT")){
             if(cookie >= priceShipment){
                 cookie=cookie-priceShipment;
                 priceCursor=priceShipment*(1.1);
                 cookiePer=cookiePer+10000000;
                 numberShipment++;
         }else
             if (cmd.equals("TIMEMACHINE")){
                 if(cookie >= priceTimeMachine){
                     cookie=cookie-priceTimeMachine;
                     priceCursor=priceTimeMachine*(1.1);
                     cookiePer=cookiePer+100000000;
                     numberTimeMachine++;
                 }
             }
         }
    }
}


