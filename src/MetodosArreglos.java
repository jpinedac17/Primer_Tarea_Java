import java.util.Arrays;

public class MetodosArreglos {
	public static void main(String[] args) {
		// Metodos de java.util.Arrays
		
		// 1. Arrays.sort
			int[] numbers = {5, 2, 9, 1, 3};
			
			// Este metodo ordena los elementos de un array de menor a mayor o si fuera un string en orden alfabetica:
			Arrays.sort(numbers);
			System.out.println(Arrays.toString(numbers));
			
		// 2. Arrays.binarySearch
			// Sirve para buscar el indice de un elemento en un array usando búsqueda binaria, pero el array debe haber sido ordenado antes:
			int position = Arrays.binarySearch(numbers, 5);
			System.out.println(position);
			
		// 3. Arrays.copyOf
			// Sirve para copiar un array y cambiarle el tamaño (solo si lo deseas):
			int[] copy = Arrays.copyOf(numbers, 7);
			System.out.println(Arrays.toString(copy));
			
		// 4. Arrays.fill
			// Sirve para llenar todo un array con un mismo valor:
			Arrays.fill(copy, 7);
			System.out.println(Arrays.toString(copy));
			
		// 5. Arrays.equals
			// Sirve para comparar si dos arrays son iguales en su contenido:
			int[] a = {1,2,3};
			int[] b = {1,2,3};
			System.out.println(a == b); // Esta comparacion no funciona porque == compara referencias en memoria, no el contenido.
			System.out.println(Arrays.equals(a, b));

	}
}
