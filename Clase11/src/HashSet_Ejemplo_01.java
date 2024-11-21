
// ejemplo de uso de HashSet
// HashSet implementa la interfaz Set
// add(), size() , remove(), contains(), clear(), isEmpty()
// clase del 2020/06/09
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Ejemplo_01 {

	public static void main(String[] args) {

		Set<String> ciudades = new HashSet<String>();

		ciudades.add("Roma");
		ciudades.add("Buenos Aires");
		ciudades.add("Roma");

		// comprobamos que no inserta duplicados
		System.out.println(ciudades);

		// creamos un iterador para recorrer la coleccion

		Iterator<String> iter = ciudades.iterator();

		////////// recorremos el conjunto

		while (iter.hasNext())
			System.out.println(iter.next());

		System.out.println();
		////////
		System.out.println(ciudades.size() + " ciudades distintas. ");

		System.out.println();
		/////////
		ciudades.remove("Roma");
		System.out.println(ciudades.size() + " ciudad");
		System.out.println();
		///////

		System.out.println(ciudades.contains("Roma")); // false
		System.out.println(ciudades.contains("Buenos Aires")); // true
		System.out.println();
		////////
		System.out.println(ciudades);
		System.out.println();
		///////
		System.out.println(ciudades.isEmpty()); // false
		ciudades.clear();
		System.out.println(ciudades.isEmpty()); // true

	}
}

/*
 * [Roma, Buenos Aires]
 * Roma
 * Buenos Aires
 * 
 * 2 ciudades distintas.
 * 
 * 1 ciudad
 * 
 * false
 * true
 * 
 * [Buenos Aires]
 * 
 * false
 * true
 * 
 */
