package start;

import java.util.Scanner;

public class RepetitionDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int cc = 0;
//		do {
//			cc++;
//			System.out.println("Cambalhota "+cc);
//		}while(cc<4);
		int n, s=0;
		String resp;
		Scanner read = new Scanner(System.in);
		
		do {
			System.out.print("Digite um numero");
			n = read.nextInt();
			s+=n;
			System.out.print("Deseja continuar? [s/n]");
			resp = read.next();
		}while(resp.equalsIgnoreCase("s"));
		System.out.println("A soma de todos os numeros é: "+s);
	}

}
