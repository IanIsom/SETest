package gameInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JPanel;

import GUI.P1GameArenaPanel;
import GUI.P2GameArenaPanel;
import clientSubSystem.GameClient;

public class P2GameArenaControl implements ActionListener{

	private static JPanel container;
	private GameClient client;

	public P2GameArenaControl(JPanel container, GameClient client) {
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


	public static void dmgCalc(Object arg0) {
		P1GameArenaPanel p1 = (P1GameArenaPanel)container.getComponent(5);
		P2GameArenaPanel p2 = (P2GameArenaPanel)container.getComponent(6);
		p1.setHp1(p1.getHp1() - (double) arg0);
		p2.setHp1(p2.getHp2() - (double) arg0);
	}
}