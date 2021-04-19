package ejercicio1.clases;

import ejercicio1.clasesAbstractas.Barco;

import java.time.LocalDate;

public class Deportivo extends Barco {

    //Atributos
    private double potencia;

    //Constructor
    public Deportivo(String matricula, double eslora, LocalDate anhosFabricacion, double potencia) {
        super(matricula, eslora, anhosFabricacion);
        this.potencia = potencia;
    }

    //Getters and setters
    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }


    //Metodos anhadidos
    @Override
    public double calcularModulo() {
        return moduloBasico()+potencia;
    }
}
