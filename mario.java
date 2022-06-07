import java.util.Scanner;
 
public class mario {
	
	public static int isNumber(String userInput) {
		int number;
		
		try {
			number = Integer.parseInt(userInput);
		} catch (Exception e) {
			number = -1;
		}
		return number;
	}

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		int height;
		String userInput;
		
		do {
			System.out.print("Height: ");
			userInput = data.nextLine();
			height = isNumber(userInput);
		} while (height < 1 || height > 8);
		
		for (int i = 0; i < height; i++) {
			for (int j = height - 1; j > i; j--) {
				System.out.print(" ");
			}
			
			for (int y = -1; y < i; y++) {
				System.out.print("#");
			}
			
			System.out.print("  ");
			
			for (int x = -1; x < i; x++) {
				System.out.print("#");
			}
			
			System.out.println();
		}
	}

}
