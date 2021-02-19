
public class Ladderklimmen extends Attractie implements GokAttractie{

Ladderklimmen(){
	naam = "Ladderklimmen";
	prijs = 5;
	kassa = 0;
	kaartjes = 0;
	reserveren = 0;
}
void opstellingsKeuring(){
	}

public void kansSpelBelastingBetalen() {
	reserveren = reserveren + 0.3*prijs;
}
}

