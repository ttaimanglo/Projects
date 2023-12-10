package ProjectsBackEnd;

public class Week4 {
	
	public static void main(String[] args) {
		
		System.out.println("---Problem 1---");
		int[] ages = {3, 9 , 23, 64, 2, 8, 28, 93};
		System.out.println(ages[ages.length - 1] - ages[0]);
		
		int[] ages2 = new int[9];
		
		for (int i = 0; i < ages.length; i++) {
			ages2[i] = ages[i];
		}
		ages2[ages2.length-1] = 10;
		
		System.out.println(ages2[ages2.length-1] - ages2[0]);
		
		int averageAge = 0;
		for (int age : ages2) {
			averageAge += age;
		}
		averageAge /= ages2.length;
		System.out.println(averageAge);
		
		System.out.println();
		System.out.println("---Problem 2---");
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int averageLetters = 0;
		String concat = "";
		for (String name : names) {
			averageLetters += name.length();
			concat += " " + name;
		}
		averageLetters /= names.length;
		System.out.println(averageLetters);
		System.out.println(concat);
		
		System.out.println();
		System.out.println("---Problem 5---");
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
			System.out.print(nameLengths[i]+", ");
		}
		
		System.out.println();
		System.out.println("---Problem 6---");
		int sum = 0;
		for (int n : nameLengths) {
			sum += n;
		}
		System.out.println(sum);
		
		System.out.println();
		System.out.println("---Problem 7---");
		System.out.println(wordRepeat("Hello", 3));
		
		System.out.println();
		System.out.println("---Problem 8---");
		System.out.println(fullName("John", "Doe"));
		
		System.out.println();
		System.out.println("---Problem 9---");
		System.out.println(greaterThan100(ages));
		
		System.out.println();
		System.out.println("---Problem 10---");
		double[] agesDouble = {3, 9 , 23, 64, 2, 8, 28, 93};
		System.out.println(averageArray(agesDouble));
		
		System.out.println();
		System.out.println("---Problem 11---");
		double[] agesDoubleTwo = {3, 9 , 23, 64, 2, 8, 28, 93, 1000};
		System.out.println(isAverageGreater(agesDoubleTwo, agesDouble));
		
		System.out.println();
		System.out.println("---Problem 12---");
		System.out.println(willBuyDrink(false, 15.99));
		
		System.out.println();
		System.out.println("---Problem 13---");
		String sequence = "fjkdasfnjk ladsnjkadwnfindsifnadkjlsanfjkewhrfnqkewjfniuewqnfpqewinfiopCodejfoqwehnfopnfophidopfndsnopfnweqopifn";
		String pattern = "Code";
		int indexOfWord = wordSearch(sequence, pattern);
		System.out.println(indexOfWord);
		String wordFound = sequence.substring(indexOfWord, indexOfWord + pattern.length());
		System.out.println(wordFound);
		
	}
	
	public static int wordSearch(String sequence, String pattern) {
		int index = -1;
		
		for (int i = 0; i < sequence.length(); i++) {
			if (index >= 0) {
				break;
			} else if (sequence.charAt(i) == pattern.charAt(0)) {
				int count = i + 1;
				for (int j = 1; j < pattern.length(); j++) {
					if (sequence.charAt(count) == pattern.charAt(j) && j == pattern.length()-1) {
						index = i;
					} else if (sequence.charAt(count) == pattern.charAt(j)) {
						count++;
					} else {
						break;
					}
				}
			} else {
				continue;
			}
		}
		return index;
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return (isHotOutside) && (moneyInPocket > 10.50);
	}
	
	public static boolean isAverageGreater(double[] array, double[] array2) {
		return averageArray(array) > averageArray(array2);
	}
	
	public static double averageArray(double[] array) {
		double sum = 0;
		for (double n : array) {
			sum += n;
		}
		return sum / array.length;
	}
	
	public static boolean greaterThan100(int[] array) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			result += array[i];
		}
		
		if (result > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String fullName(String word, String word2) {
		return word + " " + word2;
	}
	
	public static String wordRepeat(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}
}