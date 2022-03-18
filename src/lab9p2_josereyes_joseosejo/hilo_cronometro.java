/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9p2_josereyes_joseosejo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author josec
 */
public class hilo_cronometro {
    private boolean tiempo;
    private boolean run;
    private JLabel segundos;
    
    public hilo_cronometro(JLabel segundos) {
        this.segundos =segundos;
        tiempo = true;
        run = true;
    }

    
    public void setAvanzar(boolean avanzar) {
        this.tiempo = avanzar;
    }

    public void setVive(boolean vive) {
        this.run = vive;
    }
    
    public void run() {
        int total = 0;
        while (run) {
            
            if (tiempo) {
                int i = 0; 
                int t = 0;
                while (i < 61){
                    
                    segundos.setText(t+ ":"+i+" minutos");
                    if (i == 60){
                        t++;
                        total += t;
                        JOptionPane.showMessageDialog(null, "Han pasado " + total + " minutos");
                    }
                }
                
                
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        }
    }
}
