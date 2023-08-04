package start;

import java.util.Scanner;

public class SimpleDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("Numerador:");
		float numerador = read.nextFloat();
		System.out.println("Denominador: ");
		float denominador = read.nextFloat();
		
		float resultado = numerador/denominador;
		float resto = numerador%denominador;
		
		System.out.format("O resultado da divisão entre %.1f e %.1f é %.2f, e o resto da divisão é %.2f", numerador, denominador, resultado, resto);
	
	}

}
