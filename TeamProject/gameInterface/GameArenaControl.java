package gameInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import GUI.GameArenaPanel;
import clientSubSystem.GameClient;

public class GameArenaControl implements ActionListener{

	private JPanel container;
	private GameClient client;
	
	public GameArenaControl(JPanel container, GameClient client) {
		this.container = container;
		this.client = client; 
	}
	
	
	public void actionPerformed(ActionEvent e) {
		//more to add later
		
	}
	
	
	public void displayError(String error) {
		GameArenaPanel gameArenaPanel = (GameArenaPanel)container.getComponent(2); //change the int value later
		gameArenaPanel.setError(error);
	}
	
	
}
