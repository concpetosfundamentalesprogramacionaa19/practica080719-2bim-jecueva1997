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
public class Desarrollo {
    // creacion del metodo para el tamño
    public static int obtenerTamanioArreglo(int arreglo2[], int tamanio) {
        // condicional para detectar el tamaño del arreglo
        if (tamanio == 1) {
            return arreglo2[0];
        } else {
            // retorno de valores
            return arreglo2[tamanio - 1] + obtenerTamanioArreglo(arreglo2, 
                    tamanio - 1 ); 
        }
         
    }
    // creacion del metodo para detectar el tamaño
    public static int obtenertamanio(int arr[]){
        // condicional para detectar el tamño del arreglo
        int tamanio = 0;
        for (int i = 0; i < arr.length; i++) {
            tamanio = tamanio + arr[i];
        }
        // retorno del valor
        return tamanio;
    }
}
