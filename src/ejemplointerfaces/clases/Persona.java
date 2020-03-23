/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfaces.clases;

/**
 *
 * @author usuario
 */
public class Persona extends Datos implements Cargos, Salario {
    
    public Persona(){
    
    }
    
    public void mostrarNombre(){
        System.out.println("El empleado se llama " + this.getNombre());
    }

    //anotaciones en java
    @Override
    public void contratar() {
            System.out.println("Se contrata para supervisor.");
    }


    @Override
    public void pagarMinimo() {
        System.out.println("Se le pagará $900.000");
    }

    @Override
    public void despedir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
