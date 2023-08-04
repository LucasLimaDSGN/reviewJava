package start;

import java.util.Scanner;

public class ChainedCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		int bdyear,age;
		
		System.out.println("Ano de Nascimento: ");
		bdyear = read.nextInt();
		
		age = 2023-bdyear;
		
		if(age>=16&&age<18){
			System.out.format("Sua idade é %d. \nSeu voto é opcional", age);
		}else if(age>=18&&age<65) {
			System.out.format("Sua idade é %d. \nSeu voto é obrigatório", age);
		}else {
			System.out.format("Sua idade é %d. \nVocê não pode votar",age);
		}
		}

}
