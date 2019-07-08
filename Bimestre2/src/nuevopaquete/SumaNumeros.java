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
public class SumaNumeros {
    // metodo para la suma de numeros
    public static int obtenerSumaUno(int v){
        int suma = 0;
        // ciclo repetitivo para la suma de numeros
        for (int i = 1; i <= v; i++) {
            suma = suma + i;
        }
        // retorno del valor
        return suma;
    }
    // metodo para la suma de numeros
    public static int obtenerSumaDos(int v) {
        // condicional para que se sumen los numeros
        if (v <= 0) {
            return 0;
        }else{
            // retorno del valor
            return v + obtenerSumaDos(v - 1);
        }
        
    }
}
