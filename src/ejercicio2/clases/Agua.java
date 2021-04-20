package ejercicio2.clases;

import ejercicio2.clasesAbstractas.Producto;

public class Agua extends Producto {

    //Atributos
    private String origen;

    //Constructor
    public Agua(double cantidad, double precioBase, String marca, String origen) {
        super(cantidad, precioBase, marca);
        this.origen = origen;
    }

    //Getters and setters
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() +
                ", origen='" + origen + '\'' +
                '}';
    }
}
