package gameInterface;

import javax.swing.JPanel;

import clientSubSystem.GameClient;

public class GameLobbyControl {
	
	  private JPanel container;
	  private GameClient client;
	
	  public GameLobbyControl(JPanel container, GameClient client){
	    this.container = container;
	    this.client = client;
	  }
	  
}
