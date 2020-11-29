package GUI;

import java.awt.event.ActionListener;

import javax.swing.*;


import clientSubSystem.LoginControl;
import gameInterface.GameLobbyControl;


public class GameLobbyPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	private JLabel errorLabel;

	public GameLobbyPanel(GameLobbyControl gl) {

		setLayout(null);
		
		JButton findGameButton = new JButton("Find Games");
		findGameButton.setBounds(107, 123, 115, 25);
		add(findGameButton);
		
		findGameButton.addActionListener((ActionListener) gl);

	}
	
	//setter for error text
	public void setError(String error)
	{
		errorLabel.setText(error);
	}
}
