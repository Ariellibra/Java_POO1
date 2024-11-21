import java.util.Scanner;
import java.util.ArrayList;
import java.time.*;

class Empleado {
    private String nombre;
    private double salario;
    private LocalDate fecha_alta;

    public Empleado(String nombre, double salario, int year, int month, int day) {
        this.nombre = nombre;
        this.salario = salario;
        fecha_alta = LocalDate.of(year, month, day);
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public LocalDate getFecha_alta() {
        return fecha_alta;
    }

    public void raiseSalario(double byPercent) {
        double raise = salario * byPercent / 100;
        salario += raise;
    }

}

public class Menu {
    ArrayList<Empleado> staff = new ArrayList<Empleado>();
    Scanner Leer = new Scanner(System.in);

    void menu() {
        int opc = 0;
        do {
            do {
                // system("CLS");
                System.out.println("MENU De OPCIONES");
                System.out.println("1 - Ingresar empleado");
                System.out.println("2 - Modificar empleado");
                System.out.println("3 - Dar de baja empleado");
                System.out.println("4 - Aumentar 5% a todos");
                System.out.println("5 - Ver lista de empleados");
                System.out.println("6 - Salir");
                System.out.print("Ingrese una opcion: ");
                opc = Leer.nextInt();
            } while (opc < 1 && opc > 6);

            switch (opc) {
                case 1:
                    this.ingresarEmpleado();
                    System.out.println("Las altas se han llevado a cabo con exito");
                    System.out.println("Tamaño ArrayList: " + staff.size());
                    System.out.print("Para seguir teclee un número");
                    int x = Leer.nextInt();
                    break;
                case 2:
                    boolean z = this.modificarEmpleado();
                    if (z) {
                        System.out.println("La modificacion se ha llevado a cabo con exito");
                        System.out.print("Para seguir teclee un número");
                        int k = Leer.nextInt();
                    } else {
                        System.out.println("El empleado ingresado no se encuentra en la lista");
                        System.out.print("Para seguir teclee un número");
                        int y = Leer.nextInt();
                    }
                    break;
                case 3:
                    if (this.eliminarEmpleado()) {
                        System.out.print("La eliminacion se ha llevado a cabo con exito\n");
                        System.out.print("Para seguir teclee un número");
                        int c = Leer.nextInt();
                        Leer.hasNextLine();
                    } else
                        System.out.print("El empleado ingresado no se encuentra en la lista\n"); {
                    System.out.print("Para seguir teclee un número");
                    int d = Leer.nextInt();
                }
                    break;
                case 4:
                    this.aumentar();
                    System.out.print("El aumento 5% se ha llevado a cabo con exito\n");
                    System.out.print("Para seguir teclee un número");
                    int f = Leer.nextInt();
                    break;
                case 5:
                    this.mostrar();
                    System.out.println("Tamaño ArrayList: " + staff.size());
                    System.out.print("Para seguir teclee un número");
                    int g = Leer.nextInt();
                    break;
                default:
                    break;
            }
        } while (opc != 6);
        this.staff.clear();
        System.out.println("Cantidad de elementos en la  lista: " + this.staff.size());
        if (staff.isEmpty()) {
            System.out.println("La lista quedó vacía porque dimos staff.clear() antes de terminar el programa");
            System.out.println("	Fin Programa	");
        } else {
            System.out.println("La lista no quedó vacía");
        }
    }

    void ingresarEmpleado() {
        staff.add(new Empleado("Carl Cracker", 75000, 1987, 12, 15));
        staff.add(new Empleado("Harry Hacker", 50000, 1989, 10, 1));
        staff.add(new Empleado("Tony Tester", 40000, 1990, 3, 15));
    }

    boolean modificarEmpleado() {
        // Vamos a modificar los nombres de los que quedan con Prueba
        // Mostraremos los índices de cada empleado en el ArrayList
        for (Empleado e : staff) {
            int indice = staff.indexOf(e);
            System.out.println(e.getNombre() + "  Indice: " + indice);
            e.setNombre("Prueba");
        }
        return true;
    }

    boolean eliminarEmpleado() {
        // Vamos a eliminar
        for (Empleado e : staff) {
            if (e.getNombre().equals("Harry Hacker")) {
                staff.remove(e);
                // return true;
            }
        }
        return true;
    }

    void aumentar() {
        // aumentar el salario de todos en un 5%

        for (Empleado e : staff)
            e.raiseSalario(5);
    }

    void mostrar() {
        // print out information about all Empleado objects
        System.out.println("Lista de Empleados");
        for (Empleado e : staff)
            System.out.println("nombre=" + e.getNombre() + ",salario=" + e.getSalario() + ",fecha de alta="
                    + e.getFecha_alta());
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menu();
    }
}
