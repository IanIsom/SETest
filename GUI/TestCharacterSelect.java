package GUI;

import static org.junit.Assert.*;

import java.awt.CardLayout;

import gameInterface.CharacterSelectControl;
import javax.swing.JButton;
import javax.swing.JPanel;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clientSubSystem.GameClient;

public class TestCharacterSelect {
	
	 private static CharacterSelectPanel charSelect;
	 private JButton character;
	 private static GameClient game = new GameClient();

	  @BeforeClass
	  public static void setUp() 
	  {
		    CardLayout cardLayout = new CardLayout();
		    JPanel container = new JPanel(cardLayout);

		    CharacterSelectControl cs = new CharacterSelectControl(container, game);
		    charSelect = new CharacterSelectPanel(cs);
	    
	    
	    
	    
	  }
	  
	  @Before
	  public void setupBeforeTest()throws Exception
	  {
	    character = charSelect.getButtonAt(3, 1);
	    
	    Thread.sleep(5000);
	  }
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
