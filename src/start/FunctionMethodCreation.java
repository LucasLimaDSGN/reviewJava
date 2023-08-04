package start;

public class FunctionMethodCreation {
	public static String contador(int i, int f) {
		String s = "";
		for (int c = i; c<=f; c++) {
			s+=c + " ";
		}
		return s;
	}
}
