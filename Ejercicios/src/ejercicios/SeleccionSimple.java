/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import paquetedos.Operacion;

/**
 *
 * @author TIMO
 */
public class SeleccionSimple {

    public static void main(String[] args) {
        // Metodo Principal
        String miMensaje = Operacion.mensaje;

        int calificacion = 85;
        
        if (calificacion >= 85){
            System.out.printf("%s %d\n", miMensaje, calificacion);
        }
        
        int calificacion_2 = 45;
        
        if (calificacion_2 >= 85){
            System.out.printf("%s %d\n", miMensaje, calificacion_2);
        
        }
    }
}

