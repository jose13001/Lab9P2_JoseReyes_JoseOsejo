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
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class hilo_cronometro implements Runnable {

    private boolean tiempo;
    private boolean run;
    private JLabel segundos;

    public hilo_cronometro(JLabel segundos) {
        this.segundos = segundos;
        tiempo = true;
        run = true;
    }

    public void setAvanzar(boolean avanzar) {
        this.tiempo = avanzar;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    public void run() {
        int total = 0;
        int total2 = 0;
        while (run) {

            if (tiempo) {
                int i = 0;
                int t = 0;
                int j=0;
                while (i < 61) {
                    //segundos.setText(t + ":" + i + " minutos");
                    i += 1;
                    //segundos.setText(t + ":" + " minutos");
                    if (i == 60) {
                        t++;
                        total += t;

                        segundos.setText(total2 + ":" + total + " minutos");

                       // JOptionPane.showMessageDialog(null, "Han pasado " + total + " segundos");
                        if (total == 60) {
                            total=0;
                             j++;
                             total2+=j;
                                segundos.setText(j + ":" + total + " minutos");
                                JOptionPane.showMessageDialog(null,"Han pasado "+total2+" minutos");

                        }

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
