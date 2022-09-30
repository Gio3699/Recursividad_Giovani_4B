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
public class ejercicio_recursividad_DDR_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//creamos el main
        // TODO code application logic here
        //Serie fibonacci
// 1 1 2 3 5 8 13 21 34 55
//llamada inicial
int posicion = 5;//creamos las variables
int resultado = fibonacciRecursivo(posicion);
System.out.println(resultado);
}
public static int fibonacciRecursivo(int n) {//creamos el metodo fibonacciRecursivo
//CASO BASE, si es cero devuelve un cero
//Puedes poner n<=0 tamvien para incluir negativos
if (n == 0) {//agregamos el metodo if
return 0;
//CASO BASE, si es 1 devuelve un 1
} else if (n == 1) {
return 1;
} else {
//Hago la suma
return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);//nos regresa el valor de la suma
}
}
}
