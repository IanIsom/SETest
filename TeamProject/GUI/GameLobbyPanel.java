package GUI;

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
		
		JList list = new JList();
		list.setBounds(64, 36, 156, 149);
		add(list);
		
		JLabel gameListLabel = new JLabel("Game List");
		gameListLabel.setBounds(64, 11, 73, 14);
		add(gameListLabel);
		
		JButton readyButton = new JButton("Ready To Play");
		readyButton.setBounds(74, 196, 132, 23);
		add(readyButton);
		
		JButton findGameButton = new JButton("Find Games");
		findGameButton.setBounds(147, 6, 115, 25);
		add(findGameButton);

	}
	
	//setter for error text
	public void setError(String error)
	{
		errorLabel.setText(error);
	}
}
