/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9p2_josereyes_joseosejo;

import java.util.ArrayList;

/**
 *
 * @author josec
 */
public class Examen {
    public int IDclase;
    public ArrayList<pregunta>preguntas=new ArrayList();

    public Examen(int IDclase) {
        this.IDclase = IDclase;
    }

    public int getIDclase() {
        return IDclase;
    }

    public void setIDclase(int IDclase) {
        this.IDclase = IDclase;
    }

    public ArrayList<pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    @Override
    public String toString() {
        return "Examen{" + "IDclase=" + IDclase + '}';
    }
    
    
    
}
