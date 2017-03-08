import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class Counter implements ActionListener {
    private double cookie = 0; //cookie pool
    private double cookiePer = 0, priceCursor = 10, priceGrandMa = 100, priceFarm = 1000, priceMine  = 10000, priceFactory = 100000;//initializing starting prices of automatic "clickers"
    private double priceBank = 1000000, priceTemple = 10000000, priceShipment = 100000000, priceTimeMachine = 1000000000; //same as above line
    private int numberCursor = 0, numberGrandMa = 0, numberFarm = 0, numberMine = 0, numberFactory = 0, numberBank = 0, numberTemple =0; //initialize counters for automatic clcikers
    private int numberShipment = 0, numberTimeMachine = 0; //same as above line
    private JLabel cookieLabel;
    private JLabel cookieLPer;
    Counter(JLabel cookieLabel, JLabel cookieLPer){
        this.cookieLabel=cookieLabel;
        this.cookieLPer=cookieLPer;
    }
    Timer timer = new Timer();

    void addCokie(){ // add a cookie to total
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

    public void att(){ //timer to update the cookie pool count
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                attCookie();
            }
        },0,10);
    }
    public void att1(){ //timer to update the labels displaying numbers and counters
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                attLabel();
            }
        },1,1);
    }


    public void actionPerformed(ActionEvent e){ //player has clicked on something, either on the cookie or has attempted to purchase an autoclicker
        String cmd = e.getActionCommand(); //retrieve the name of what has been clicked on
        if (cmd.equals("ADD")){ // player has clicked cookie, add value of cookie to cookie pool
            addCokie();
        } else
        if (cmd.equals("CURSOR")) { //autoclicker object cursor has been purchased with cookies in cookie pool
            if(cookie>=priceCursor){ //if player can afford cursor, purchase it and adjust new price accordingly.
                cookie=cookie-priceCursor;
                priceCursor=priceCursor*(1.1); //Next one costs 10% more
                cookiePer=cookiePer+1;
                numberCursor++;
            }
        } else
        if (cmd.equals("GRANDMA")){ //autoclicker object grandma has been purchased with cookies in cookie pool
            if(cookie >= priceGrandMa){//if player can afford a grandma, purchase it and adjust new price accordingly.
                cookie=cookie-priceGrandMa;
                priceCursor=priceGrandMa*(1.1); //Next one costs 10% more
                cookiePer=cookiePer+10;
                numberGrandMa++;
            }
        } else
         if (cmd.equals("FARM")){ //autoclicker object Farm has been purchased with cookies in cookie pool
             if(cookie >= priceFarm){//if player can afford a farm, purchase it and adjust new price accordingly.
                 cookie=cookie-priceFarm;
                 priceCursor=priceFarm*(1.1); //Next one costs 10% more
                 cookiePer=cookiePer+100;
                 numberFarm++;
             }
         }else
         if (cmd.equals("MINE")){ //autoclicker object Mine has been purchased with cookies in cookie pool
             if(cookie >= priceMine){//if player can afford a mine, purchase it and adjust new price accordingly.
                 cookie=cookie-priceMine;
                 priceCursor=priceMine*(1.1);//Next one costs 10% more
                 cookiePer=cookiePer+1000;
                 numberMine++;
             }
         }else
         if (cmd.equals("FACTORY")){//autoclicker object factory has been purchased with cookies in cookie pool
             if(cookie >= priceFactory){//if player can afford a factory, purchase it and adjust new price accordingly.
                 cookie=cookie-priceFactory;
                 priceCursor=priceFactory*(1.1);//Next one costs 10% more
                 cookiePer=cookiePer+10000;
                 numberFactory++;
             }
         }
         if (cmd.equals("BANK")){ //autoclicker object bank has been purchased with cookies in cookie pool
             if(cookie >= priceBank){//if player can afford a bank, purchase it and adjust new price accordingly.
                 cookie=cookie-priceBank;
                 priceCursor=priceBank*(1.1);//Next one costs 10% more
                 cookiePer=cookiePer+100000;
                 numberBank++;
             }
         }else
         if (cmd.equals("TEMPLE")){ //autoclicker object temple has been purchased with cookies in cookie pool
             if(cookie >= priceTemple){//if player can afford a temple, purchase it and adjust new price accordingly.
                 cookie=cookie-priceTemple;
                 priceCursor=priceTemple*(1.1);//Next one costs 10% more
                 cookiePer=cookiePer+1000000;
                 numberTemple++;
             }
         }else
         if (cmd.equals("SHIPMENT")){//autoclicker object rocket shipment has been purchased with cookies in cookie pool
             if(cookie >= priceShipment){//if player can afford a rocket shipment, purchase it and adjust new price accordingly.
                 cookie=cookie-priceShipment;
                 priceCursor=priceShipment*(1.1);//Next one costs 10% more
                 cookiePer=cookiePer+10000000;
                 numberShipment++;
         }else
             if (cmd.equals("TIMEMACHINE")){//autoclicker object Time Machine has been purchased with cookies in cookie pool
                 if(cookie >= priceTimeMachine){//if player can afford a time machine, purchase it and adjust new price accordingly.
                     cookie=cookie-priceTimeMachine;
                     priceCursor=priceTimeMachine*(1.1);//Next one costs 10% more
                     cookiePer=cookiePer+100000000;
                     numberTimeMachine++;
                 }
             }
         }
    }
}


