/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
import paquetedos.Operacion2;

/**
 *
 * @author TIMO
 */
public class SeleccionAnidada {
    
public static void main(String[] args) {
          // documentacion
        
        String miMensaje = Operacion2.mensaje;
        String miMensaje2 = Operacion2.mensaje2;
        String miMensaje3 = Operacion2.mensaje3;
        String miMensajeR = Operacion2.mensajeR;
        int calificacion;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese su calificación");
        calificacion = entrada.nextInt();

        
        if (calificacion >= 90){
            System.out.printf("%s %d\n", miMensaje, calificacion);
        } else {
            if (calificacion < 90 && calificacion >= 80){
                System.out.printf("%s %d\n", miMensaje2, calificacion);
                } else {
                    if (calificacion < 80 && calificacion >= 50){
                        System.out.printf("%s %d\n", miMensaje3, calificacion);
                    } else {
                        System.out.printf("%s %d\n", miMensajeR, calificacion);
                }
            }
        }
    }
}
