package gameInterface;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import GUI.CharacterSelectPanel;
import GUI.GameLobbyPanel;
import clientSubSystem.GameClient;

public class GameLobbyControl implements ActionListener{
	
	private JPanel container;
	private GameClient client;
	
	public GameLobbyControl(JPanel container, GameClient client){
	    this.container = container;
	    this.client = client;
	}

	
	public void actionPerformed(ActionEvent e) {
	    // Get the name of the button clicked.
	    String command = e.getActionCommand();

	    // The Cancel button takes the user back to the initial panel.
	    if (command == "Find Games")
	    {
	      CardLayout cardLayout = (CardLayout)container.getLayout();
	      cardLayout.show(container, "1");
	    }
		
		
	}
	  
	public void displayError(String error) {
		GameLobbyPanel gameLobbyPanel = (GameLobbyPanel)container.getComponent(2);
		gameLobbyPanel.setError(error);
	}
	
}
