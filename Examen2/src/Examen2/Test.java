package Examen2;

public class Test {
    public static void main(String[] args) {
        // Crear la granja
        Granja granja = new Granja("Granja Bogota", "Bogota");
        
        // Crear objetos de animales (Gatos y Perros)
        Gato gato01 = new Gato("Macarena", 8, new CartillaVeterinario(2016, "Dr. Gómez"), "Naranja, negro, blanco", "Colombia");
        Gato gato02 = new Gato("Ninja", 1, new CartillaVeterinario(2022, "Dr. Pérez"), "Negro", "Colombia");
        
        Perro perro01 = new Perro("Junior", 10, new CartillaVeterinario(2013, "Dr. Ramírez"), "Pura", true);
        Perro perro02 = new Perro("Tequila", 4, new CartillaVeterinario(2019, "Dr. Ramírez"), "Mezcla", false);
        Perro perro03 = new Perro("Bombom", 4, new CartillaVeterinario(2019, "Dr. Ramírez"), "Mezcla", false);
        
        // Agregar animales a la granja
        granja.agregarAnimal(gato01);
        granja.agregarAnimal(gato02);
        granja.agregarAnimal(perro01);
        granja.agregarAnimal(perro02);
        granja.agregarAnimal(perro03);
        
        // Mostrar todos los animales
        System.out.println("Lista de animales en la granja:");
        granja.mostrarAnimales();
        
        // Vacunar a todos los animales
        System.out.println("\nVacunando a todos los animales...");
        granja.vacunarTodos();
        
        // Enfermar a un animal
        System.out.println("\nEnfermando a un animal...");
        granja.enfermarAnimal(2);
        
        // Mostrar sonidos de cada animal
        System.out.println("\nSonidos de los animales:");
        granja.mostrarSonidos();
        
        // Mostrar qué comen los animales
        System.out.println("\nComida de los animales:");
        granja.mostrarComida();
        
        // Mostrar cómo se mueven los animales
        System.out.println("\nMovimiento de los animales:");
        granja.mostrarMovimientos();
        
        // Mostrar el total de animales creados
        System.out.println("\nTotal de animales en la granja: " + Animal.getTotalAnimales());
    }
}