import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Maquinaria> maquinas = new ArrayList<Maquinaria>();

        
        Supervisor norbit = new Supervisor();
        
        maquinas.add(new Excavadora("La palita",2));
        maquinas.add(new CamionMinero("Terreneitor", 5));
        maquinas.add(new Excavadora("La Super excavadora",2));
        maquinas.add(new CamionMinero("Camion FiveM",10));

        for (Maquinaria maquina : maquinas) {
            norbit.supervisarMaquinaria(maquina);
        }
    }
}
