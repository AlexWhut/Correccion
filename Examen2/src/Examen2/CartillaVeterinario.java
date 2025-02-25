package Examen2;

public class CartillaVeterinario {
    private int yearNacimiento;
    private int vacunas;
    private int enfermedades;
    private String nombreVeterinario;
    
    public CartillaVeterinario(int year, String veterinario) {
        this.yearNacimiento = year;
        this.vacunas = 0;
        this.enfermedades = 0;
        this.nombreVeterinario = veterinario;
    }
    
    public void incrementarVacunas() { vacunas++; }
    public void incrementarEnfermedades() { enfermedades++; }
    public String getNombreVeterinario() { return nombreVeterinario; }
    
    @Override
    public String toString() {
        return "Cartilla{Año=" + yearNacimiento + ", Vacunas=" + vacunas + ", Enfermedades=" + enfermedades + ", Veterinario='" + nombreVeterinario + "'}";
    }
}
