package ExamenCiclista;

public class Test {
    public static void main(String[] args) {

        // creacion de equipo
        Equipo equipo1 = new Equipo("Equipo1");

        // Ciclistas creados
        Velocista alex = new Velocista("Alex", 20, 40, 20);
        Escalador bryan = new Escalador("Bryan", 20, 40, 10);
        Contrarrelojista whut = new Contrarrelojista("whut", 40, 20);

        // Agregar ciclistas al array
        equipo1.addCiclista(alex);
        equipo1.addCiclista(bryan);
        equipo1.addCiclista(whut);

        // Mostrar Ciclistas
        System.out.println(equipo1.mostrarCiclistas());

        // obtener tiempos de todos los ciclistas del equipo
        System.out.println(equipo1.mostrarTiempoTotal());

    }
}
