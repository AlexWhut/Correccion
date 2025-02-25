package Examen2;

// Clase base Animal
public class Animal {
    private String nombre;
    private int edad;
    private CartillaVeterinario cartilla;
    private static int totalAnimales = 0;
    
    // Constructor
    public Animal(String nombre, int edad, CartillaVeterinario cartilla) {
        this.nombre = nombre;
        this.setEdad(edad);
        this.cartilla = cartilla;
        totalAnimales++;
    }
    
    // Getters y Setters
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public CartillaVeterinario getCartilla() { return cartilla; }
    
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }
    
    public String hacerSonido() { return "Sonido genérico"; }
    public String comer() { return "Comida genérica"; }
    public String moverse() { return "Movimiento genérico"; }
    
    public void enfermar() {
        cartilla.incrementarEnfermedades();
        System.out.println(nombre + " ha enfermado. Veterinario: " + cartilla.getNombreVeterinario());
    }
    
    public void vacunar() {
        cartilla.incrementarVacunas();
        System.out.println(nombre + " ha sido vacunado. Veterinario: " + cartilla.getNombreVeterinario());
    }
    
    public static int getTotalAnimales() { return totalAnimales; }
    
    @Override
    public String toString() {
        return "Animal{nombre='" + nombre + "', edad=" + edad + ", " + cartilla + "}";
    }
}