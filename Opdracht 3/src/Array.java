
public class Array {

	public static void main(String[] args) {
		int[] getallen = {1, 5, 2, 6};
		int som = 0;
		for(int x = 0; x < getallen.length; x++) {
			som = som + getallen[x];
		}
		System.out.println(som);
	}

}
