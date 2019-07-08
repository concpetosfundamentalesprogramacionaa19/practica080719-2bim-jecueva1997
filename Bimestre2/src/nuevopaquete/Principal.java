/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevopaquete;

/**
 *
 * @author reati
 */
public class Principal {
    public static void main(String[] args) {
        // llamamiento del metodo
        int sumauno = SumaNumeros.obtenerSumaUno(5);
        // impresion de resultados
        System.out.printf("Suma Uno: %d\n", sumauno);
        // llamamientos del metodo
        int sumados = SumaNumeros.obtenerSumaDos(5);
        // presentacion de los resultados
        System.out.printf("Sumados: %d\n", sumados);
    }
    
}
