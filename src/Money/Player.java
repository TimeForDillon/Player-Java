//import java.util.ArrayList;
package Money;

/**
 * A class to represent a player in the game of Monopoly.
 */
public class Player
{
	private int[] myWallet = new int[7];
	//private ArrayList<Property> myProperty;
	private int position;
	private String gamePiece;
	
	/**
	 * Constructs a player object with default attributes.
	 */
	public Player()
	{
		this.myWallet = Money.setBills(); //this will set the players default cash amount
		//this.myProperty = new ArrayList<Property>(); //default no property
		this.position = 0; //start at go. 
		this.gamePiece = ""; //no piece. must be selected or given as random
	}
	
	/**
	 * Constructs a player object with default attributes and given name.
	 */
	public Player(String gamePiece)
	{
		this.myWallet = Money.setBills(); //this will set the players default cash amount
		//this.myProperty = new ArrayList<Property>(); //default no property
		this.position = 0; //start at go. 
		this.gamePiece = gamePiece; 
	}
	
	/**
	 * moves the player piece by given number of spaces. 
	 * @param numberOfSpaces the number of spaces to move the player by. 
	 */
	public void movePiece(int numberOfSpaces)
	{
		this.position += numberOfSpaces;
	}
	
	/**
	 * Returns a string representation of this player object
	 */
	public String toString()
	{
		return ("Game Piece: " + this.gamePiece + 
				"\rPosition: " + this.position +
				"\rMoney: $" + totalCash());
	}
	
	/**
	 * Retrieves the total amount of cash in the players wallet. 
	 * @return total amount of cash in the players wallet. 
	 */
	private int totalCash()
	{
		int thisSum = 0;
		for(int i=0; i<this.myWallet.length; i++)
		{
			thisSum += this.myWallet[i];
		}
		return thisSum;
	}
	
}
