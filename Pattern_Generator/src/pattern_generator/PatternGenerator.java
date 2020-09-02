package pattern_generator;
import java.util.*;

public class PatternGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("test");
		Scanner console = new Scanner(System.in);
		//createRowNumbers(10,25,5);
		//howManyStripes();

	}
	
	public static int howManyStripes(){
		Scanner stripeNumChoice = new Scanner(System.in);
		System.out.println("How many stripes do you want?");
		int numberOfStripes = 0;
		if(!stripeNumChoice.hasNextInt()){
			System.out.println("Please enter an integer number");
				System.out.println("Please enter a positive integer number");
				return howManyStripes();
			}
		}else
			numberOfStripes = stripeNumChoice.nextInt();
			System.out.println(numberOfStripes);
			return numberOfStripes;
			
	}
	
	public static int[] createRowNumbers(int min, int max, int numStripes) {
		int[] rowNumbers = new int[numStripes];
		int newNum = 0;
		Random random = new Random();
		for(int i = 0; i < numStripes; i++) {
			newNum = (random.nextInt(max-min) + min);
			rowNumbers[i] = newNum;
			System.out.println(rowNumbers[i]);
		}		
		return rowNumbers;
	}

}
