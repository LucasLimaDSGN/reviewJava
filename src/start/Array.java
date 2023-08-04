package start;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = new int [4];
		n[0] = 3;
		n[1] = 5;
		n[2] = 8;
		n[3] = 2;
		
		int num[] = new int [8];
	
		Scanner read = new Scanner(System.in);
		
		String mes[]= {"janeiro","fevereiro","março","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"};
		int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
/*		int resp;

			System.out.println("Digite o numero do mes que você quer saber o total de dias: ");
			resp = read.nextInt();
			
			System.out.println("O mes de "+mes[resp-1]+". Tem um total de "+tot[resp-1]+" dias.");
			
		for(int i=0;i<mes.length;i++) {
			System.out.println("O mes de "+mes[i]+". Tem um total de "+tot[i]+" dias.");
*/	
		Arrays.fill(num,8);
		Arrays.sort(n);	
		for(int valor:num) {
			System.out.println(valor);
		}
		
		int pos = Arrays.binarySearch(num,8);
		System.out.println("O valor 8 está na posição: "+pos);
	}	
	}

	
