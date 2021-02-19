
public class Hawaii extends RisicoRijkeAttractie {
Hawaii(){
	naam = "Hawaii";
	prijs = 2.90;
	kassa = 0;
	kaartjes = 0;
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
