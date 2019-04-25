/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion;
import java.util.Scanner;
/**
 *
 * @author TIMO
 */
public class Principal {
    
    public static void main(String[] args) {
    
        int num_mensajes;
        double total_mensual = 0;
        double aux;
        double aux2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número de mensajes enviados");
        num_mensajes = entrada.nextInt();
        
        if (num_mensajes <= 40){
            total_mensual = 3.00;
        } else {
            if (num_mensajes > 40 && num_mensajes <= 200){
                aux = num_mensajes - 40;
                aux2 = 3.00 + (0.05 * aux);
                total_mensual = aux2 + (aux2 * 0.12);
                
                } else {
                    if (num_mensajes > 200){
                        aux = num_mensajes-200;
                        aux2 = 11.00 + (0.10 * aux);
                        total_mensual = aux2 + (aux2 * 0.12);
                    }
            }
        }
    System.out.printf("El total a pagar es de: $ %s\nPor un total de: %s "
            + "mensajes enviados", total_mensual, num_mensajes);
    }
}
