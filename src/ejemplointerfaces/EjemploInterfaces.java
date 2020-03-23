/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfaces;

import ejemplointerfaces.clases.Administrativo;
import ejemplointerfaces.clases.Persona;

/**
 *
 * @author usuario
 */
public class EjemploInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.setNombre("Juana de Arco");
        persona.mostrarNombre();
        persona.contratar();
        persona.pagarMinimo();
        
        Administrativo administrativo = new Administrativo();
        administrativo.contratar();
        administrativo.despedir();
        
    }
    
}
