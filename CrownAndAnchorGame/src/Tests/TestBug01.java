package Tests;
/* Test Bug 01 - The game is not returning the correct amount back to the player when a bet is won.
 * By Shane Dissanayake 
 * 11516600
 * ITC205 - Assignment 4
 */

import static org.junit.Assert.*;

import CrownAndAnchorGame.Dice;
import CrownAndAnchorGame.DiceValue;
import CrownAndAnchorGame.Game;
import CrownAndAnchorGame.Player;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.mockito.Mock;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBug01 
{
	 //Variables
	  private Dice dice1_;
	  private Dice dice2_;
	  private Dice dice3_;
	  private Player player_;
	  private Game game_;
	  
	  
	  
	  @Before
	  public void setUp() throws Exception {
	    
	    dice1_ = mock(Dice.class);
	    dice2_ = mock(Dice.class);
	    dice3_ = mock(Dice.class);
	    
	    //Player Fred is set up with a balance of 100 and a limit of 0
	    player_ = new Player("Fred", 100);
	    int limit = 0;
	    player_.setLimit(limit);    
	  }

	  @After
	  public void tearDown() throws Exception {
	    dice1_ = null;
	    dice2_ = null;
	    dice3_ = null;
	    player_ = null;
	  }

	  
	  @Test
	  public void testsingleGame() {
	    // This will show one game phase
	    when(dice1_.getValue()).thenReturn(DiceValue.SPADE);
	    when(dice2_.getValue()).thenReturn(DiceValue.HEART);
	    when(dice3_.getValue()).thenReturn(DiceValue.CLUB);
	    
	    int bet = 5;
	    
	    testMatch_ =  new Game(dice1_, dice2_, dice_3);
	    System.out.println("Start Balance: " + player_.getBalance());
	    
	    DiceValue selection = DiceValue.CLUB;
	    int balance = player_.getBalance();
	    int winning = testMatch_.playRound(player_, selection, bet);
	    
	    ssertEquals(5, winning);
	    System.out.println("Player: " + player_.getName());
	    System.out.println("Chosen: " + chosen);
	    System.out.println("Bet: " + bet);
	    int bettingBalance = (balance - bet);
	    System.out.println("Balance is now: " + bettingBalance);
	    System.out.println("The Rolled is: " + testMatch_.getDiceValues());
	    System.out.println("The Winnings is: " + winning);
	    System.out.println();
	    System.out.println("Granted: Winnings " + winning + " and Bet " + bet);
	    
	    System.out.println("Rolled: " + testMatch_.getDiceValues());
	    System.out.println("Winnings: " + winning);
	    System.out.println("Granted: Winnings " + winning + " and Bet " + bet);
	    System.out.println("The current balance after 1 matche is: " + player_.getBalance());
	    System.out.println("The : " + (player_.getBalance() + bet));
	    System.out.println();
	    
	  }
	  
	  
	  @Test
	  public void testdoubleGame() 
	  {
	    when(dice1_.getValue()).thenReturn(DiceValue.SPADE);
	    when(dice2_.getValue()).thenReturn(DiceValue.SPADE);
	    when(dice3_.getValue()).thenReturn(DiceValue.HEART);
	    
	    int bet = 5;
	    
	    testMatch_ =  new Game(dice1_, dice2_, dice_3);
	    System.out.println("Start Balance: " + player_.getBalance());
	    
	    DiceValue selection = DiceValue.SPADE;
	    int balance = player_.getBalance();
	    int winning = testMatch_.playRound(player_, selection, bet);
	    
	    ssertEquals(10, winning);
	    System.out.println("Player: " + player_.getName());
	    System.out.println("Chosen: " + chosen);
	    System.out.println("Bet: " + bet);
	    int bettingBalance = (balance - bet);
	    System.out.println("Balance is now: " + bettingBalance);
	    System.out.println("The Rolled is: " + testMatch_.getDiceValues());
	    System.out.println("The Winnings is: " + winning);
	    System.out.println();
	    System.out.println("Granted: Winnings " + winning + " and Bet " + bet);
	    
	    System.out.println("Rolled: " + testMatch_.getDiceValues());
	    System.out.println("Winnings: " + winning);
	    System.out.println("Granted: Winnings " + winning + " and Bet " + bet);
	    System.out.println("The current balance after 2 matches is: " + player_.getBalance());
	    System.out.println("The : " + (player_.getBalance() + bet));
	    System.out.println();


	    
	  }
	  
	  
	  @Test
	  public void testThreeMatches() {
	    
	    when(d1_.getValue()).thenReturn(DiceValue.CLUB);
	    when(d2_.getValue()).thenReturn(DiceValue.CLUB);
	    when(d3_.getValue()).thenReturn(DiceValue.CLUB);
	    
	    int bet = 5;
	    testMatch_ =  new Game(dice1_, dice2_, dice_3);
	    System.out.println("Start Balance: " + player_.getBalance());
	    
	    DiceValue selection = DiceValue.CLUB;
	    int balance = player_.getBalance();
	    int winning = testMatch_.playRound(player_, selection, bet);
	    
	    ssertEquals(15, winning);
	    System.out.println("Player: " + player_.getName());
	    System.out.println("Chosen: " + chosen);
	    System.out.println("Bet: " + bet);
	    int bettingBalance = (balance - bet);
	    System.out.println("Balance is now: " + bettingBalance);
	    System.out.println("The Rolled is: " + testMatch_.getDiceValues());
	    System.out.println("The Winnings is: " + winning);
	    System.out.println();
	    System.out.println("Granted: Winnings " + winning + " and Bet " + bet);
	    
	    System.out.println("Rolled: " + testMatch_.getDiceValues());
	    System.out.println("Winnings: " + winning);
	    System.out.println("Granted: Winnings " + winning + " and Bet " + bet);
	    System.out.println("The current balance after 2 matches is: " + player_.getBalance());
	    System.out.println("The : " + (player_.getBalance() + bet));
	    System.out.println();
	    
	  }

	  
	}

}
