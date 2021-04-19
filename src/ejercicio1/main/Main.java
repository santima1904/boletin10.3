package ejercicio1.main;

import ejercicio1.clases.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Javi", "13876289D");
        LocalDate fechaInicio = LocalDate.of(2021, 3, 21);
        LocalDate fechaFin = LocalDate.of(2021, 3, 30);
        Yate yate = new Yate("12313", 10, fechaInicio, 5, 12);
        Velero velero = new Velero("12313", 10, fechaInicio, 16);
        Deportivo deportivo = new Deportivo("12313", 10, fechaInicio, 16);
        Alquiler alquiler = new Alquiler(cliente, yate, fechaInicio, fechaFin, "si");
        System.out.println(alquiler.calcularAlquiler());
    }
}
