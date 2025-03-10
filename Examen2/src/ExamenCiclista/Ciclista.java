package ExamenCiclista;

public class Ciclista {
    private String nombre;
    private double tiempo;
    private static int contadorID = 1000; // Contador global
    private int identificador; // ID para cada ciclista

    public Ciclista(String nombre, double tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.identificador = ++contadorID; // Asignar ID único a cada ciclista
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() { // No debe ser estático
        return identificador;
    }

    public double getTiempo() {
        return tiempo;
    }
    

    @Override
    public String toString() {
        return "Ciclista [ID=" + identificador + ", nombre=" + nombre + ", tiempo=" + tiempo + "]";
    }
}
