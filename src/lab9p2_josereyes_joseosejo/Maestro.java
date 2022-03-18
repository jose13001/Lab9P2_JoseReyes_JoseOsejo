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
public class Maestro extends Usuario{
    public int IDmaestro;

    public Maestro(int IDmaestro, String nombre, String usuario, String pass) {
        super(nombre, usuario, pass);
        this.IDmaestro = IDmaestro;
    }

    public int getIDmaestro() {
        return IDmaestro;
    }

    public void setIDmaestro(int IDmaestro) {
        this.IDmaestro = IDmaestro;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
    
    
    
}
