/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9p2_josereyes_joseosejo;

/**
 *
 * @author josec
 */
public class Clase {
    public String nombre;
    public int IDclase;
    public int IDmaestro;
    public int IDexam1;
    public int IDexam2;

    public Clase(String nombre, int IDclase, int IDmaestro, int IDexam1, int IDexam2) {
        this.nombre = nombre;
        this.IDclase = IDclase;
        this.IDmaestro = IDmaestro;
        this.IDexam1 = IDexam1;
        this.IDexam2 = IDexam2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIDclase() {
        return IDclase;
    }

    public void setIDclase(int IDclase) {
        this.IDclase = IDclase;
    }

    public int getIDmaestro() {
        return IDmaestro;
    }

    public void setIDmaestro(int IDmaestro) {
        this.IDmaestro = IDmaestro;
    }

    public int getIDexam1() {
        return IDexam1;
    }

    public void setIDexam1(int IDexam1) {
        this.IDexam1 = IDexam1;
    }

    public int getIDexam2() {
        return IDexam2;
    }

    public void setIDexam2(int IDexam2) {
        this.IDexam2 = IDexam2;
    }

    @Override
    public String toString() {
        return "Clase{" + "nombre=" + nombre + '}';
    }
    
    
}
