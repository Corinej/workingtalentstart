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
void instappen() {
	int Switch = 1;
	while(Switch == 1) {
	Scanner sc = new Scanner(System.in);
	String nummer = sc.nextLine();
	int keuze = Integer.valueOf(nummer);
	int keuze2 = keuze - 1;
	//System.out.println(keuze2);
	System.out.println("U ben in de attractie " + attracties[keuze2].naam + " gestapt");
	attracties[keuze2].kassa = attracties[keuze2].kassa + attracties[keuze2].prijs;
	attracties[keuze2].kaartjes = attracties[keuze2].kaartjes + 1;
	totaalkassa.omzet = totaalkassa.omzet + attracties[keuze2].kassa;
	totaalkassa.tickets = totaalkassa.tickets + attracties[keuze2].kaartjes;
	System.out.println("Wilt u nog een attractie doen? ja of nee");
	Scanner antwoord = new Scanner(System.in);
	String Antwoord = antwoord.nextLine();
	Switch = 0;
	if(Antwoord.equals("ja")) {
		Switch = 1;
	}else {
		Switch = 0;
	
 }
	}
}


void tonen() {
	System.out.println("Kies 'o' voor omzet of 'k' voor kaartjesaantal");
	Scanner sc2 = new Scanner(System.in);
	String letter = sc2.nextLine();
	if(letter.equals("o")) {
		System.out.println("Er is " +totaalkassa.omzet +" verdiend op de kermis");
	}else if(letter.equals("k")) {
		System.out.println("Er zijn " +totaalkassa.tickets + " tickets verkocht");
	}else {
		System.out.println("Voer een geldige letter in");
	}
	
	
}

Kassa totaalkassa = new Kassa();


}
