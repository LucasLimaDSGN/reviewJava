package start;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);

		System.out.println("Primeira nota: ");
		float nota1 = read.nextFloat();
		System.out.println("Segunda nota; ");
		float nota2 = read.nextFloat();
		
		float media = (nota1+nota2)/2;
		
		System.out.println("A media final é: "+ media);
	}

}
