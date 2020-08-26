package pattern_generator;
import java.util.*;

public class PatternGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("test");
		Scanner console = new Scanner(System.in);
		createRowNumbers(10,25,5);

	}
	
	public static int[] createRowNumbers(int min, int max, int numRows) {
		int[] rowNumbers = new int[numRows];
		int newNum = 0;
		Random random = new Random();
		for(int i = 0; i < numRows; i++) {
			newNum = (random.nextInt(max-min) + min);
			rowNumbers[i] = newNum;
			System.out.println(rowNumbers[i]);
		}		
		return rowNumbers;
	}

}
