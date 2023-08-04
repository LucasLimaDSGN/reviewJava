package start;

import java.util.Scanner;

public class PrimitiveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner (System.in);
		System.out.println("Qual o nome?");
		String nome = read.nextLine();
		System.out.println("Qual a nota?");
		float nota = read.nextFloat();
		System.out.printf("Olá, %s. Sua nota é %.2f", nome, nota);
	}

}
