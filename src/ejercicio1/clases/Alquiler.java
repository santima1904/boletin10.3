package ejercicio1.clases;

import ejercicio1.clasesAbstractas.Barco;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Alquiler {

    //Atriibutos
    private Cliente cliente;
    private Barco barco;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String posicionAmarre;
    public static final double VALOR = 800;

    //Constructor
    public Alquiler(Cliente cliente, Barco barco, LocalDate fechaInicio, LocalDate fechaFin, String posicionAmarre) {
        this.cliente = cliente;
        this.barco = barco;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.posicionAmarre = posicionAmarre;
    }

    //Getters and setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    //Metodos anhadidos
    public double calcularAlquiler(){
        double diferenciaDias = (double)(DAYS.between(fechaInicio, fechaFin));

        return diferenciaDias * barco.calcularModulo() * VALOR;
    }
}

