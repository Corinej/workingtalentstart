import java.util.Arrays; 
public class Repareren {

	public static void main(String[] args) {
		boolean[] array = {true, true, false, false};
		String eigenschappen = Arrays.toString(array);
		System.out.println("Dit zijn de eigenschappen van de auto (uitlaat, voorruit, deur, motor): " + eigenschappen);
		Monteur monteur1 = new Monteur();
		Auto auto1 = new Auto(array[0], array[1], array[2], array[3]);
		monteur1.repareren(auto1);
		monteur1.betalen();
	}

}
