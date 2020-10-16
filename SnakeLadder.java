package SnakeAndLadder;

public class SnakeLadder {
	
	//Constants
	static final int START_POSITION = 0;
	
	//Variables
	static int die = 0;
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to snake and ladder program");
		die = (int)Math.floor(Math.random()*7);
		System.out.println(die);
	}

}
