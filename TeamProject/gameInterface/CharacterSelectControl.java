package gameInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import GUI.CharacterSelectPanel;
import clientSubSystem.GameClient;

public class CharacterSelectControl implements ActionListener
{
	private JPanel container; 
	private GameClient client;
	
	public CharacterSelectControl(JPanel container, GameClient client) {
		this.container = container;
		this.client = client; 
	}

	
	public void actionPerformed(ActionEvent arg0) {
		//more to be added soon
		
	}
	
	public void CharacterSelectSuccess(){
		//more to be added soon
		
	}

	
}
