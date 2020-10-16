package SnakeAndLadder;

public class SnakeLadder {	
	
	//Variables
	static int die = 0;
	static int currentPosition =0;
	static int turn = 0;
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to snake and ladder program");
		
		die = (int)Math.floor(Math.random()*7);
		turn = (int)Math.floor(Math.random()*3);
		
		switch(turn)
			{
				case 0: System.out.println("No play");
						break;
				case 1: ladder();
						break;
				case 2: snake();
						break;
			}
	}

	private static void snake() 
	{
		currentPosition = currentPosition - die ;
	}

	private static void ladder() 
	{
		currentPosition = currentPosition + die;
	}

}
