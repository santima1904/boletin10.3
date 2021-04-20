package ejercicio2.clases;

import ejercicio2.clasesAbstractas.Producto;

public class Refresco extends Producto {

    //Atributos
    private double porcentajeAzucar;
    private boolean promocion;

    //Constantes
    public static final double DESCUENTO = 0.1;

    //Constructor
    public Refresco(double cantidad, double precioBase, String marca, double porcentajeAzucar, boolean promocion) {
        super(cantidad, precioBase, marca);
        this.porcentajeAzucar = porcentajeAzucar;
        this.promocion = promocion;
        if (promocion){
            this.setPrecioBase(precioBase*DESCUENTO);
        }
    }

    //Getters and setters
    public double getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public void setPorcentajeAzucar(double porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public boolean isPromocion() {
        return promocion;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() +
                "porcentajeAzucar=" + porcentajeAzucar +
                ", promocion=" + promocion +
                '}';
    }


}
