import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Kermis kermis = new Kermis();
		System.out.println("Welkom bij de kermis! Kies een attractie: \r\n" + "1 voor botsauto's, \r\n"
				+ "2 voor spin, \r\n"
				+ "3 voor spiegelpaleis, \r\n"
				+ "4 voor spookhuis, \r\n"
				+ "5 voor hawaii, \r\n"
				+ "6 voor ladderklimmen\r\n"
				+ "");
		
		kermis.instappen();
		
		
		kermis.tonen();
	}

}
