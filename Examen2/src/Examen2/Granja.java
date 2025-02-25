package Examen2;
import java.util.ArrayList;

public class Granja {
    private String nombre;
    private String ciudad;
    private ArrayList<Animal> animales;
    
    public Granja(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.animales = new ArrayList<>();
    }
    
    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }
    
    public void vacunarTodos() {
        for (Animal animal : animales) {
            animal.vacunar();
        }
    }
    
    public void enfermarAnimal(int index) {
        if (index >= 0 && index < animales.size()) {
            animales.get(index).enfermar();
        }
    }
    
    public void mostrarSonidos() {
        for (Animal animal : animales) {
            System.out.println(animal.getNombre() + " suena así: " + animal.hacerSonido());
        }
    }
    
    public void mostrarComida() {
        for (Animal animal : animales) {
            System.out.println(animal.getNombre() + " come: " + animal.comer());
        }
    }
    
    public void mostrarMovimientos() {
        for (Animal animal : animales) {
            System.out.println(animal.getNombre() + " se mueve así: " + animal.moverse());
        }
    }
    
    public void mostrarAnimales() {
        for (Animal animal : animales) {
            System.out.println(animal);
        }
    }
    
}