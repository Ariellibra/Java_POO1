import java.io.*;
import java.util.*;

class Vendedor implements Serializable {
    private int numeroVendedor;
    private String dni;
    private String nombre;
    private int productosVendidos;

    // Constructor
    public Vendedor(int numeroVendedor, String dni, String nombre, int productosVendidos) {
        this.numeroVendedor = numeroVendedor;
        this.dni = dni;
        this.nombre = nombre;
        this.productosVendidos = productosVendidos;
    }

    // Getters y Setters
    public int getNumeroVendedor() {
        return numeroVendedor;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(int productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "numeroVendedor=" + numeroVendedor +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", productosVendidos=" + productosVendidos +
                '}';
    }
}

class VentasException extends Exception {
    public VentasException(String mensaje) {
        super(mensaje);
    }
}

public class Archivos {

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            // 1) Crear 4 Objetos de la Clase Ventas
            Vendedor v1 = new Vendedor(1, "12345678A", "Juan", 50);
            Vendedor v2 = new Vendedor(2, "23456789B", "Ana", 30); // Menos de 40 productos
            Vendedor v3 = new Vendedor(3, "34567890C", "Luis", 60);
            Vendedor v4 = new Vendedor(4, "45678901D", "Marta", 70);

            // 2) Generar LinkedList y manejar excepciones
            LinkedList<Vendedor> lista1 = new LinkedList<>();
            for (Vendedor vendedor : Arrays.asList(v1, v2, v3, v4)) {
                if (vendedor.getProductosVendidos() < 40) {
                    throw new VentasException("Vendedor con ventas menores a 40: " + vendedor);
                }
                lista1.add(vendedor);
            }

            // 3) Mostrar la lista1
            System.out.println("Lista de Vendedores:");
            lista1.forEach(System.out::println);

            // 4) Ordenar la lista por DNI y mostrarla
            lista1.sort(Comparator.comparing(Vendedor::getDni));
            System.out.println("\nLista ordenada por DNI:");
            lista1.forEach(System.out::println);

            // 5) Copiar lista1 en un ArrayList
            ArrayList<Vendedor> array1 = new ArrayList<>(lista1);

            // 6) Generar archivos
            generarArchivos(array1);

            // 7) Leer Archivo2 y manejar la pila
            Stack<Vendedor> pila1 = leerArchivo2("C:/Parcial2/Archivo2");
            manejarPila(pila1);

            // 8) Leer Archivo3 y generar un TreeSet
            TreeSet<Vendedor> tree1 = leerArchivo3("C:/Parcial2/Archivo3");
            System.out.println("\nTreeSet generado desde Archivo3:");
            tree1.forEach(System.out::println);

        } catch (VentasException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error de archivo: " + e.getMessage());
        }
    }

    private static void generarArchivos(ArrayList<Vendedor> array1) throws IOException {
        // Crear directorio
        new File("C:/Parcial2").mkdirs();

        // Archivo1: Objetos
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Parcial2/Archivo1"))) {
            for (Vendedor v : array1) {
                oos.writeObject(v);
            }
        }

        // Archivo2: Binario
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:/Parcial2/Archivo2"))) {
            for (Vendedor v : array1) {
                dos.writeInt(v.getNumeroVendedor());
                dos.writeUTF(v.getDni());
                dos.writeUTF(v.getNombre());
                dos.writeInt(v.getProductosVendidos());
            }
        }

        // Archivo3: CSV
        try (PrintWriter pw = new PrintWriter(new FileWriter("C:/Parcial2/Archivo3"))) {
            for (Vendedor v : array1) {
                pw.println(v.getNumeroVendedor() + "," + v.getDni() + "," + v.getNombre() + ","
                        + v.getProductosVendidos());
            }
        }
    }

    private static Stack<Vendedor> leerArchivo2(String path) throws IOException {
        Stack<Vendedor> pila = new Stack<>();
        try (DataInputStream dis = new DataInputStream(new FileInputStream(path))) {
            while (dis.available() > 0) {
                int numero = dis.readInt();
                String dni = dis.readUTF();
                String nombre = dis.readUTF();
                int vendidos = dis.readInt();
                pila.push(new Vendedor(numero, dni, nombre, vendidos));
            }
        }
        return pila;
    }

    private static void manejarPila(Stack<Vendedor> pila) throws IOException {
        Scanner sc = new Scanner(System.in);

        // Mostrar pila
        System.out.println("\nPila Original:");
        pila.forEach(System.out::println);

        // Eliminar un vendedor por DNI
        System.out.print("\nIngrese DNI del vendedor a eliminar: ");
        String dniEliminar = sc.nextLine();
        pila.removeIf(v -> v.getDni().equals(dniEliminar));

        // Restaurar pila tras recorrerla
        LinkedList<Vendedor> auxiliar = new LinkedList<>(pila);
        System.out.println("\nPila tras eliminar:");
        auxiliar.forEach(System.out::println);
    }

    private static TreeSet<Vendedor> leerArchivo3(String path) throws IOException {
        TreeSet<Vendedor> treeSet = new TreeSet<>(Comparator.comparing(Vendedor::getDni));
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int numero = Integer.parseInt(data[0]);
                String dni = data[1];
                String nombre = data[2];
                int vendidos = Integer.parseInt(data[3]);
                treeSet.add(new Vendedor(numero, dni, nombre, vendidos));
            }
        }
        return treeSet;
    }
}