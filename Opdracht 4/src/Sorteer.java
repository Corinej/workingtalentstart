import java.util.Arrays;
public class Sorteer {

	public static void main(String[] args) {
		// int[] array = {4,6,2,8,1,5,3,9,7,10};

        // Arrays.sort(array);
 
       //  System.out.printf("Sorted array : %s",
       //                   Arrays.toString(array));

        
        int[] random = new int[10];
        for(int i = 0; i < random.length; i++) {
        	random[i] = (int)(Math.random()*100 +1);
        }
        
        System.out.println("Random numbers: " + Arrays.toString(random));
        
        Arrays.sort(random);
        
        System.out.println("Gesorteerd: " + Arrays.toString(random));
	}

}
