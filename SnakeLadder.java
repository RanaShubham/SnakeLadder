package SnakeAndLadder;

public class SnakeLadder {	
	
	//constants
	 static final int MAX_POS = 100;
	 static final int MIN_POS = 0;
	 static int player1_pos;
	 static int player2_pos;
	 
	//Variables
	 static int die = 0;
	 int currentPosition = 0;
	 int turn = 1;
	 int dieRolls = 0;
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to snake and ladder program");
		
		SnakeLadder player1 = new SnakeLadder();
		SnakeLadder player2 = new SnakeLadder();

		while(true)
		{
			 player1_pos = player1.movePlayer();
			 player2_pos = player2.movePlayer();
			
			if (player1_pos == 100)
			{
				System.out.println("Player 1 won with "+player1.dieRolls+" rolls");
				break;
			}
			if (player2_pos == 100)
			{
				System.out.println("Player 2 won with "+player2.dieRolls+" rolls");
				break;
			}
		}
	}

	//To move players
	private int movePlayer()
	{
		while (true)
		{			
			die = (int)Math.floor(Math.random()*7);
			this.dieRolls = this.dieRolls + 1;
			this.turn = (int)Math.floor(Math.random()*3);
			switch(turn)
				{
					case 0: break;
					case 1: ladder(this);
							break;
					case 2: snake(this);
							break;
				}
						
			if (this.currentPosition == MAX_POS) 
				{
					return 100;
				}
			
			if(this.turn != 1)
				break;
			
		}
		return 0;
	}
	
	//backward move for players
	private void snake(SnakeLadder obj) 
	{
		if (obj.currentPosition - die >= MIN_POS)
		obj.currentPosition = obj.currentPosition - die ;
	}
	
	//Forward move for players
	private void ladder(SnakeLadder obj) 
	{
		if (obj.currentPosition + die <= MAX_POS)
		obj.currentPosition = obj.currentPosition + die;
	}

}
