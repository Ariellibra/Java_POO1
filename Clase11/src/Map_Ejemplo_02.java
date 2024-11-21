
/**
 * MAPA / DICCIONARIO:
 * - Coleccion tipo clave-valor
 * 		- a una clave (key) le asigna un valor (value)
 * 		- la clave es unica, los valores no
 * 		- la clave no puede ser nula (null)
 * 
 * put(), get(), keySet(), keySet()
 * 
 */

import java.util.Map; // Interfaz Map
import java.util.HashMap; // Implementación
import java.util.Set; // Para almacenar las claves
import java.util.Collection; // Para almacenar los valores

public class Map_Ejemplo_02 {
	public static void main(String[] args) {
		/*
		 * galletitas -> 100 gaseosa -> 50 cereales -> 75
		 */
		Map<String, Integer> productos = new HashMap<String, Integer>();

		productos.put("galletitas", 100); // A la clave "galletitas" le asigno el valor 100
		productos.put("gaseosa", 50); // A la clave "gaseosa" le asigno el valor 50
		productos.put("cereales", 75); // A la clave "cereales" le asigno el valor 75

		System.out.println(productos.get("galletitas")); // Muestra el valor para la clave "galletitas"
		Integer cantidadGaseosa = productos.get("gaseosa"); // Almaceno el valor para la clave "gaseosa"
		System.out.println("Gaseosa: " + cantidadGaseosa);
		System.out.println("Verduras: " + productos.get("verduras")); // La clave no existe; devuelve null

		System.out.println(productos.containsKey("gaseosa")); // Pregunto si existe la clave "gaseosa"
		System.out.println(productos.containsKey("verduras")); // Pregunto si existe la clave "verduras"

		System.out.println(productos.containsValue(100)); // Pregunto si existe el valor 100
		System.out.println(productos.containsValue(150)); // Pregunto si existe el valor 150

		productos.put("gaseosa", 80); // Sobreescribe el valor para la clave "gaseosa"
		System.out.println("La clave 'gaseosa' contiene el valor " + productos.get("gaseosa"));

		// productos.remove("gaseosa"); // Elimina el elemento con clave "gaseosa"
		// System.out.println("La clave 'gaseosa' contiene el valor " +
		// productos.get("gaseosa"));

		// productos.remove("cereales", 70); // Elimina el par clave-valor "cereales"-70
		// (no existe)
		// System.out.println("La clave 'cereales' contiene el valor " +
		// productos.get("cereales"));

		// Obtener todas las claves
		Set<String> claves = productos.keySet();
		System.out.println(claves);

		// Obtener todos los valores
		Collection<Integer> valores = productos.values();
		System.out.println(valores);

		// Muestro todo el conjunto de pares clave-valor que componen el diccionario
		System.out.println(productos.entrySet()); // entrySet() devuelve Set<Entry<String, Integer>>

		System.out.println();

		for (Map.Entry<String, Integer> e : productos.entrySet()) {
			System.out.println("A la clave '" + e.getKey() + "' le corresponde el valor " + e.getValue());
		}

		System.out.println();

		// Otra forma de recorrer el diccionario...
		Set<String> listaDeClaves = productos.keySet(); // ["galletitas", "gaseosa", "cereales"]
		for (String clave : listaDeClaves) {
			System.out.println("A la clave " + clave + " le corresponde valor " + productos.get(clave));
		}

	}
}
