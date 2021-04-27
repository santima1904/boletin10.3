/**
 * Clase que funciona como la gestora.
 * Se va a encargar de crear la lista y trabajar con ella
 */

package ejercicio2.clases;

import ejercicio2.clasesAbstractas.Producto;

import java.text.spi.BreakIteratorProvider;
import java.util.Arrays;

public class Estanteria {

    //Array
    public static Producto [][] estanteria = new Producto[5][6];

    //Constantes
    public static final int NUMERO_ESTANTERIAS = 5;
    public static final int NUMERO_HUECOS = 6;


    //Metodos para trabajar con ella

    /**
     * Metodo para aumentar el array si es necesario
     */

    /*En resguardo
    public Producto [][] aumentarArray() {


    }

     */

    /**
     * Metodo para calcular el precio de todas las bebidas
     */
    public static double calcularPrecio(){
        double precio=0;
        for (int i=0; i < estanteria.length;i++){
            for (int j=0;j<estanteria[i].length;j++){
                precio += estanteria[i][j].getPrecioFinal();
            }
        }
        return precio;
    }


    /**
     * Metodo para calcular el precio total de una marca
     * Seria como el anterior pero anhadiendo un if para controlar que la marca sea igual
     */

    /*En resguardo
    public double calcularPrecioMarca(String marca){

    }

     */

    /**
     * Metodo para calcular el precio total de una estanteria
     */
    public static double calcularPrecioEstanteria(int numeroEstanteria){
        double precio=0;
        for (int i=0; i < estanteria[numeroEstanteria].length;i++){
            precio += estanteria[numeroEstanteria][i].getPrecioFinal();
        }
        return precio;
    }

    /**
     * Agregar un producto
     */
    public static void agregarProducto(Producto p) {
        boolean repetida = false;

        //Primero reviso si el id ya estaba en la estanteria, y por lo tanto si esta repetido
        /*
        for (int x = 0; x < estanteria.length; x++) {
            for (int y = 0; y < estanteria[y].length; y++) {
                if (estanteria[x][y].getIdentificador() == p.getIdentificador()) {
                    repetida = true;
                }
            }

         */

            //Si no esta repetido, se agrega el producto en el primer espacio disponible
            //if (!repetida) {
                for (int i = 0; i < estanteria.length; i++) {
                    for (int j = 0; j < estanteria[i].length && !repetida; j++) {
                        if (estanteria[i][j] == null) {
                            estanteria[i][j] = p;
                            repetida = true;

                        }
                    }
                //}

        }
    }

    /**
     * Eliminar un producto de la estanteria
     */

    public static void eliminarProducto(int id) {
        boolean eliminado = false;
        for (int x = 0; x < estanteria.length; x++) {
            for (int y = 0; y < estanteria[y].length && !eliminado; y++) {
                if (estanteria[x][y].getIdentificador() == id) {
                    estanteria[x][y] = null;
                    eliminado = true;
                }
            }
        }
    }


    /**
     * Mostrar el inventario de  un producto de la estanteria
     */

    public static void MostrarInventarioProducto() {
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[i].length; j++) {
               estanteria[i][j].toString();
            }
        }
    }
}
