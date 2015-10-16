package Tests;
/* Test Bug 02 - The player is not reaching its game limit. 
 * By Shane Dissanayake 
 * 11516600
 * ITC205 - Assignment 4
 */

import Dice;
import Game;
import Player;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import org.junit.Before;

import org.junit.Test;
import org.mockito.Mockito;

public class TestBug03 
{
		 	private int winnings;
		    private String name;
		    private int balance;
		    private int limit;
		    private Player player;
		    
		    private int bet;
		    
		    private Dice dice1;
		    private Dice dice2;
		    private Dice dice3;
		    
		    private Game game;
		    
		    @Before
		    public void setUp() throws Exception {
			this.winnings = 0;
			this.name = "TesPlayer";
		    	this.balance = 15;
		    	this.bet = 5;
		    	this.limit = 0;

		        this.dice1 = Mockito.mock(Dice.class);
		        this.dice2 = Mockito.mock(Dice.class);
		        this.dice3 = Mockito.mock(Dice.class);
		        this.testGame = new Game(dice1, dice2, dice3);
		    }

		    @After
		    public void tearDown() throws Exception {
			this.winnings = 0;
			this.name = null;
		    	this.balance = 0;
		    	this.limit = 0;
		        this.player = null;
		        
		        this.bet = 0;
		        
		        this.dice1 = null;
		        this.dice2 = null;
		        this.dice3 = null;
		        
		    }
		  
		  @Test
			public void testTheory() {

				
				DiceValue[] rolls = new DiceValue[30];

		                //plays 30 games with random 
				int counter = 0;
				for (DiceValue d : rolls) {
					rolls[counter] = DiceValue.getRandom();
					System.out.println(counter + " - " + rolls[counter]);
					counter++;
				}

				// Searches for spades
				counter = 0;
				int match = 1;

				// Assert
				for (DiceValue d : rolls) {

					if (a == DiceValue.SPADE) {
						System.out.println("Spades: " + match);
						match++;
					}
					counter++;
				}

				assertTrue(match > 1); 

			}
}
