public class App {
    public static void main(String[] args) throws Exception {
        Alumno alu1 = new Alumno("Ariel");
        Alumno alu2 = new Alumno("Pedro");

        Lapiz negro = new Lapiz("Negro", "Chico");
        Lapiz rosa = new Lapiz("Rosa","Grande");

        alu1.pintar(negro);
        alu1.pintar(rosa);

        alu1.dibujar(negro);
        alu1.dibujar(rosa);

        alu2.pintar(negro);
        alu2.pintar(rosa);

        alu2.dibujar(negro);
        alu2.dibujar(rosa);
    }
}
