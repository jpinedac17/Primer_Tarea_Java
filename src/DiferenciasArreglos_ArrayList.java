import java.util.ArrayList;
import java.util.Arrays;

public class DiferenciasArreglos_ArrayList {
	public static void main(String[] args) {
		
		// Diferencias entre arreglos y ArrayList en Java
		
		// Tamaño fijo vs tamaño dinámico:
			// Los arreglos tienen un tamaño fijo, no se puede cambiar después de crearlos
			int[] numbers = new int[5];
			
			// Los ArrayList tienen un tamaño dinamico, crece al agregar elementos nuevos
			var names = new ArrayList<String>();
			
		// Tipos primitivos vs clases envolventes
			// Los arreglos usan tipos primitivos: int, double, etcd
			// Los ArrayList solo usan objetos, la clase de un primitivo: int -> Integer, char -> Character, etc.
			
		// Agregar elementos
			int[] num = {1, 2, 3};
			num[1] = 5; // Arreglo: no se puede agregar solo cambiar el valor de uno ya existente
			names.add("Jeiner"); // ArrayList
			
		// Sintaxis para acceder a un elemento
			System.out.println(num[1]); // Arreglo
			names.get(0); // ArrayList
			
		// Metodos disponibles:
			// Los arreglos tienen menos metodos y se usan con Arrays. seguido del nombre del metodo y entre parentesis el arreglo:
				Arrays.sort(num);
			// Los ArrayList se usan con el nombre del ArrayList seguido de .nombreMetodo, ejemplo: 
				names.remove(0);
				
		// Rendimiento:
			// Los arreglos son mas rapidos y consumen menos memoria
			// Los ArrayList son mas pesados, pero son mas flexibles en su uso

		// Usar Arreglos cuando el rendimiento importe y sepamos el tamaño exacto que usaremos
		// Usar ArrayList cuando no sabemos cuantos elementos tendremos o necesitemos agregar y eliminar datos 
	}
}
