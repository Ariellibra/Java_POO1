
import java.util.Map; // Para diccionarios
import java.util.HashMap;

import java.util.Iterator;

public class Map_Ejemplo_01 {

	public static void main(String[] args) {

		// .hasNext() -> devuelve verdadero si el iterador tiene más elementos para
		// recorrer
		// .next() -> devuelve el próximo elemento y avanza a la próxima posición

		Map<String, Double> precios = new HashMap<String, Double>();
		precios.put("pan", 150.0);
		precios.put("asado", 550.75);
		precios.put("queso", 350.65);
		Iterator<Map.Entry<String, Double>> iterMapa = precios.entrySet().iterator();

		while (iterMapa.hasNext()) { // mientras haya elementos para recorrer...
			Map.Entry<String, Double> actual = iterMapa.next(); // mostramos el elemento por pantalla
			System.out.println(actual);
		}
	}
}
