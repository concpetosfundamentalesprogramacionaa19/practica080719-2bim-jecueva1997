/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoclase;

/**
 *
 * @author reati
 */
public class Principal {
    public static void main(String[] args) {
        // declaracion de valores
        int[] val = {10, 20, 30, 1, 2, 3, 40, 4};
        // llamamiento del metodo para el tamño
        int valor = Desarrollo.obtenerTamanioArreglo(val, val.length);
        // impresion de resultados del tamaño
        System.out.printf("El tamaño del arreglo es: %d\n", valor);
        // llamamiento del segundo metodo
        int valor2 = Desarrollo.obtenertamanio(val);
        // impresion de eltamaño de la cadena
        System.out.printf("El tamaño del arreglo es %d\n", valor2);
        
    }
    
}
