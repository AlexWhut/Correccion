package Examen2;

// Clase Gato
class Gato extends Animal {
    private String colorPelo;
    private String paisOrigen;
    
    public Gato(String nombre, int edad, CartillaVeterinario cartilla, String colorPelo, String paisOrigen) {
        super(nombre, edad, cartilla);
        this.colorPelo = colorPelo;
        this.paisOrigen = paisOrigen;
    }
    
    @Override
    public String hacerSonido() { return "Miau, miau!"; }
    @Override
    public String comer() { return "Come pescado"; }
    @Override
    public String moverse() { return "Salta de un mueble a otro"; }
    
    @Override
    public String toString() {
        return super.toString() + ", Gato{colorPelo='" + colorPelo + "', paisOrigen='" + paisOrigen + "'}";
    }
}
