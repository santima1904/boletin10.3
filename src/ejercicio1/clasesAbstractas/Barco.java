package ejercicio1.clasesAbstractas;

import java.time.LocalDate;

public abstract class Barco {

    //Atributos
    private String matricula;
    private double eslora;
    private LocalDate anhosFabricacion;

    //Constructor
    public Barco(String matricula, double eslora, LocalDate anhosFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anhosFabricacion = anhosFabricacion;
    }

    //Getters and setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public LocalDate getAnhosFabricacion() {
        return anhosFabricacion;
    }

    public void setAnhosFabricacion(LocalDate anhosFabricacion) {
        this.anhosFabricacion = anhosFabricacion;
    }

    //Metodos anhadidos

    /**
     * Metodo para calcular el modulo minimo en los barcos
     *
     * @return
     */
    public double moduloBasico(){
        return 10 * this.eslora;
    }

    /**
     * Metodo para calcuar el modulo con las especificaciones de cada barco
     * @return
     */
    public abstract double calcularModulo();
}
