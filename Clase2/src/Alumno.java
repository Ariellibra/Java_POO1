public class Alumno {
	private
    String nombre;
    String apellido;
    int dni;
    int edad;
    public
    Alumno()
    {
    	System.out.println("Estoy en el Constructor");
    	System.out.println( "Valor entero de la dirección de memoria a la que apunta el puntero this: " + this.hashCode());
      System.out.println("Valor Hexadecimal de la dirección de memoria a la que apunta el puntero this : " + Integer.toHexString(this.hashCode()));
    	this.nombre="Pedro";
    	this.edad=23;    	
    }
    void inscribirse()
    {
    	System.out.println("Se está inscribiendo el Alumno:"+ this.nombre);
    	
    }
   /**  @Override
    public String toString() {
       return "nombre: "+ this.nombre + " Edad: " +this.edad;
    }*/
}