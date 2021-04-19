package ejercicio1.clases;

import ejercicio1.clasesAbstractas.Barco;

import java.time.LocalDate;

public class Yate extends Barco {

    //Atributos
    private double potencia;
    private double numeroCamarotes;

    //Constructor
    public Yate(String matricula, double eslora, LocalDate anhosFabricacion, double potencia, double numeroCamarotes) {
        super(matricula, eslora, anhosFabricacion);
        this.potencia = potencia;
        this.numeroCamarotes = numeroCamarotes;
    }

    //Getters and setters
    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(double numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    //Metodos anhadidos
    @Override
    public double calcularModulo() {
        return moduloBasico()+potencia+numeroCamarotes;
    }
}
