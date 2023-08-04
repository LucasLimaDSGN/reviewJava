package start;

import java.util.Scanner;

public class SimpleCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		float n1,n2,m;
		
		System.out.println("Primeira nota: ");
		n1 = read.nextFloat();
		System.out.println("Segunda nota: ");
		n2 = read.nextFloat();
		
		m = (n1+n2)/2;
		
		if(m>=7) {
			System.out.println("Parabéns aluno, sua média é: "+m);
		}
//		else {
//			System.out.println("Sua média é: "+m+". Se esforce mais!");
//		}
	}

}
