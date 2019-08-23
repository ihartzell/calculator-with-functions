// Isaac Hartzell
// 2-4-17
// This program demonstrates a calculator with methods invoked.

import java.util.Scanner;

public class CalculatorWithMethods 
{	
	public static void main(String[] args) 
	{
		double lowerLimit= 0;
		double upperLimit= 0;
		double operand1 = 0;
		double operand2 = 0;	
		int numberChoice = 0;
		
		do
		{
			numberChoice = getMenuOption();
				
			if (numberChoice == 1)
			{
				add(operand1, operand2);
			}
				
			else if (numberChoice == 2)
			{
				subtract(operand1, operand2);
			}
				
			else if (numberChoice == 3)
			{
				multiply(operand1, operand2);
			}
				
			else if (numberChoice == 4)
			{
				divide(operand1, operand2);
			}
				
			else if (numberChoice == 5)
			{
				random(lowerLimit, upperLimit);
			}
				
			else if (numberChoice == 6)	// Exit
			{
				
				System.out.println("Goodbye! Thank you for using Isaac's calculator.");	
			}
				
		}while(numberChoice >=1 && numberChoice <= 5);
							
	}
	
	public static int getMenuOption()	// Menu Fn as well as menu checker.
	{
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int numberChoice;
			
		System.out.println("Menu");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Generate Random Number ");
		System.out.println("6. Quit \n");
		System.out.print("What would you like to do? Pick a number 1-6:");
		numberChoice = input.nextInt();
		while ((numberChoice < 1 || numberChoice > 6) && counter < 2)
		{
			counter++;
			
			System.out.println("I'm sorry," + numberChoice + " wasn't one of the options.\n");
			System.out.println("Menu");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Generate Random Number ");
			System.out.println("6. Quit \n");
			System.out.print("What would you like to do? Pick a number 1-6:");
			numberChoice = input.nextInt();
			
			if (counter == 2 && numberChoice < 1 || numberChoice > 6)
			{
				System.out.println("\n"+"I'm sorry, due to (3) incorrect values you've been ");
				System.out.println("locked out. Please try again later.");
			}
			
		}
			
		return numberChoice;
	}
		
	public static double add(double operand1, double operand2)	// Addition Function
	{
		double answer;
		
		operand1 = getOperand("What is the first number?");
		operand2 = getOperand("What is the second number?");
		answer = operand1 + operand2;
		
		System.out.println("Answer:" + answer);
		System.out.println("\n");
		
		return answer;
	}
	
	public static double subtract(double operand1, double operand2)	// Subtraction Function
	{
		double answer;
		
		operand1 = getOperand("What is the first number?");
		operand2 = getOperand("What is the second number?");
		answer = operand1 - operand2;
		
		System.out.println("Answer:" + answer);
		System.out.println("\n");
		return answer;
		
	}
	
	public static double getOperand(String prompt)	// Fuction prints out prompts,
	{
		Scanner input = new Scanner(System.in);
		
		double operand;
		
		System.out.print(prompt );
		operand = input.nextDouble();				
		
		return operand;
	}
	
	public static double multiply(double operand1, double operand2)	// Multiply Function
	{
		double answer;
		
		operand1 = getOperand("What is the first number?");
		operand2 = getOperand("What is the second number?");
		answer = operand1 * operand2;
		
		System.out.println("Answer:" + answer);
		System.out.println("\n");
		
		return answer;
	}
	
	public static double divide(double operand1, double operand2)	// Divide Function
	{
		double answer;
		
		operand1 = getOperand("What is the first number?");
		operand2 = getOperand("What is the second number?");
		
		if (operand2 == 0)
		{
			System.out.println("I'm sorry, devision by 0 isn't allowed here. \n");
			return Double.NaN;
		}
		answer = operand1 / operand2;
		
		System.out.println("Answer:" + answer);
		System.out.println("\n");
		
		return answer;
	}
	
	public static double random(double lowerLimit, double upperLimit)	// Random Number Generator Fn
	{
		double answer;
		
		lowerLimit = getOperand("What is the lower limit?");
		upperLimit = getOperand("What is the upper limit?");
		answer = Math.random() * (upperLimit - lowerLimit) + (lowerLimit); 
		
		System.out.println("Answer:" + answer);
		System.out.println("\n");
		
		return answer;
	}
	
	
	
	
	
	
	
	
	
}
