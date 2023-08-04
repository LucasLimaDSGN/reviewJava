package start;

public class StringComparator {
	
	public static void main(String[] args) {
		/*String nome1 = "Lucas";
		String nome2 = "Lucas";
		String nome3 = new String("Lucas");
		String res = (nome1==nome3)?"igual":"diferente";
		
		System.out.print(res);*/
		
		String nome1 = "Lucas";
		String nome2 = "Lucas";
		String nome3 = new String("Lucas");
		String res = (nome1.equals(nome3))?"igual":"diferente";
		
		System.out.print(res);
	}
}
