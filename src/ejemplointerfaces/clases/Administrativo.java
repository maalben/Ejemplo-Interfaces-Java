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
public class Administrativo implements Cargos {

    public Administrativo() {
    }

    @Override
    public void contratar() {
        System.out.println("Se contrata para secretaria");
    }

    @Override
    public void despedir() {
        System.out.println("Se le paga el 90% del salario");
    }
    
}
