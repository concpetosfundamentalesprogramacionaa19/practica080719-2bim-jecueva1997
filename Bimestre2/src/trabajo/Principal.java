/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo;

/**
 *
 * @author reati
 */
public class Principal {
    public static void main(String[] args) {
        // llamamiento del metodo para la potencia
        int pot = Potencia.get_potencia(2, 4);
        // impresion del resultado
        System.out.printf(" La potencia es: %d\n", pot);
    }
}
