public class App {

    public static void calcularSueldo(Empleado i){
        i.averiguaSueldo();
    }

    public static void main(String[] args) throws Exception {
        //Empleado ñoqui = new Empleado(); 
        Cajero martin = new Cajero("Martin", 1500, "Cajero");
        Mozo julian = new Mozo("Julian", 1200, "Mozo");

        martin.averiguaSueldo();
        julian.averiguaSueldo();

        julian.darPropina(200);
        julian.darPropina(150);
        julian.darPropina(35);
        
        martin.averiguaSueldo();
        julian.averiguaSueldo();

        calcularSueldo(julian);
        calcularSueldo(martin);

        //ñoqui.getTipoEmpleado(julian);
    }
}
