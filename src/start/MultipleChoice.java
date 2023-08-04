package start;

import java.util.Scanner;

public class MultipleChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int legs;
		String type;
		
		System.out.println("Quantas pernas tem o animal? ");
		legs = read.nextInt();
		switch(legs) {
		case 1:
			type = "Saci";
			break;
		case 2:
			type = "Bipede";
			break;
		case 4:
			type = "Quadrupede";
			break;
		case 6,8:
			type = "Aranha";
			break;
		default:
			type = "ET";
		}
		System.out.println("O animal é um "+ type);
	}

}
