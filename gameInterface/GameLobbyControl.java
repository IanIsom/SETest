package gameInterface;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JPanel;

import GUI.CharacterSelectPanel;
import GUI.GameLobbyPanel;
import GUI.LoginData;
import GUI.LoginPanel;
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
	    if (command.equals("Find Games"))
	    {
	        GameLobbyPanel GameLobbyPanel = (GameLobbyPanel)container.getComponent(1);
	        GameLobbyData data = new GameLobbyData(command, command, command);
	    	try {
				client.sendToServer("find game");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    }
		
		
	}
	
	  public void gameFound()
	  {
	    CardLayout cardLayout = (CardLayout)container.getLayout();
	    cardLayout.show(container, "6");
	  }
	  
	public void displayError(String error) {
		GameLobbyPanel gameLobbyPanel = (GameLobbyPanel)container.getComponent(2);
		gameLobbyPanel.setError(error);
	}
	
}
