package gameInterface;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import GUI.CharacterSelectPanel;
import GUI.CreateAccountPanel;
import GUI.LoginPanel;
import clientSubSystem.GameClient;

public class CharacterSelectControl implements ActionListener
{
	private JPanel container; 
	private GameClient client;
	
	public CharacterSelectControl(JPanel container, GameClient client) {
		this.container = container;
		this.client = client; 
	}

	
	public void actionPerformed(ActionEvent e) {
	    // Get the name of the button clicked.
	    String command = e.getActionCommand();

	    
	    // The Login button takes the user to the login panel.
	    if (command.equals("Choose Character 1"))
	    {
	      CardLayout cardLayout = (CardLayout)container.getLayout();
	      cardLayout.show(container, "5");
	     
	    }
	    
	    // The Create button takes the user to the create account panel.
	    else if (command.equals("Choose Character 2"))
	    {
		      CardLayout cardLayout = (CardLayout)container.getLayout();
		      cardLayout.show(container, "5");
	    }
	    
	    else if (command.equals("Choose Character 3"))
	    {
		      CardLayout cardLayout = (CardLayout)container.getLayout();
		      cardLayout.show(container, "5");
	    }
	    
	    else if (command.equals("Choose Character 4"))
	    {
		      CardLayout cardLayout = (CardLayout)container.getLayout();
		      cardLayout.show(container, "5");
	    }
		
	}
	
	public void CharacterSelectSuccess(){
		//more to be added soon
		
	}

	
}
