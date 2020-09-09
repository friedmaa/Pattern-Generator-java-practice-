package pattern_generator;
import java.util.*;

public class PatternGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("test");
		int numberOfColors = 0;
		List<String> listOfColors = new ArrayList<String>();
		listOfColors = selectColors();
//		Scanner console = new Scanner(System.in);
//		System.out.println("Would you like to enter specific colors? (y/n)");
//		String input = console.next();
//		if (input.equals("n")) {
//			createGenericColorsList();
//		}else if(input.equals("y")){
//			System.out.println("go to createSpecificColorsList");
//		} else if(!(input.equals("n"))||!(input.equals("y"))) {
//			System.out.println("Please enter y or n");
//		}
	}
	//createRowNumbers(10,25,5);
	//int stripeNumber = howManyStripes();
	//createGenericColorsList(7);

	public static List<String> selectColors() {
		List<String> listToReturn = new ArrayList<String>();
		Scanner console = new Scanner(System.in);
		System.out.println("Would you like to enter specific colors? (y/n)");
		String input = console.next();
		if (input.equals("n")) {
			//GENERIC Colors
			int numColors = 0;
			Scanner colorNumIn = new Scanner(System.in);
			System.out.println("Enter the number of colors you would like to use and they will be labeled as 'Color X'.");
			if(!colorNumIn.hasNextInt()){
				System.out.println("Please enter an integer number");
				if(colorNumIn.nextInt() <= 0){
					System.out.println("Please enter a positive integer number");				
				}
			}else
				numColors = colorNumIn.nextInt();
			//createGenericColorsList(numberOfColors);
			for (int i = 0; i < numColors; i++) {
				listToReturn.add("Color " +(i+1));//need the i+1 because i starts at 0
				System.out.println(listToReturn.get(i));
			}
		}if(input.equals("y")){
			//SPECIFIC Colors
			System.out.println("Please type the name of your color and hit enter, when you are finished, type \"done\"");
			//System.out.println("go to createSpecificColorsList");
		} else if(!(input.equals("n"))||!(input.equals("y"))) { 
			System.out.println("Please enter y or n");
			selectColors();
		}
		return listToReturn;
	}

	public static List<String> createSpecificColorsList(int numColors){
		List<String> listToReturn = new ArrayList<String>();

		return listToReturn;
	}

	public static List<String> createGenericColorsList(){
		int numColors = 0;
		Scanner colorNumIn = new Scanner(System.in);
		System.out.println("Enter the number of colors you would like to use and they will be labeled as 'Color X'.");
		if(!colorNumIn.hasNextInt()){
			System.out.println("Please enter an integer number");
			if(colorNumIn.nextInt() <= 0){
				System.out.println("Please enter a positive integer number");				
			}
		}else
			numColors = colorNumIn.nextInt();
		//createGenericColorsList(numberOfColors);
		List<String> listToReturn = new ArrayList<String>();
		for (int i = 0; i < numColors; i++) {
			listToReturn.add("Color " +(i+1));//need the i+1 because i starts at 0
			System.out.println(listToReturn.get(i));
		}
		return listToReturn;
	}

	public static int howManyStripes(){
		Scanner stripeNumChoice = new Scanner(System.in);
		System.out.println("How many stripes do you want?");
		int numberOfStripes = 0;
		if(!stripeNumChoice.hasNextInt()){
			System.out.println("Please enter an integer number");
			if(stripeNumChoice.nextInt() <= 0){
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
