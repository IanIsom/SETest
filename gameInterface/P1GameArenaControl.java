package gameInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JPanel;

import GUI.P1GameArenaPanel;
import clientSubSystem.GameClient;

public class P1GameArenaControl implements ActionListener{

	private JPanel container;
	private GameClient client;
	
	public P1GameArenaControl(JPanel container, GameClient client) {
		this.container = container;
		this.client = client; 
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
	    // Get the name of the button clicked.
	    String command = e.getActionCommand();

	    // The Cancel button takes the user back to the initial panel.
	    if (command.equals("Attack"))
	    {
	    	try {
					client.sendToServer("Attack");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

	    }
	    else if(command.equals("Defend")) {
	    	try {
					client.sendToServer("Defend");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	    	
	    }
	    else if(command.equals("Quit Game")) {
	    	try {
				client.sendToServer("Player 1 Quit");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    	System.exit(0);
	    }
		
	}
	
	
	
	
}
