import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println(
					"Ingrese su operación \n 1 para multiplicar \n 2 para restar \n 3 para sumar \n 4 para dividir");
			opcion = teclado.nextInt();
		} while (opcion < 1 && opcion > 4);
		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();
		
		switch(opcion) {
		case 1:
			Multiplicar(a,b);
			break;
		case 2:
			Restar(a,b);
			break;
		case 3: 
			Sumar(a,b)
			break;
		case 4:
			Division(a,b);
			break;
		
		default:
			System.out.println("Opción Inválida");
			break;
		}

		teclado.close();
		System.out.println("El resultado es " + resultado.toString());
	}

	public int Sumar (int a, int b) {
		return a + b;
	}

	public int Restar (int a, int b) {
		return a + b;
	}

	public int Multiplicar (int a, int b) {
		return a * b;
	}

	public int Division (int a, int b) {
		int aux = 0;
		if(b != 0){
			aux = a/b;
		}
		else aux = 0;
		
		return aux;
	}

}