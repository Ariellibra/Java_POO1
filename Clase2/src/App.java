public static void main(String[] args) {
		Alumno alu1=new Alumno();
        System.out.println("Estoy en el main");
		System.out.println("Cuando se imprime alu1,muestra: "+alu1);
		System.out.println( "Valor entero de la dirección de memoria del Objeto alu1: " + alu1.hashCode());
	    System.out.println("Valor Hexadecimal de la dirección de memoria del Objeto alu1: " + Integer.toHexString(alu1.hashCode()));
        System.out.println("Nose que hay abajo");
        System.out.println(alu1);
		alu1.inscribirse();
}