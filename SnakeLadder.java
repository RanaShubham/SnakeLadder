package SnakeAndLadder;

public class SnakeLadder {	
	
	//Variables
	static int die = 0;
	static int currentPosition =0;
	static int turn = 0;
	static int dieRolls = 0;
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to snake and ladder program");
		
		while (true)
		{
			die = (int)Math.floor(Math.random()*7);
			++dieRolls;
			turn = (int)Math.floor(Math.random()*3);
			switch(turn)
				{
					case 0: break;
					case 1: ladder();
							break;
					case 2: snake();
							break;
				}
			
			if (currentPosition == 100) {
				System.out.println("Player has reached postion "+currentPosition+" in "+dieRolls+" die rolls");
				break;
			}
			
		}
	}

	private static void snake() 
	{
		if (currentPosition-die >= 0)
		currentPosition = currentPosition - die ;
	}

	private static void ladder() 
	{
		if (currentPosition + die <= 100)
		currentPosition = currentPosition + die;
	}

}
