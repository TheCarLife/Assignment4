package Tests;
/* Test Bug 02 - The player is not reaching its game limit. 
 * By Shane Dissanayake 
 * 11516600
 * ITC205 - Assignment 4
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBug02 
{
		// variables
		private static Player player_;
		
		
		//Testing
		@Before
		public void setUp() throws Exception
		{
			player_ = new Player("TestPlayer01", 0);
			player.setLimit(0);
		}
		
		@Test
		public void bug02Testing()
		{
			int bet = 5;
			System.out.println("Bet for all players: " + bet);
			System.out.println();
			
			player = new Player("TestPlayer01", 10);
		    System.out.println("TestPlayer01: " + player_.getName());
		    System.out.println("Balance of Player: " + player_.getBalance());
		    System.out.println("Does the current balance exceed the limit? " + player_.balanceExceedsLimitBy(bet));
		    System.out.println();
		    
		    player = new Player("TestPlayer02", 5);
		    System.out.println("TestPlayer02: " + player_.getName());
		    System.out.println("Balance of Player: " + playe_r.getBalance());
		    System.out.println("Does the current balance exceed the limit? " + player_.balanceExceedsLimitBy(bet));
		    System.out.println();
		    
		    player = new Player("TestPlayer03", 0);
		    System.out.println("TestPlayer03: " + player_.getName());
		    System.out.println("Balance of Player: " + player_.getBalance());
		    System.out.println("Does the current balance exceed the limit? " + player_.balanceExceedsLimitBy(bet));
		    
		    player = new Player("TestPlayer04", 0);
		    System.out.println("TestPlayer04: " + player_.getName());
		    System.out.println("Balance of Player: " + player_.getBalance());
		    System.out.println("Does the current balance exceed the limit? " + player_.balanceExceedsLimitBy(bet));
		}


}
