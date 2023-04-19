package lambda_Expressions;

interface StringFunction {
	String run(String str);
}
public class Lambda_3 {
	public static void main(String[] args) {
		StringFunction dollar = (s) -> s + "$";
		StringFunction hash = (s) -> s + "#";
		
		printFormatted("Money in dollar" , dollar);
		printFormatted("Hash its my movie" , hash);
	}

	private static void printFormatted(String str,StringFunction format) {
		String result = format.run(str);
		System.out.println(result);
	}

}
