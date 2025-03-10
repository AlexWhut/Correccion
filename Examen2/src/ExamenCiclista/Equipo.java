package ExamenCiclista;

import java.util.ArrayList;

public class Equipo {
    private String name;
    private ArrayList<Ciclista> ciclistas;

    public Equipo(String name) {
        this.name = name;
        this.ciclistas = new ArrayList<>();
    }

    public void addCiclista(Ciclista c){
        ciclistas.add(c);
    }

    public void mostrarCiclistas(){
        for (Ciclista i : ciclistas){
            System.out.println("Numero de ciclista: " + i.getNumero() + " - " + i.getNombre());
        }
    }

    public void mostrarTiempoTotal(){
        double tiempoTotal = 0;
        for (Ciclista c : ciclistas) {
            tiempoTotal += c.getTiempo();
        }
        System.out.println("Tiempo total del equipo: " + tiempoTotal);
    }

    @Override
    public String toString() {
        return "Equipo [name=" + name + ", ciclistas=" + ciclistas + "]";
    }
}
