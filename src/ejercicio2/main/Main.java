package ejercicio2.main;

import ejercicio2.clases.Estanteria;
import ejercicio2.vista.Menu;

import java.beans.beancontext.BeanContextServiceRevokedEvent;

public class Main {
    public static void main(String[] args) {
        int continuar=1;

        do {
            Menu.menuPrincipal();
            switch (Menu.pedirOpcion()){
                case 1://opcion de agregar producto
                        switch (Menu.elegirAguaProducto()){
                            case 1:
                                Estanteria.agregarProducto(Menu.crearAgua());
                                break;
                            case 2:
                                Estanteria.agregarProducto(Menu.crearRefresco());
                                break;
                        }
                        break;
                case 2://opcion de eliminar producto
                    Estanteria.eliminarProducto(Menu.pedirId());
                    break;

                case 3://opcion para ampliar almacen
                    //En resguardo
                    break;

                case 4://opcion de calcular el precio total del almacen
                    Menu.mensajePrecio();
                    System.out.println(Estanteria.calcularPrecio());
                    break;

                case 5: //opcion de calcular el precio total de una marca del almacen
                    //En resguardo
                    break;

                case 6://opcion de calcular el precio total de una estanteria del almacen
                    Menu.mensajePrecioEstante();
                    Estanteria.calcularPrecioEstanteria(Menu.pedirEstante());
                    break;
            }
            continuar = Menu.continuar();
        }while(continuar==1);

    }
}
