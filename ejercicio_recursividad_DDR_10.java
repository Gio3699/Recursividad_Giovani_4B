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
public class ejercicio_recursividad_DDR_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
int numero = 123;//declaramos la variable
System.out.println(sumaDigitos(numero));//escribimos el codigo para imprimir
}
public static int sumaDigitos(int numero){//creamos el metodo sumaDigitos
if(numero < 10){ //caso base Si la variable numero es menor que diez
return numero; //devuelvo el numero
}else{
return (numero % 10) + sumaDigitos(numero/10); //Cojo el digito y llamo a la funcion
}
}
}
