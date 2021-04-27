/**
 * Clase para mostrar por pantalla y pedir valores al usuario, así como validarlos
 */

package ejercicio2.vista;

import ejercicio2.clases.Agua;
import ejercicio2.clases.Refresco;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Menu {
    //Teclado
    public static Scanner tecladoString = new Scanner(System.in);
    public static Scanner teclado = new Scanner(System.in);

    //Constantes con mensajes
    public static final String MENSAJE_MARCA = "Introduzca la marca: ";
    public static final String MENSAJE_ORIGEN = "Introduzca el origen: ";
    public static final String MENSAJE_CANTIDAD = "Introduzca la cantidad: ";
    public static final String MENSAJE_PRECIOBASE = "Introduzca el precio base: ";
    public static final String MENSAJE_PORCENTAJE = "Introduzca el porcentaje: ";
    public static final String MENSAJE_PROMOCION = "Introduzca la promocion: ";
    public static final String MENSAJE_MENU = "Bienvenido al almacen ";
    public static final String MENSAJE_MENU2 = "Que desea hacer:  ";
    public static final String MENSAJE_OPCION1 = "1- Agregar un producto.";
    public static final String MENSAJE_OPCION2 = "2- Eliminar un producto.";
    public static final String MENSAJE_OPCION3 = "3- Ampliar el almacen.";
    public static final String MENSAJE_OPCION4 = "4- Calcular precio de todas las bebidas.";
    public static final String MENSAJE_OPCION5 = "5- Calcular el precio total de una marca de bebida.";
    public static final String MENSAJE_OPCION6 = "6- Calcular el precio total de una estanteria.";
    public static final String MENSAJE_CONTINUAR = "Desea continuar?";
    public static final String MENSAJE_SI = "1- Si";
    public static final String MENSAJE_NO = "2- No";
    public static final String MENSAJE_ELEGIR = "Desea anhadir agua o un refresco";
    public static final String MENSAJE_AGUA = "1- Agua";
    public static final String MENSAJE_REFRESCO = "2- Refresco";
    public static final String MENSAJE_ID = "Introduce id: ";
    public static final String MENSAJE_MOSTRARPRECIO = "El precio total de todos los productos del almacen es de: ";
    public static final String MENSAJE_MOSTRARPRECIOESTANTERIA = "El precio total de todos los productos de la estanteria dada del almacen es de: ";
    public static final String MENSAJE_ESTANTERIA = "Introduce estante: ";

    //Metodos
    /**
     * Metodo para mostrar menu principal
     */
    public static void menuPrincipal(){
        System.out.println(MENSAJE_MENU);
        System.out.println(MENSAJE_MENU2);
        System.out.println(MENSAJE_OPCION1);
        System.out.println(MENSAJE_OPCION2);
        System.out.println(MENSAJE_OPCION3);
        System.out.println(MENSAJE_OPCION4);
        System.out.println(MENSAJE_OPCION5);
        System.out.println(MENSAJE_OPCION6);
    }

    /**
     * Metodo para pedir y validar un int opcion
     * @return
     */
    public static int pedirOpcion(){
        int respuesta = 0;
        do {
            respuesta = teclado.nextInt();
        }while(respuesta <=0 && respuesta >6 && respuesta == 3 && respuesta == 5);

        return respuesta;
    }


    /**
     * Metodo para pedir y validar un int opcion
     * @return
     */
    public static int elegirAguaProducto(){
        int respuesta = 0;
        do {
            System.out.println(MENSAJE_ELEGIR);
            System.out.println(MENSAJE_AGUA);
            System.out.println(MENSAJE_REFRESCO);
            respuesta = teclado.nextInt();
        }while(respuesta !=1 && respuesta !=2);


        return respuesta;
    }

    /**
     * Metodo para pedir y validar un int continuar
     * @return
     */
    public static int  continuar(){
        int respuesta = 0;
        do {
            System.out.println(MENSAJE_CONTINUAR);
            System.out.println(MENSAJE_SI);
            System.out.println(MENSAJE_NO);
            respuesta = teclado.nextInt();
        }while(respuesta !=1 && respuesta !=2);

        return respuesta;
    }

    /**
     * Crear objeto agua
     */

    public static Agua crearAgua(){
        double cantidad, precio;
        String origen, marca;

        cantidad = pedirCantidad();
        precio = pedirPrecio();
        origen = pedirOrigen();
        marca = pedirMarca();

        Agua agua = new Agua(cantidad, precio, marca, origen);

        return agua;
    }

    /**
     * Crear objeto refresco
     */

    public static Refresco crearRefresco(){
        double cantidad, precio, porcentaje;
        String marca;
        boolean promocion;

        cantidad = pedirCantidad();
        precio = pedirPrecio();
        marca = pedirMarca();
        porcentaje = pedirPorcentaje();
        promocion = pedirPromocion();

        Refresco refresco = new Refresco(cantidad, precio, marca, porcentaje, promocion);

        return refresco;
    }

    /**
     * Metodo para pedir y validar int id
     */
    public static int pedirId(){
        int respuesta = 0;
        do {
            System.out.println(MENSAJE_ID);
            respuesta = teclado.nextInt();
        }while(respuesta <= 0);

        return respuesta;
    }

    /**
     * Metodo para pedir y validar un String marca
     * @return
     */
    public static String pedirMarca(){
        String respuesta = null;
        do {
            System.out.println(MENSAJE_MARCA);
            respuesta = tecladoString.nextLine();
        }while(respuesta == null);

        return respuesta;
    }

    /**
     * Metodo para pedir y validar origen
     */
    public static String pedirOrigen(){
        String respuesta = null;
        do {
            System.out.println(MENSAJE_ORIGEN);
            respuesta = tecladoString.nextLine();
        }while(respuesta == null);

        return respuesta;
    }

    /**
     * Metodo para pedir y validar double cantidad
     */
    public static double pedirCantidad(){
        double respuesta = 0;
        do {
            System.out.println(MENSAJE_CANTIDAD);
            respuesta = teclado.nextDouble();
        }while(respuesta <= 0);

        return respuesta;
    }

    /**
     * Metodo para pedir y validar double precio base
     */
    public static double pedirPrecio(){
        double respuesta = 0;
        do {
            System.out.println(MENSAJE_PRECIOBASE);
            respuesta = teclado.nextDouble();
        }while(respuesta <= 0);

        return respuesta;
    }

    /**
     * Metodo para pedir y validar double porcentaje
     */
    public static double pedirPorcentaje(){
        double respuesta = 0;
        do {
            System.out.println(MENSAJE_PORCENTAJE);
            respuesta = teclado.nextDouble();
        }while(respuesta <= 0);

        return respuesta;
    }

    /**
     * Metodo para pedir y validar boolean promocion
     */
    public static boolean pedirPromocion(){
        boolean respuesta = true;
        do {
            System.out.println(MENSAJE_PROMOCION);
            respuesta = teclado.nextBoolean();
        }while(respuesta != true && respuesta != false);

        return respuesta;
    }

    /**
     * Metodo para mostrar mensaje
     */
    public static void mensajePrecio(){
        System.out.println(MENSAJE_MOSTRARPRECIO);
    }

    /**
     * Metodo para mostrar mensaje
     */
    public static void mensajePrecioEstante(){
        System.out.println(MENSAJE_MOSTRARPRECIOESTANTERIA);
    }

    /**
     * Metodo para pedir y validar int numeroEstanteria
     */
    public static int pedirEstante(){
        int respuesta = 0;
        do {
            System.out.println(MENSAJE_ESTANTERIA);
            respuesta = teclado.nextInt();
        }while(respuesta < 1 && respuesta > 5);

        return respuesta;
    }

    /**
     * Metodo para cerrar el teclado
     */

    public static void cerrarTeclado() {
        teclado.close();
    }

}
