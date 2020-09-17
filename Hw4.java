package hw3;

import java.util.Scanner;

public class Hw4 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("please enter a binary number");
		String numberAsString = input.nextLine();
		int numberAsBinary = Integer.parseInt(numberAsString);
		String answer = "";
		while(numberAsBinary != 0)
		{	
			int temp = (numberAsBinary % 16);
			if (temp <10)
			{
			 answer = temp + answer; 
			}
			else if (temp == 10) 
			{
				answer = "A" + answer; 
			}
			else if (temp == 11) 
			{
				answer = "B" + answer; 
			}
			else if (temp == 12) 
			{
				answer = "C" + answer; 
			}
			else if (temp == 13) 
			{
				answer = "D" + answer; 
			}
			else if (temp == 14) 
			{
				answer = "E" + answer; 
			}
			else if (temp == 15) 
			{
				answer = "F" + answer; 
			}
			numberAsBinary = numberAsBinary / 16 ;
				
			
		}
		System.out.println(answer);
		
}
}

				
	
			




