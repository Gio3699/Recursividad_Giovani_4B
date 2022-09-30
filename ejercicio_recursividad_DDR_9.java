/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_de_datos_apps_giovani;

/**
 *
 * @author Esteban Ramirez
 */
public class ejercicio_recursividad_DDR_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
int base = 10;//declaramos las variables
int exponente = -2;
System.out.println(potencia(base, exponente));//escribimos el codigo para imprimir
}
public static double potencia(int base, int exponente) {//creamos el metodo potencia
if (exponente == 0) { //caso base
return 1; //10^0 = 1
} else if (exponente == 1) { //caso base
return base; //10^1 = 10
} else if (exponente < 0) { //Exponente negativo
return potencia(base, exponente + 1) / base;
} else { //Exponente positivo
return base * potencia(base, exponente - 1);//regresa el resultado
}
}
}
