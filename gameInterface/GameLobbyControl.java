package gameInterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JPanel;
import GUI.*;
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
	        GameLobbyData data = new GameLobbyData("");
	    	try {
				client.sendToServer(data);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    }
		
		
	}
	
	  public void p1Found(CharacterData data)
	  {
		P1GameArenaPanel p1 = (P1GameArenaPanel)container.getComponent(5);
		
		System.out.println(data.getHp());
		p1.setChar1(data.getCharacter());
		p1.setHp1(data.getHp());

		
	    CardLayout cardLayout = (CardLayout)container.getLayout();
	    cardLayout.show(container, "6");
	  }
	  public void p2Found(CharacterData data)
	  {
		P2GameArenaPanel p2 = (P2GameArenaPanel)container.getComponent(6);
		
		System.out.println(data.getHp());
		p2.setChar2(data.getCharacter());
		p2.setHp2(data.getHp());

		
	    CardLayout cardLayout = (CardLayout)container.getLayout();
	    cardLayout.show(container, "7");
	  }
	  
	  public void finding() {
		    GameLobbyPanel gLobby = (GameLobbyPanel)container.getComponent(4);
		    gLobby.setFinding("Searching For Game...");
	  }

	
}
