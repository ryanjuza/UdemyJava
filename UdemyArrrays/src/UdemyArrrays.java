
public class UdemyArrrays {
	public static void main(String[] args) {
		
		int value = 7;
		
		int[] values;
		
		values = new int[3];
		
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		
		//print a specific one
		//System.out.println(values[0]);
		
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		System.out.println(); //this is just here for a gap
		
		//assigning in a batch
		int[] numbers = {3, 4, 7,9};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//////////////////////string arrays
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		//should print 'you'
		System.out.println(words[2]);
		
		//assigning in a  batch same as ints above
		String[] fruits = {"apple", "banana", "pear", "orange", "kiwi"};
		//iteration
		for (String fruit: fruits) {
			System.out.println(fruit);
		}
		
		//////////////////////multi-dimensional arrays
		int[][] grid = {
				{2,4,6},
				{1,3,5},
				{1,2,3,4,5,6}
		};
		
		//should print 3
		System.out.println(grid[1][1]);
		//should print 6
		System.out.println(grid[0][2]);
		//should print 5
		System.out.println(grid[2][4]);

		String[][] texts = new String[2][3];
		texts[0][1] = "Hello there";
		System.out.println(texts[0][1]);
		
		//iterate through grid
		for(int row=0; row<grid.length; row++) {
			for(int col=0; col<grid[row].length; col++) {
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println();
		}
		
	}
}
