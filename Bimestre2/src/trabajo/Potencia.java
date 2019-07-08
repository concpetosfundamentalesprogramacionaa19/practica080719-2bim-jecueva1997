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
public class Potencia {
    // metodo para encontrar la potencia
    public static int get_potencia(int base, int exponente) {
        // condicion para el exponenete
        if (exponente == 1) {
            return base;
        } else{
            // retorno del valor
            return base * get_potencia(base, exponente - 1);
        }
    }
    
}
