package ejercicio2.clasesAbstractas;

public abstract class Producto {

    //Atribbutos
    private int identificador;
    private double cantidad;
    private double precioBase;
    private String marca;

    //Atributo derivado
    private double precioFinal;

    //Variable estatica para identificador
    public static int contadorId = 0;

    //Constantes
    public static final double IVA = 0.21;

    //Constructor
    public Producto(double cantidad, double precioBase, String marca) {
        this.identificador = contadorId++;
        this.cantidad = cantidad;
        this.precioBase = precioBase;
        this.marca = marca;
        this.precioFinal = calcularIVA() + precioBase;
    }

    //Getters and setters
    public int getIdentificador(){
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }
    //toString

    @Override
    public String toString() {
        return "Producto{" +
                "identificador=" + identificador +
                ", cantidad=" + cantidad +
                ", precioBase=" + precioBase +
                ", marca='" + marca + '\'' +
                ", precioFinal=" + precioFinal
                ;
    }


    //Metodos anhadidos
    /**
     * Metodo para calcular el IVA del producto
     *
     * @return IVA calculado
     */
    private double calcularIVA(){
        return IVA * precioBase;
    }
}
