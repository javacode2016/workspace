package com.thebyteguru.main;

import com.thebyteguru.display.Display;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Timer;

public class Main {

    public static void main(String[] args) {
        Display.create(800, 600, "Tanks");
            
        Timer t = new Timer(1000 / 60, new AbstractAction () {
            //Anonimous inner type            
            public void actionPerformed(ActionEvent e) {
                Display.render();
            }
        });
        
        t.setRepeats(true);//повтор запуска таймера
        t.start();
    
    }
    
}
