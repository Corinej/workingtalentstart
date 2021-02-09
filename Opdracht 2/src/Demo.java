import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tekst = sc.nextLine();
		int counter = 0;
		for(int x = 0; x < tekst.length(); x++) {
			if(tekst.charAt(x) == 'e'){
				counter = counter + 1;
			}
	}
		System.out.println(counter);
}
}