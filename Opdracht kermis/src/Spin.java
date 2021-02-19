
public class Spin extends RisicoRijkeAttractie {
Spin(){
	naam = "Spin";
	prijs = 2.25;
	kassa = 0;
	kaartjes = 0;
	draailimiet = 5;
	draai = 0;
}

void opstellingsKeuring() {
	draai = draai + 1;
	if(draailimiet == draai) {
		System.out.println("De " + naam +" gaat nu dicht voor onderhoud");
		draai = 0;
 }
}
void kansSpelBelastingBetalen() {
	}
}
