import java.util.Arrays;

public class RecorrerArreglo {
	public static void main(String[] args) {
		
		// Recorrer arreglos en Java
		int[] numeros = {10, 20, 30, 40};
		
		// Forma 1: For
			// Esta forma utiliza un contado para ir moviendose en el indice y asi recorrer cada elemento
			for (int i = 0; i < numeros.length; i++) {
				System.out.println(numeros[i]);
			}
		
		// Forma 2: For-each
			// Esta forma genera una variable del elemento haciendo referencia sobre el array y lo recorre sin indices
			for (int numero : numeros) {
				System.out.println(numero);
			}
		
		// Forma 3:
			// Esta forma funciona de una manera muy similar a la anterior, pero cambia en escritura
			Arrays.stream(numeros)
				.forEach(numero -> System.out.println(numero));
	}
}
