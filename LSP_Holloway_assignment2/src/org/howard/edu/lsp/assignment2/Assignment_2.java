package org.howard.edu.lsp.assignment2;
import java.util.Scanner;
	public class Assignment_2 {

		
		public static int sum = 0, product = 1;
		
		public static void processInput() {
			
			Scanner in = new Scanner(System.in);
			
			while(true) {
				
				System.out.println("String?");
				
				String input = in.nextLine();
				
				if(input.equals("")) System.out.println("You didn't insert any text");
				
				else if(input.equals("Goodbye"))
					break;

			    else
			    	System.out.println("Tokens:");

					for (String word : input.split(" ")) {
						System.out.println(word);
					}
					scanString(input);
					System.out.println("Sum: " + sum);

					System.out.println("Product: " + product);
					sum = 0;
					product = 1;
					System.out.println("\n");
					continue;
			}
			
		}

		public static void scanString(String input) {
		
			int number, index, beginIndex = 0;
			
			String stringNo;
			
			while(true) {
				
					index = input.indexOf(' ');
					
					if(index == -1)
						
					break;

					else {

							number = Integer.parseInt(input.substring(beginIndex, index));
							
							sum += number;
							product *= number;

							input = input.substring(index + 1, input.length());
					}
			}

			number = Integer.parseInt(input);

			sum += number;

			product *= number;

		}

		public static void main(String[] args) {

			// TODO Auto-generated method stub

			processInput();
	}
}
