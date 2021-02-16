import java.util.Scanner;

public class Kermis {
Attractie[] attracties = new Attractie[6];
Kermis() {
	attracties[0]= new Botsautos();
	attracties[1]= new Spin();
	attracties[2]= new Spiegelpaleis();
	attracties[3]= new Spookhuis();
	attracties[4]= new Hawaii();
	attracties[5]= new Ladderklimmen();
}
void draaien() {
	Scanner sc = new Scanner(System.in);
	String nummer = sc.nextLine();
	int keuze = Integer.valueOf(nummer);
	int keuze2 = keuze - 1;
	System.out.println(keuze2);
	System.out.println("U stapt in de " + attracties[keuze2].naam);
}
}
