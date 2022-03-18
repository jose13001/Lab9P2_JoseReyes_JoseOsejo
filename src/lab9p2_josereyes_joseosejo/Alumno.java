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
public class Alumno extends Usuario{
    public int NCuenta;
    public String carrera;
    public ArrayList<Clase>clases=new ArrayList();

    public Alumno(int NCuenta, String carrera, String nombre, String usuario, String pass) {
        super(nombre, usuario, pass);
        this.NCuenta = NCuenta;
        this.carrera = carrera;
    }

    public int getNCuenta() {
        return NCuenta;
    }

    public void setNCuenta(int NCuenta) {
        this.NCuenta = NCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
    
    
    
}
