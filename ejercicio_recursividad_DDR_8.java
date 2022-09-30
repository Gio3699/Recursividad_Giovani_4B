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
public class ejercicio_recursividad_DDR_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra = "Hola";//declaramos el string y el texto
System.out.println(invertirPalabra(palabra, palabra.length()-1));//imprimir lo que tenga invertirPalabra
}
public static String invertirPalabra(String palabra, int longitud){//creamos el metodo invertirPalabra
if(longitud==0){//validamos que no tenga ninguna letra
return palabra.charAt(longitud)+"";//regresa lo que este escrito
}else{
return palabra.charAt(longitud) + (invertirPalabra(palabra, longitud-1));//devuelve el resultado
}
}
}
