package EJ3;

import java.util.Arrays;
import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 4, 6, 8 };
		int posicion = 0;
		int numero = 0;
		int[] nuevoarray;

		mostrar(array);
		System.out.println("");
		posicion=pedirDigito("Introduce posicion: ");
		numero=pedirDigito("Introduce el dato: ");
		posicion = posicion - 1;
		nuevoarray = insertarArray(array, numero, posicion);
		mostrar(nuevoarray);

	}

	public static int[] insertarArray(int[] a, int b, int c) {

		int[] nuevoArray = resizeArray(a);
		int cambio;
		int aux;
		boolean end = false;

		for (int i = 0; i < nuevoArray.length && !end; i++) {
			if (c == i) {
				for (int j = i; j < nuevoArray.length; j++) {
					aux = nuevoArray[j];
					nuevoArray[j] = b;
					b = aux;
				}
				end = true;
			}
		}

		return nuevoArray;

	}

	public static void mostrar(int[] c) {
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
			if (i < c.length - 1)
				System.out.print(",");

		}
	}

	public static int pedirDigito(String cadena) {
		Scanner teclado = new Scanner(System.in);

		System.out.println(cadena);
		int b = teclado.nextInt();
		return b;
	}

	public static int[] resizeArray(int[] a) {

		int[] arrayAux = Arrays.copyOf(a, a.length + 1);
		return arrayAux;
	}
}