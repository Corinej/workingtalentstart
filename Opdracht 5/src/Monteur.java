
class Monteur {
	int portemonee = 0;
	void repareren(Auto jojo){
		System.out.println("Ik repareer je auto wel");
		if(jojo.uitlaat == true) {
			System.out.println("Je uitlaat werkt al");
			
		}else {
			jojo.uitlaat = true;
			System.out.println("Ik heb je uitlaat gefixt");
			portemonee = portemonee + 25;
		}
		if(jojo.voorruit == true) {
			System.out.println("Je voorruit is prima hoor");
			
		}else {
		 jojo.voorruit = true;
			System.out.println("Ik heb je voorruit gefixt");
			portemonee = portemonee + 25;
	    }
		if(jojo.deur == true) {
			System.out.println("Je deur sluit zoals het hoort");
			
		}else {
		 jojo.deur = true;
			System.out.println("Ik heb je deur gefixt");
			portemonee = portemonee + 25;
		}
		if(jojo.motor == true) {
			System.out.println("Je motor draait perfect");
			
		}else {
		 jojo.motor = true;
			System.out.println("Ik heb je motor gefixt");
			portemonee = portemonee + 25;
		}
	}
	void betalen() {
		System.out.println("Dat wordt dan " + portemonee + " euro alsjeblieft");
	}
}