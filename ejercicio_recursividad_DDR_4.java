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
public class ejercicio_recursividad_DDR_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int[] array={1,2,3,4,5}; //Declaramos un array
    int elementoBuscar=5; //Declaramos la variable elemntoBuscar
    int posElementoEncontrado=posicionElementoRecursivo(array, elementoBuscar,0); //asignamos valor a la variable posElementoEncontrado
    System.out.println(posElementoEncontrado); //Imprimimos la variable posElementoEncontrado
    }
    public static int posicionElementoRecursivo(int[] array, int elementoBuscar ,int indice){ //Creamos el método posicionElementoRecursivo
    if(indice==array.length || array[indice]==elementoBuscar){ //Si el indice es igual a la longitud del array ó si el array indice es igual al elementoBuscar
    if(indice==array.length){ //Si el indice es igual a la longitud del array
    return -1; //Regresamos 1
    }else{ //Si no
    return indice; //Regresamos el indíce
    }
    }else{ //caso contrario
    return posicionElementoRecursivo(array, elementoBuscar, indice+1); //Regresamos el método con el array, elementoBuscar, indice más uno
    }
    }
    }