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
		
		Scanner input = new Scanner(System.in);
		
		int menuOption = getMenuOption(numberChoice);
			
				
				
				
			if (menuOption == 1)
			{
				add(operand1, operand2);
			}
				
			else if (menuOption == 2)
			{
				subtract(operand1, operand2);
			}
				
			else if (menuOption == 3)
			{
				multiply(operand1, operand2);
			}
				
			else if (menuOption == 4)
			{
				divide(operand1, operand2);
			}
				
			else if (menuOption == 5)
			{
				random (lowerLimit, upperLimit);
			}
				
			else if (menuOption == 6)
			{
				System.out.println("Goodbye! Thank you for using Isaac's calculator.");
					
			}
				
				
				
			
				
				
				
		}
	
	public static int getMenuOption(int numberChoice)
	{
		
		
		
		Scanner input = new Scanner(System.in);
			
		System.out.println("Menu");						
		System.out.println("1. Add");					
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Generate Random Number ");
		System.out.println("6. Quit \n");
		System.out.print("What would you like to do? Pick a number 1-6:");
		numberChoice = input.nextInt();
			
		while (numberChoice < 1 || numberChoice > 6) 
		{
				
				
				
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
		}
		
		return numberChoice;	
	}
	public static double add(double operand1, double operand2)
	{
		double answer;
		operand1 = getOperand("What is the first number?");
		operand2 = getOperand("What is the second number?");
		answer = operand1 + operand2;
		System.out.println(answer);
		
		return answer;
	}
	public static double subtract(double operand1, double operand2)
	{
		double answer;
		operand1 = getOperand("What is the first number?");
		operand2 = getOperand("What is the second number?");
		answer = operand1 - operand2;
		System.out.println(answer);
		
		return answer;
		
	}
	public static double getOperand(String prompt)
	{
		Scanner input = new Scanner(System.in);
		
		double operand;
		System.out.print(prompt );
		operand = input.nextDouble();
		
		return operand;
	}
	public static double multiply(double operand1, double operand2)
	{
		double answer;
		
		operand1 = getOperand("What is the first number?");
		operand2 = getOperand("What is the second number?");
		answer = operand1 * operand2;
		
		System.out.println(answer);
		
		return answer;
	}
	public static double divide(double operand1, double operand2)
	{
		double answer;
		
		operand1 = getOperand("What is the first number?");
		operand2 = getOperand("What is the second number?");
		if (operand2 == 0)
		{
			System.out.println("I'm sorry, devision by 0 isn't allowed here");
			return Double.NaN;
		}
		answer = operand1 / operand2;
		
		System.out.println(answer);
		
		return answer;
	}
	public static double random(double lowerLimit, double upperLimit)
	{
		double answer;
		
		lowerLimit = getOperand("What is the lower limit?");
		upperLimit = getOperand("What is the upper limit?");
		answer = Math.random() * (upperLimit - lowerLimit) + (lowerLimit); 
		System.out.println(answer);
		
		return answer;
	}
	
	
	
	
	
	
	
	
	
}
