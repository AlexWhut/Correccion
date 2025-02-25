package Examen2;

class Perro extends Animal {
    private String raza;
    private boolean pedigree;
    
    public Perro(String nombre, int edad, CartillaVeterinario cartilla, String raza, boolean pedigree) {
        super(nombre, edad, cartilla);
        this.raza = raza;
        this.pedigree = pedigree;
    }
    
    @Override
    public String hacerSonido() { return "Gua, gua!"; }
    @Override
    public String comer() { return "Come croquetas"; }
    @Override
    public String moverse() { return "Corre felizmente"; }
    
    @Override
    public String toString() {
        return super.toString() + ", Perro{raza='" + raza + "', pedigree=" + pedigree + "}";
    }
}

