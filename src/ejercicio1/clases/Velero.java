package ejercicio1.clases;

import ejercicio1.clasesAbstractas.Barco;

import java.time.LocalDate;

public class Velero extends Barco {

    //Atributos
    private double numeroMastiles;

    //Costructor
    public Velero(String matricula, double eslora, LocalDate anhosFabricacion, double numeroMastiles) {
        super(matricula, eslora, anhosFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    //Getters and setters
    public double getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(double numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }


    //Metodos anhadidos
    @Override
    public double calcularModulo() {
        return moduloBasico() + numeroMastiles;
    }
}
