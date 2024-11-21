import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

class Avioneta {
    private String matricula;

    public Avioneta(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}

class Estacionamiento {
    private Queue<Avioneta> estacionamiento;
    private Queue<Avioneta> espera;
    private int capacidadMaxima;

    public Estacionamiento(int capacidadMaxima) {
        this.estacionamiento = new LinkedList<>();
        this.espera = new LinkedList<>();
        this.capacidadMaxima = capacidadMaxima;
    }

    public void llegada(Avioneta avioneta) {
        if (estacionamiento.size() < capacidadMaxima) {
            estacionamiento.add(avioneta);
            System.out.println("Avioneta " + avioneta.getMatricula() + " ha llegado al estacionamiento.");
        } else {
            espera.add(avioneta);
            System.out.println(
                    "Estacionamiento lleno. Avioneta " + avioneta.getMatricula() + " añadida a la lista de espera.");
        }
    }

    public void salida(String matricula) {
        LinkedList<Avioneta> temp = new LinkedList<>();

        while (!estacionamiento.isEmpty()) {
            Avioneta avioneta = estacionamiento.poll();
            if (avioneta.getMatricula().equals(matricula)) {
                System.out.println("Avioneta " + avioneta.getMatricula() + " ha salido del estacionamiento.");
                break;
            } else {
                temp.add(avioneta);
            }
        }

        while (!temp.isEmpty()) {
            estacionamiento.add(temp.poll());
        }

        if (!espera.isEmpty() && estacionamiento.size() < capacidadMaxima) {
            Avioneta siguienteEnEspera = espera.poll();
            estacionamiento.add(siguienteEnEspera);
            System.out.println("Avioneta " + siguienteEnEspera.getMatricula()
                    + " ha ingresado al estacionamiento desde la lista de espera.");
        }
    }

    public void mostrarEstacionamiento() {
        System.out.println("Estacionamiento actual:");
        for (Avioneta avioneta : estacionamiento) {
            System.out.println("- " + avioneta.getMatricula());
        }
        System.out.println("Cola de espera:");
        for (Avioneta avioneta : espera) {
            System.out.println("- " + avioneta.getMatricula());
        }
    }
}

public class Pilita {
    public static void main(String[] args) {
        Estacionamiento estacionamiento = new Estacionamiento(12);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "Ingrese una acción (E para llegada, S para salida) y la matrícula de la avioneta (ejemplo: E ABC123):");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            if (parts.length != 2) {
                System.out.println("Entrada no válida. Por favor, intente de nuevo.");
                continue;
            }

            String accion = parts[0];
            String matricula = parts[1];

            if (accion.equalsIgnoreCase("E")) {
                Avioneta avioneta = new Avioneta(matricula);
                estacionamiento.llegada(avioneta);
            } else if (accion.equalsIgnoreCase("S")) {
                estacionamiento.salida(matricula);
            } else {
                System.out.println("Acción no válida. Por favor, intente de nuevo.");
            }

            estacionamiento.mostrarEstacionamiento();
        }
    }
}
