package hw10;
import java.util.Random;

public class hw10 {
	public static void main(String[] args) {
		Player[] arrayofPlayers=new Player[8];
		Random r=new Random();
		for(int i=0; i<arrayofPlayers.length; i++) {
			int age=r.nextInt(100);
			arrayofPlayers[i]=new Player("P"+i, age);
		}
		
		for(int i=0; i<arrayofPlayers.length; i++) {
			arrayofPlayers[i].display();
		}
		Player.mergeSort(arrayofPlayers,0,arrayofPlayers.length-1);
		System.out.println("Sorted");
		
		for(int i=0; i<arrayofPlayers.length; i++) {
			arrayofPlayers[i].display();
		}
		boolean answer=Player.binarySearch(arrayofPlayers,19);
		System.out.println(answer);
	}

}
