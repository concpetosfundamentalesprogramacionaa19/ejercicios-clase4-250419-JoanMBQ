/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;
import paquetedos.Operacion;
/**
 *
 * @author TIMO
 */
public class SeleccionDoble {
    
      public static void main(String[] args) {
          // documentacion
        
        String miMensaje = Operacion.mensaje;
        String miMensaje2 = Operacion.mensaje2;
        int calificacion;
        int calificacion_2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese la calificación 1");
        calificacion = entrada.nextInt();
        System.out.println("Por favor ingrese la calificación 2");
        calificacion_2 = entrada.nextInt();
        
        if (calificacion >= 85){
            System.out.printf("%s %d\n", miMensaje, calificacion);
        } else {
            System.out.printf("%s %d\n", miMensaje2, calificacion);
        }
        if (calificacion_2 >= 85){
            System.out.printf("%s %d\n", miMensaje, calificacion_2);
        } else {
            System.out.printf("%s %d\n", miMensaje2, calificacion_2);
        }
      }

}
