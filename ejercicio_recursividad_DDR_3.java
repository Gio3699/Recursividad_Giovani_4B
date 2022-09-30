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
public class ejercicio_recursividad_DDR_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int[] array={1,2,3,4,5}; //Creamos un array
mostrarArrayRecursivo(array, 0); //Pasamos el array y la posicion donde empieza
}
public static void mostrarArrayRecursivo(int[] array, int indice){//creamos el metodo mostrarArrayRecursivo
/*1º forma*/
/*
if (indice == (array.length-1)){
System.out.println(array[indice]);
}else{
System.out.println(array[indice]);
mostrarArrayRecursivo(array, indice+1);
}
*/
/*2º forma*/
if (indice != array.length){//Si el indice es igual al array con longitud -1
//Mostramos el valor en ese indice
System.out.println(array[indice]);//imprimir con el indice
//Llamamos recursivamente a la función
mostrarArrayRecursivo(array, indice+1);//se manda a llamar el metodo mostrarArrayRecursivo
}
}
}
